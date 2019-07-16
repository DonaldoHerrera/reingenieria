package defpackage;

import android.database.Cursor;

/* renamed from: Xxa reason: default package and case insensitive filesystem */
/* compiled from: StationPlayQueuesModel */
class C5458Xxa implements C6772kMa<C3508cda> {
    final /* synthetic */ c a;

    C5458Xxa(c cVar) {
        this.a = cVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.c.decode(cursor.getString(0));
    }
}
