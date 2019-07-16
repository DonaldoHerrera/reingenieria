package com.soundcloud.android.player.ui.waveform;

import java.lang.ref.WeakReference;

/* compiled from: WaveformViewController.kt */
final class l extends C7540vYa implements _Xa<d, RVa> {
    final /* synthetic */ h a;
    final /* synthetic */ WeakReference b;

    l(h hVar, WeakReference weakReference) {
        this.a = hVar;
        this.b = weakReference;
        super(1);
    }

    public final void a(d dVar) {
        C7471uYa.b(dVar, "it");
        this.a.q = true;
        WaveformView waveformView = (WaveformView) this.b.get();
        this.a.v.a(dVar, this.a.p, this.a.j());
        Jna c = this.a.r;
        if (c != null && c.a()) {
            this.a.v.c();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return RVa.a;
    }
}
