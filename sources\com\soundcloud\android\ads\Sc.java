package com.soundcloud.android.ads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.Arrays;
import java.util.List;

/* compiled from: PrestitialAdapter */
class Sc extends androidx.viewpager.widget.a {
    private final X c;
    private final com.soundcloud.android.ads.Zc.a d;
    private final bd e;
    private final dd f;
    private List<a> g = Arrays.asList(new a[]{a.OPT_IN_CARD, a.VIDEO_CARD, a.END_CARD});

    /* compiled from: PrestitialAdapter */
    enum a {
        OPT_IN_CARD(l.sponsored_session_action_page, p.ads_opt_in_text, p.ads_no_thanks, p.ads_watch_now),
        VIDEO_CARD(l.sponsored_session_video_page, -1, -1, -1),
        END_CARD(l.sponsored_session_action_page, p.ads_sponsored_session_unlocked, p.ads_learn_more, p.ads_start_session);
        
        final int e;
        final int f;
        final int g;
        final int h;

        private a(int i, int i2, int i3, int i4) {
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(a aVar) {
            return this == aVar;
        }
    }

    Sc(X x, com.soundcloud.android.ads.Zc.a aVar, dd ddVar, bd bdVar) {
        this.c = x;
        this.d = aVar;
        this.e = bdVar;
        this.f = ddVar;
    }

    public int a() {
        return this.g.size();
    }

    /* access modifiers changed from: 0000 */
    public a e(int i) {
        return (a) this.g.get(i);
    }

    public final Object a(ViewGroup viewGroup, int i) {
        return a(i, viewGroup, (a) this.g.get(i));
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    private ViewGroup a(int i, ViewGroup viewGroup, a aVar) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(aVar.e, viewGroup, false);
        int i2 = Rc.a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.e.a((View) viewGroup2, this.c, this.d, aVar);
        } else if (i2 == 3) {
            this.f.a((View) viewGroup2, this.c, this.d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Ad page not supported: ");
            sb.append(aVar);
            sb.append(", pos:");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        }
        viewGroup.addView(viewGroup2);
        return viewGroup2;
    }

    public boolean a(View view, Object obj) {
        return view.equals(obj);
    }
}
