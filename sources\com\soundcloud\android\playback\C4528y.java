package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.y reason: case insensitive filesystem */
/* compiled from: AccountChangedListener_Factory */
public final class C4528y implements C4961HMa<C4523x> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C4412qb> b;
    private final C7054oVa<HPa> c;

    public C4528y(C7054oVa<C5327TLa> ova, C7054oVa<C4412qb> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4528y a(C7054oVa<C5327TLa> ova, C7054oVa<C4412qb> ova2, C7054oVa<HPa> ova3) {
        return new C4528y(ova, ova2, ova3);
    }

    public C4523x get() {
        return new C4523x((C5327TLa) this.a.get(), (C4412qb) this.b.get(), (HPa) this.c.get());
    }
}
