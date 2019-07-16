package com.soundcloud.android.tracks;

import com.soundcloud.android.accounts.C2526g;

/* compiled from: TrackOverflowMenuActionsFactory.kt */
public class Na {
    private final C2526g a;

    public Na(C2526g gVar) {
        C7471uYa.b(gVar, "accountOperations");
        this.a = gVar;
    }

    public Ma a(C6185ma maVar) {
        C7471uYa.b(maVar, "trackItem");
        boolean b = this.a.b(maVar.e());
        boolean z = !maVar.m();
        Ma ma = new Ma(z || b, C6155ca.a.a(z && !b, maVar.p()), z || b, z, maVar.L(), !maVar.K());
        return ma;
    }
}
