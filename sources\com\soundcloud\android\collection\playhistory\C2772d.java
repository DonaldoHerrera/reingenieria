package com.soundcloud.android.collection.playhistory;

import android.database.Cursor;

/* renamed from: com.soundcloud.android.collection.playhistory.d reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2772d implements C6772kMa {
    public static final /* synthetic */ C2772d a = new C2772d();

    private /* synthetic */ C2772d() {
    }

    public final Object a(Cursor cursor) {
        return C3508cda.d(cursor.getLong(cursor.getColumnIndex("track_id")));
    }
}
