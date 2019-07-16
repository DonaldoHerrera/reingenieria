package defpackage;

import android.database.Cursor;

/* renamed from: TY reason: default package and case insensitive filesystem */
/* compiled from: SystemPlaylistsTracksModel */
class C3463TY implements C6772kMa<C3508cda> {
    final /* synthetic */ d a;

    C3463TY(d dVar) {
        this.a = dVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.c.decode(cursor.getString(0));
    }
}
