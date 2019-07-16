package com.soundcloud.android.stations;

import android.database.Cursor;

/* compiled from: BriteStationStorage.kt */
final class I<T> implements C6772kMa<Qda> {
    final /* synthetic */ B a;

    I(B b) {
        this.a = b;
    }

    public final Qda a(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        Qda qda = new Qda(this.a.i(cursor), this.a.f(cursor), this.a.h(cursor), C6918mWa.a(), (String) this.a.d(cursor).b(), Integer.valueOf(this.a.c(cursor)), this.a.a(cursor));
        return qda;
    }
}
