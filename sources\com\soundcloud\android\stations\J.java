package com.soundcloud.android.stations;

import android.database.Cursor;

/* compiled from: BriteStationStorage.kt */
final class J<T> implements C6772kMa<Rda> {
    final /* synthetic */ B a;

    J(B b) {
        this.a = b;
    }

    public final Rda a(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        C3508cda i = this.a.i(cursor);
        String f = this.a.f(cursor);
        C7471uYa.a((Object) f, "it.title()");
        String h = this.a.h(cursor);
        C7471uYa.a((Object) h, "it.type()");
        Rda rda = new Rda(i, f, h, (String) this.a.d(cursor).d(), (String) this.a.a(cursor).d());
        return rda;
    }
}
