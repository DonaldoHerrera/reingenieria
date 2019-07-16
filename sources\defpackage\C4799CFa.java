package defpackage;

import android.database.Cursor;

/* renamed from: CFa reason: default package and case insensitive filesystem */
/* compiled from: FollowingModel */
class C4799CFa implements C6772kMa<Long> {
    final /* synthetic */ e a;

    C4799CFa(e eVar) {
        this.a = eVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
