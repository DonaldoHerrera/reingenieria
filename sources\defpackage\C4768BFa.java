package defpackage;

import android.database.Cursor;

/* renamed from: BFa reason: default package and case insensitive filesystem */
/* compiled from: FollowingModel */
class C4768BFa implements C6772kMa<C3508cda> {
    final /* synthetic */ e a;

    C4768BFa(e eVar) {
        this.a = eVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.b.decode(cursor.getString(0));
    }
}
