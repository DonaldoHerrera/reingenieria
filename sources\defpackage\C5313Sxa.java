package defpackage;

import android.database.Cursor;

/* renamed from: Sxa reason: default package and case insensitive filesystem */
/* compiled from: StationModel */
class C5313Sxa implements C6772kMa<C3508cda> {
    final /* synthetic */ d a;

    C5313Sxa(d dVar) {
        this.a = dVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.b.decode(cursor.getString(0));
    }
}
