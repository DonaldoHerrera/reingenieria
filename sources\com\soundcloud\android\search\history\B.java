package com.soundcloud.android.search.history;

import android.database.Cursor;

/* compiled from: SearchHistoryStorage.kt */
final class B<T> implements C6772kMa<String> {
    public static final B a = new B();

    B() {
    }

    public final String a(Cursor cursor) {
        C7471uYa.b(cursor, "it");
        return cursor.getString(0);
    }
}
