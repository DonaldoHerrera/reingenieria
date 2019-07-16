package com.soundcloud.android.playback;

/* compiled from: PlayQueueAdvancer_Factory */
public final class Xa implements C4961HMa<Wa> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C6834lGa> b;

    public Xa(C7054oVa<C3814lca> ova, C7054oVa<C6834lGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Xa a(C7054oVa<C3814lca> ova, C7054oVa<C6834lGa> ova2) {
        return new Xa(ova, ova2);
    }

    public Wa get() {
        return new Wa((C3814lca) this.a.get(), (C6834lGa) this.b.get());
    }
}
