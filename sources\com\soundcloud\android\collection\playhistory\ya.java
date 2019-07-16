package com.soundcloud.android.collection.playhistory;

/* compiled from: PlayHistorySyncProvider_Factory */
public final class ya implements C4961HMa<xa> {
    private final C7054oVa<za> a;
    private final C7054oVa<va> b;

    public ya(C7054oVa<za> ova, C7054oVa<va> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static ya a(C7054oVa<za> ova, C7054oVa<va> ova2) {
        return new ya(ova, ova2);
    }

    public xa get() {
        return new xa(this.a, (va) this.b.get());
    }
}
