package com.soundcloud.android.stations;

import android.database.Cursor;

/* compiled from: BriteStationStorage.kt */
final class K<T> implements C6772kMa<Tda> {
    final /* synthetic */ B a;

    K(B b) {
        this.a = b;
    }

    public final Tda a(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        return new Tda(this.a.g(cursor), this.a.e(cursor));
    }
}
