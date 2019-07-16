package com.soundcloud.android.tracks;

import android.database.Cursor;
import com.soundcloud.android.tracks.C6149aa.d;

/* renamed from: com.soundcloud.android.tracks.ba reason: case insensitive filesystem */
/* compiled from: MediaStreamsModel */
class C6152ba implements C6772kMa<C3508cda> {
    final /* synthetic */ d a;

    C6152ba(d dVar) {
        this.a = dVar;
    }

    public C3508cda a(Cursor cursor) {
        return (C3508cda) this.a.b.decode(cursor.getString(0));
    }
}
