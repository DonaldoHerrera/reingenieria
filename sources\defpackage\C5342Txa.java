package defpackage;

import android.database.Cursor;

/* renamed from: Txa reason: default package and case insensitive filesystem */
/* compiled from: StationModel */
class C5342Txa implements C6772kMa<C3508cda> {
    final /* synthetic */ d a;

    C5342Txa(d dVar) {
        this.a = dVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.b.decode(cursor.getString(0));
    }
}
