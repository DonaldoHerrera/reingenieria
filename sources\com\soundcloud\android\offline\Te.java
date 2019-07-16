package com.soundcloud.android.offline;

/* compiled from: TrackOfflineStateProvider_Factory */
public final class Te implements C4961HMa<Se> {
    private final C7054oVa<De> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<HPa> c;

    public Te(C7054oVa<De> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Te a(C7054oVa<De> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3) {
        return new Te(ova, ova2, ova3);
    }

    public Se get() {
        return new Se((De) this.a.get(), (C5327TLa) this.b.get(), (HPa) this.c.get());
    }
}
