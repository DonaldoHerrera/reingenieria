package com.soundcloud.android.collection.recentlyplayed;

import android.database.Cursor;
import com.soundcloud.android.collection.recentlyplayed.G.c;

/* compiled from: RecentlyPlayedModel */
class H implements C6772kMa<Long> {
    final /* synthetic */ c a;

    H(c cVar) {
        this.a = cVar;
    }

    public Long a(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
