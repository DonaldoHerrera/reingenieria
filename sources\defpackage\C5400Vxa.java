package defpackage;

import android.database.Cursor;

/* renamed from: Vxa reason: default package and case insensitive filesystem */
/* compiled from: StationPlayQueuesModel */
class C5400Vxa implements C6772kMa<Long> {
    final /* synthetic */ c a;

    C5400Vxa(c cVar) {
        this.a = cVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
