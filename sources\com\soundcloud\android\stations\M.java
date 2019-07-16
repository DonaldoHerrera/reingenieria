package com.soundcloud.android.stations;

import android.database.Cursor;

/* compiled from: BriteStationStorage.kt */
final class M<T> implements C6772kMa<Uda> {
    final /* synthetic */ B a;

    M(B b) {
        this.a = b;
    }

    public final Uda a(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        C3508cda i = this.a.i(cursor);
        String h = this.a.h(cursor);
        C7471uYa.a((Object) h, "it.type()");
        String f = this.a.f(cursor);
        C7471uYa.a((Object) f, "it.title()");
        Uda uda = new Uda(i, h, f, (String) this.a.d(cursor).d(), null, (String) this.a.a(cursor).d(), this.a.c(cursor), this.a.b(cursor), 16, null);
        return uda;
    }
}
