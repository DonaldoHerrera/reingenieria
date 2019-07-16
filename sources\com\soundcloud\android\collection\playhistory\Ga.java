package com.soundcloud.android.collection.playhistory;

/* compiled from: PushPlayHistoryCommand_Factory */
public final class Ga implements C4961HMa<Fa> {
    private final C7054oVa<va> a;
    private final C7054oVa<dfa> b;

    public Ga(C7054oVa<va> ova, C7054oVa<dfa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ga a(C7054oVa<va> ova, C7054oVa<dfa> ova2) {
        return new Ga(ova, ova2);
    }

    public Fa get() {
        return new Fa((va) this.a.get(), (dfa) this.b.get());
    }
}
