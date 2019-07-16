package defpackage;

import android.database.Cursor;

/* renamed from: DFa reason: default package and case insensitive filesystem */
/* compiled from: FollowingModel */
class C4830DFa implements C6772kMa<Long> {
    final /* synthetic */ e a;

    C4830DFa(e eVar) {
        this.a = eVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
