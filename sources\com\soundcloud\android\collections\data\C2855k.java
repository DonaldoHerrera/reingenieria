package com.soundcloud.android.collections.data;

import android.content.Context;
import androidx.room.s;
import androidx.room.t;

/* renamed from: com.soundcloud.android.collections.data.k reason: case insensitive filesystem */
/* compiled from: CollectionsDataModule.kt */
public final class C2855k {
    public static final C2855k a = new C2855k();

    private C2855k() {
    }

    @NXa
    public static final CollectionsDatabase a(Context context) {
        C7471uYa.b(context, "context");
        t b = s.a(context, CollectionsDatabase.class, "collections.db").b();
        C7471uYa.a((Object) b, "Room.databaseBuilder(con…\"collections.db\").build()");
        return (CollectionsDatabase) b;
    }

    @NXa
    public static final ca b(CollectionsDatabase collectionsDatabase) {
        C7471uYa.b(collectionsDatabase, "collectionsDatabase");
        return new ca(collectionsDatabase.n());
    }

    @NXa
    public static final aa a(CollectionsDatabase collectionsDatabase) {
        C7471uYa.b(collectionsDatabase, "collectionsDatabase");
        return new aa(collectionsDatabase.n());
    }
}
