package com.soundcloud.android.collection.recentlyplayed;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.e reason: case insensitive filesystem */
/* compiled from: ClearRecentlyPlayedCommand_Factory */
public final class C2807e implements C4961HMa<C2805d> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<Ga> b;

    public C2807e(C7054oVa<dfa> ova, C7054oVa<Ga> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2807e a(C7054oVa<dfa> ova, C7054oVa<Ga> ova2) {
        return new C2807e(ova, ova2);
    }

    public C2805d get() {
        return new C2805d((dfa) this.a.get(), (Ga) this.b.get());
    }
}
