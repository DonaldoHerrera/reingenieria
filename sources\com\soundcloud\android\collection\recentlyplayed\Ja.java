package com.soundcloud.android.collection.recentlyplayed;

/* compiled from: RecentlyPlayedSyncProvider_Factory */
public final class Ja implements C4961HMa<Ia> {
    private final C7054oVa<Ka> a;
    private final C7054oVa<Ga> b;

    public Ja(C7054oVa<Ka> ova, C7054oVa<Ga> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ja a(C7054oVa<Ka> ova, C7054oVa<Ga> ova2) {
        return new Ja(ova, ova2);
    }

    public Ia get() {
        return new Ia(this.a, (Ga) this.b.get());
    }
}
