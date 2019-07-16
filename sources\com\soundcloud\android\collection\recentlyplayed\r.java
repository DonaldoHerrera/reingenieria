package com.soundcloud.android.collection.recentlyplayed;

/* compiled from: RecentlyPlayedCleanupHelper_Factory */
public final class r implements C4961HMa<C2828q> {
    private final C7054oVa<Ga> a;

    public r(C7054oVa<Ga> ova) {
        this.a = ova;
    }

    public static r a(C7054oVa<Ga> ova) {
        return new r(ova);
    }

    public C2828q get() {
        return new C2828q((Ga) this.a.get());
    }
}
