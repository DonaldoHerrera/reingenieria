package com.soundcloud.android.collection.recentlyplayed;

import android.database.Cursor;
import com.soundcloud.android.collection.playhistory.ua;

/* compiled from: RecentlyPlayedStorage.kt */
final class Da extends C7540vYa implements _Xa<Cursor, ua> {
    final /* synthetic */ Ga a;

    Da(Ga ga) {
        this.a = ga;
        super(1);
    }

    /* renamed from: a */
    public final ua invoke(Cursor cursor) {
        C7471uYa.b(cursor, "cursor");
        return ua.a(this.a.b(cursor, "timestamp"), ua.a(this.a.a(cursor, "context_type"), this.a.b(cursor, "context_id")));
    }
}
