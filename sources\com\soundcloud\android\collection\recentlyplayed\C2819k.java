package com.soundcloud.android.collection.recentlyplayed;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.k reason: case insensitive filesystem */
/* compiled from: PushRecentlyPlayedCommand_Factory */
public final class C2819k implements C4961HMa<C2817j> {
    private final C7054oVa<Ga> a;
    private final C7054oVa<dfa> b;

    public C2819k(C7054oVa<Ga> ova, C7054oVa<dfa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2819k a(C7054oVa<Ga> ova, C7054oVa<dfa> ova2) {
        return new C2819k(ova, ova2);
    }

    public C2817j get() {
        return new C2817j((Ga) this.a.get(), (dfa) this.b.get());
    }
}
