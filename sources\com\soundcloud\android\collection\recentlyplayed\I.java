package com.soundcloud.android.collection.recentlyplayed;

import android.database.Cursor;
import com.soundcloud.android.collection.recentlyplayed.G.c;

/* compiled from: RecentlyPlayedModel */
class I implements C6772kMa<Long> {
    final /* synthetic */ c a;

    I(c cVar) {
        this.a = cVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
