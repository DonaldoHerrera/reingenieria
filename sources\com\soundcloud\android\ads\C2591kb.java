package com.soundcloud.android.ads;

/* renamed from: com.soundcloud.android.ads.kb reason: case insensitive filesystem */
/* compiled from: AdsTimerController_Factory */
public final class C2591kb implements C4961HMa<C2587jb> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<Ia> b;
    private final C7054oVa<Yb> c;

    public C2591kb(C7054oVa<HPa> ova, C7054oVa<Ia> ova2, C7054oVa<Yb> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2591kb a(C7054oVa<HPa> ova, C7054oVa<Ia> ova2, C7054oVa<Yb> ova3) {
        return new C2591kb(ova, ova2, ova3);
    }

    public C2587jb get() {
        return new C2587jb((HPa) this.a.get(), (Ia) this.b.get(), C4930GMa.a(this.c));
    }
}
