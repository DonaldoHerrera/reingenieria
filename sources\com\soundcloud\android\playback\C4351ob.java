package com.soundcloud.android.playback;

import android.database.Cursor;

/* renamed from: com.soundcloud.android.playback.ob reason: case insensitive filesystem */
/* compiled from: PlayQueueModel */
class C4351ob implements C6772kMa<String> {
    public String a(Cursor cursor) {
        if (cursor.isNull(0)) {
            return null;
        }
        return cursor.getString(0);
    }
}
