package defpackage;

import android.database.Cursor;

/* renamed from: Qxa reason: default package and case insensitive filesystem */
/* compiled from: StationCollectionsModel */
class C5253Qxa implements C6772kMa<C3508cda> {
    final /* synthetic */ d a;

    C5253Qxa(d dVar) {
        this.a = dVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.b.decode(cursor.getString(0));
    }
}
