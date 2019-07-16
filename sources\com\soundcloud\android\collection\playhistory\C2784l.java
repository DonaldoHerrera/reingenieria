package com.soundcloud.android.collection.playhistory;

/* renamed from: com.soundcloud.android.collection.playhistory.l reason: case insensitive filesystem */
/* compiled from: ClearPlayHistoryCommand_Factory */
public final class C2784l implements C4961HMa<C2783k> {
    private final C7054oVa<va> a;
    private final C7054oVa<dfa> b;

    public C2784l(C7054oVa<va> ova, C7054oVa<dfa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2784l a(C7054oVa<va> ova, C7054oVa<dfa> ova2) {
        return new C2784l(ova, ova2);
    }

    public C2783k get() {
        return new C2783k((va) this.a.get(), (dfa) this.b.get());
    }
}
