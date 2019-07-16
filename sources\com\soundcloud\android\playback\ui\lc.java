package com.soundcloud.android.playback.ui;

/* compiled from: TrackPagePresenter */
class lc implements a {
    final /* synthetic */ a a;
    final /* synthetic */ mc b;

    lc(mc mcVar, a aVar) {
        this.b = mcVar;
        this.a = aVar;
    }

    public void a(boolean z) {
        this.b.c(this.a, true);
        this.b.e(this.a, false);
        this.a.z.d();
        if (z) {
            C5466YFa.a(this.a.T);
            this.a.v.setVisibility(8);
        }
    }

    public void b(boolean z) {
        this.b.c(this.a, false);
        this.b.e(this.a, true);
        this.a.z.i();
        if (z) {
            C5466YFa.b(this.a.T);
            this.b.o.a(this.a.j);
        }
    }
}
