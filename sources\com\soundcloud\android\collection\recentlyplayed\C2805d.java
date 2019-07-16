package com.soundcloud.android.collection.recentlyplayed;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.d reason: case insensitive filesystem */
/* compiled from: ClearRecentlyPlayedCommand */
public class C2805d extends C1255eT<Void, Boolean> {
    private final dfa a;
    private final Ga b;

    C2805d(dfa dfa, Ga ga) {
        this.a = dfa;
        this.b = ga;
    }

    public Boolean a(Void voidR) {
        boolean g = this.a.a(hfa.a(C2226PO.CLEAR_RECENTLY_PLAYED.a()).c().b()).g();
        if (g) {
            this.b.a();
        }
        return Boolean.valueOf(g);
    }
}
