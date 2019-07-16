package com.soundcloud.android.upgrade;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: GoOnboardingAdapter */
class e extends androidx.viewpager.widget.a implements androidx.viewpager.widget.ViewPager.e {
    private WeakHashMap<Integer, AnimationDrawable> c = new WeakHashMap<>(b.values().length);
    private List<b> d;
    private a e;

    /* compiled from: GoOnboardingAdapter */
    interface a {
        void a(b bVar);
    }

    /* compiled from: GoOnboardingAdapter */
    enum b {
        WELCOME_GO_PLUS(l.go_onboarding_landing, h.go_onboarding_cloud, p.go_onboarding_landing_title, p.go_onboarding_landing_body, h.onboarding_bg_welcome),
        WELCOME_GO(l.go_onboarding_landing, h.go_onboarding_cloud, p.go_onboarding_landing_title_mid, p.go_onboarding_landing_body, h.onboarding_bg_welcome),
        FULL_TRACKS(l.go_onboarding_page, h.go_onboarding_preview, p.go_onboarding_full_tracks_title, p.go_onboarding_full_tracks_body, h.onboarding_bg_play_a),
        NO_ADS(l.go_onboarding_page, h.go_onboarding_no_ads, p.go_onboarding_no_ads_title, p.go_onboarding_no_ads_body, h.onboarding_bg_listen_b),
        OFFLINE(l.go_onboarding_page, h.go_onboarding_offline, p.go_onboarding_offline_title, p.go_onboarding_offline_body, h.onboarding_bg_play_b),
        START(l.go_onboarding_page, h.go_onboarding_heartburst, p.go_onboarding_start_title, p.go_onboarding_start_body, h.onboarding_bg_lets_go);
        
        final int h;
        final int i;
        final int j;
        final int k;
        final int l;

        private b(int i2, int i3, int i4, int i5, int i6) {
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.l = i6;
        }
    }

    e() {
    }

    public void a(int i) {
    }

    public void a(int i, float f, int i2) {
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public boolean a(View view, Object obj) {
        return view == obj;
    }

    public void b(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            ((AnimationDrawable) this.c.get(Integer.valueOf(i))).start();
        }
        this.e.a((b) this.d.get(i));
    }

    /* access modifiers changed from: 0000 */
    public void a(C2455aV aVVar) {
        if (aVVar == C2455aV.MID_TIER) {
            this.d = Arrays.asList(new b[]{b.WELCOME_GO, b.OFFLINE, b.NO_ADS});
            return;
        }
        this.d = Arrays.asList(new b[]{b.WELCOME_GO_PLUS, b.FULL_TRACKS, b.OFFLINE, b.NO_ADS, b.START});
    }

    public Object a(ViewGroup viewGroup, int i) {
        return a(i, viewGroup, (b) this.d.get(i));
    }

    private ViewGroup a(int i, ViewGroup viewGroup, b bVar) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(bVar.h, viewGroup, false);
        a(i, bVar, viewGroup2);
        viewGroup.addView(viewGroup2);
        return viewGroup2;
    }

    private void a(int i, b bVar, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) viewGroup.findViewById(i.tooltip_image);
        imageView.setImageResource(bVar.i);
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            this.c.put(Integer.valueOf(i), (AnimationDrawable) drawable);
        }
        ((TextView) viewGroup.findViewById(i.go_onboarding_title)).setText(bVar.j);
        ((TextView) viewGroup.findViewById(i.go_onboarding_body)).setText(bVar.k);
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int a() {
        return this.d.size();
    }
}
