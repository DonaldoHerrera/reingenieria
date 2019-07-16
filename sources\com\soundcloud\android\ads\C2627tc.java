package com.soundcloud.android.ads;

/* renamed from: com.soundcloud.android.ads.tc reason: case insensitive filesystem */
/* compiled from: PlayerAdsControllerProxy.kt */
final class C2627tc<T> implements C6776kQa<C4928GKa<kd>> {
    final /* synthetic */ C2568ec a;

    C2627tc(C2568ec ecVar) {
        this.a = ecVar;
    }

    /* renamed from: a */
    public final void accept(C4928GKa<kd> gKa) {
        C7471uYa.a((Object) gKa, "it");
        if (gKa.c()) {
            Yb yb = (Yb) this.a.b().get();
            Object b = gKa.b();
            C7471uYa.a(b, "it.get()");
            yb.a((kd) b);
        }
    }
}
