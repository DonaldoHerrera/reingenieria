package com.soundcloud.android.ads;

import android.content.res.Resources;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.view.CircularProgressBar;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: SponsoredSessionVideoView */
class dd extends Zc {
    private TextView a;
    protected TextureView b;
    private CircularProgressBar c;
    protected View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    View l;
    TextView m;
    private View n;
    private final Resources o;
    private final Ga p;
    private Iterable<View> q = Collections.emptyList();

    dd(Resources resources, Ga ga) {
        this.o = resources;
        this.p = ga;
    }

    private void c(View view) {
        this.a = (TextView) view.findViewById(i.why_ads);
        this.b = (TextureView) view.findViewById(i.video_view);
        this.c = (CircularProgressBar) view.findViewById(i.video_progress);
        this.d = view.findViewById(i.viewability_layer);
        this.e = view.findViewById(i.video_container);
        this.f = view.findViewById(i.video_overlay_container);
        this.g = view.findViewById(i.video_overlay);
        this.h = view.findViewById(i.letterbox_background);
        this.i = view.findViewById(i.player_play);
        this.j = view.findViewById(i.player_next);
        this.k = view.findViewById(i.player_previous);
        this.l = view.findViewById(i.skip_ad);
        this.m = (TextView) view.findViewById(i.time_until_skip);
        this.n = view.findViewById(i.advertisement);
    }

    public void a(View view, X x, a aVar) {
        Iterable<View> iterable;
        c(view);
        C6768kIa.a((Iterable<View>) Arrays.asList(new View[]{this.j, this.k, this.i, this.g, this.l}));
        a(aVar);
        a(x, aVar);
        if (x.p().M()) {
            iterable = Arrays.asList(new View[]{this.a, this.n});
        } else {
            iterable = this.q;
        }
        this.q = iterable;
        this.p.a(x.p().I()).a((C7733yKa<? super T>) new L<Object>(this));
    }

    private LayoutParams b(aa aaVar) {
        LayoutParams layoutParams = this.b.getLayoutParams();
        if (aaVar.M()) {
            int g2 = aaVar.D().g();
            float f2 = (float) g2;
            float b2 = (float) aaVar.D().b();
            float a2 = a(this.e, f2, b2);
            layoutParams.width = (int) (f2 * a2);
            layoutParams.height = (int) (b2 * a2);
        } else {
            layoutParams.width = this.e.getWidth() - (C6768kIa.a(this.o, 5) * 2);
            layoutParams.height = (int) (((float) layoutParams.width) * aaVar.K());
        }
        return layoutParams;
    }

    public /* synthetic */ void a(a aVar) {
        a(aVar.j());
    }

    private void a(X x, a aVar) {
        aVar.a(this.b, this.d, x.p());
    }

    private void a(a aVar) {
        O o2 = new O(aVar);
        this.i.setOnClickListener(o2);
        this.g.setOnClickListener(o2);
        this.b.setOnClickListener(o2);
        this.a.setOnClickListener(new P(aVar));
        this.l.setOnClickListener(new N(aVar));
    }

    private void b() {
        C6768kIa.a(this.q, (C7733yKa<View>) new M<View>(this));
    }

    public /* synthetic */ void b(View view) {
        view.setAnimation(AnimationUtils.loadAnimation(this.b.getContext(), ia.a.ak_delayed_fade_out));
        view.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    public void a(aa aaVar) {
        LayoutParams b2 = b(aaVar);
        this.b.setLayoutParams(b2);
        this.d.setLayoutParams(b2);
        this.f.setLayoutParams(b2);
        this.h.setLayoutParams(b2);
        this.h.setVisibility(aaVar.M() ? 8 : 0);
    }

    private float a(View view, float f2, float f3) {
        int width = view.getWidth();
        float height = (float) view.getHeight();
        float f4 = (float) width;
        return ((f2 * height) > (f3 * f4) ? 1 : ((f2 * height) == (f3 * f4) ? 0 : -1)) > 0 ? height / f3 : f4 / f2;
    }

    public void a(C4431ub ubVar) {
        boolean k2 = ubVar.k();
        boolean z = true;
        boolean z2 = ubVar.j() || k2;
        if (this.b.getVisibility() != 0) {
            z = false;
        }
        int i2 = 8;
        this.i.setVisibility(k2 ? 0 : 8);
        this.g.setVisibility(k2 ? 0 : 8);
        CircularProgressBar circularProgressBar = this.c;
        if (ubVar.f()) {
            i2 = 0;
        }
        circularProgressBar.setVisibility(i2);
        if (ubVar.j()) {
            b();
        } else if (ubVar.i()) {
            a();
        }
        if (!z && z2) {
            this.b.setVisibility(0);
        }
    }

    private void a() {
        C6768kIa.a(this.q, (C7733yKa<View>) K.a);
    }

    static /* synthetic */ void a(View view) {
        view.clearAnimation();
        view.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(Long l2, Long l3) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(l3.longValue());
        int min = Math.min(60, seconds) - ((int) TimeUnit.MILLISECONDS.toSeconds(l2.longValue()));
        a(min <= 0);
        if (min > 0) {
            a(min, seconds);
        }
    }

    private void a(boolean z) {
        int i2 = 0;
        this.l.setVisibility(z ? 0 : 8);
        TextView textView = this.m;
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    private void a(int i2, int i3) {
        String a2 = C7315sGa.a(this.o, (long) i2, TimeUnit.SECONDS);
        if (i3 > 60) {
            a2 = this.o.getString(p.ads_skip_in_time, new Object[]{a2});
        }
        this.m.setText(a2);
    }
}
