package com.soundcloud.android.collection.playhistory;

import android.database.Cursor;
import com.soundcloud.android.collection.playhistory.V.c;

/* compiled from: PlayHistoryModel */
class Y implements C6772kMa<Long> {
    final /* synthetic */ c a;

    Y(c cVar) {
        this.a = cVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
