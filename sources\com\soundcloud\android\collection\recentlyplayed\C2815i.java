package com.soundcloud.android.collection.recentlyplayed;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.i reason: case insensitive filesystem */
/* compiled from: FetchRecentlyPlayedCommand_Factory */
public final class C2815i implements C4961HMa<C2813h> {
    private final C7054oVa<dfa> a;

    public C2815i(C7054oVa<dfa> ova) {
        this.a = ova;
    }

    public static C2815i a(C7054oVa<dfa> ova) {
        return new C2815i(ova);
    }

    public C2813h get() {
        return new C2813h((dfa) this.a.get());
    }
}
