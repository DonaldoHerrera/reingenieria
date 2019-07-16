package com.soundcloud.android.collection.playhistory;

import android.database.Cursor;

/* renamed from: com.soundcloud.android.collection.playhistory.e reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2774e implements C6772kMa {
    public static final /* synthetic */ C2774e a = new C2774e();

    private /* synthetic */ C2774e() {
    }

    public final Object a(Cursor cursor) {
        return ua.a(cursor.getLong(cursor.getColumnIndex("timestamp")), C3508cda.d(cursor.getLong(cursor.getColumnIndex("track_id"))), C3508cda.a);
    }
}
