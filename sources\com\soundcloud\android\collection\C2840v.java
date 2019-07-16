package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.v reason: case insensitive filesystem */
/* compiled from: CollectionDatabaseOpenHelper.kt */
public final class C2840v extends a {
    public C2840v() {
        super(2);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
        if (i2 == 2) {
            ud.g("CREATE TABLE IF NOT EXISTS RecentlyPlayed (\n    timestamp INTEGER NOT NULL,\n    context_type INTEGER NOT NULL,\n    context_id INTEGER NOT NULL,\n    synced INTEGER DEFAULT 0,\n    PRIMARY KEY (timestamp, context_type, context_id)\n\n)");
        }
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE IF NOT EXISTS PlayHistory (\n    timestamp INTEGER NOT NULL,\n    track_id INTEGER NOT NULL,\n    synced INTEGER DEFAULT 0,\n    PRIMARY KEY (timestamp, track_id)\n)");
        ud.g("CREATE TABLE IF NOT EXISTS RecentlyPlayed (\n    timestamp INTEGER NOT NULL,\n    context_type INTEGER NOT NULL,\n    context_id INTEGER NOT NULL,\n    synced INTEGER DEFAULT 0,\n    PRIMARY KEY (timestamp, context_type, context_id)\n\n)");
    }
}
