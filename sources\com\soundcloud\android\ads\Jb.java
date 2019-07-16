package com.soundcloud.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.playback.ke.b;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;
import com.soundcloud.android.view.AspectRatioTextureView;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: FullScreenVideoView */
class Jb {
    private final ke a;
    private final Resources b;
    private C4928GKa<a> c = C4928GKa.a();
    private Iterable<View> d = Collections.emptyList();
    private AspectRatioTextureView e;
    private View f;
    private View g;
    private View h;
    private RoundedColorButton i;
    private View j;
    private View k;

    /* compiled from: FullScreenVideoView */
    interface a {
        void b(Context context);

        void s();

        void w();
    }

    Jb(ke keVar, Resources resources) {
        this.a = keVar;
        this.b = resources;
    }

    private void c(View view) {
        this.e = (AspectRatioTextureView) view.findViewById(i.video_view);
        this.f = view.findViewById(i.player_play);
        this.g = view.findViewById(i.video_progress);
        this.h = view.findViewById(i.video_shrink_control);
        this.i = (RoundedColorButton) view.findViewById(i.cta_button);
        this.j = view.findViewById(i.video_gradient);
        this.k = view.findViewById(i.viewability_layer);
    }

    /* access modifiers changed from: 0000 */
    public void a(AppCompatActivity appCompatActivity, aa aaVar) {
        c(appCompatActivity.findViewById(16908290));
        Ma.a((U) aaVar, this.b, this.i);
        this.e.setAspectRatio(aaVar.K());
        this.d = Arrays.asList(new View[]{this.i, this.h, this.j});
        c();
        a();
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
        this.c = C4928GKa.c(aVar);
    }

    private void b() {
        C6768kIa.a(this.d, (C7733yKa<View>) new C2624t<View>(this));
    }

    public /* synthetic */ void b(View view) {
        view.setAnimation(AnimationUtils.loadAnimation(this.e.getContext(), com.soundcloud.android.ia.a.ak_delayed_fade_out));
        view.setVisibility(4);
    }

    private void c() {
        this.c.a((C7733yKa<? super T>) new C2640x<Object>(this));
    }

    public /* synthetic */ void a(a aVar) {
        C2628u uVar = new C2628u(aVar);
        this.e.setOnClickListener(uVar);
        this.f.setOnClickListener(uVar);
        this.h.setOnClickListener(new C2636w(aVar));
        this.i.setOnClickListener(new C2632v(aVar));
    }

    /* access modifiers changed from: 0000 */
    public void a(C4431ub ubVar) {
        int i2 = 8;
        this.f.setVisibility((ubVar.k() || ubVar.m()) ? 0 : 8);
        View view = this.g;
        if (ubVar.f()) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (ubVar.j()) {
            b();
        } else if (ubVar.i()) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, b bVar) {
        this.a.a(str, bVar, this.e, this.k);
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        this.a.b(bVar);
    }

    private void a() {
        C6768kIa.a(this.d, (C7733yKa<View>) C2620s.a);
    }

    static /* synthetic */ void a(View view) {
        view.clearAnimation();
        view.setVisibility(0);
    }
}
