package com.soundcloud.android.offline;

/* compiled from: OfflineDatabaseOpenHelper.kt */
public final class Kd extends a {
    public Kd() {
        super(1);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE track_downloads (\n    urn TEXT NOT NULL PRIMARY KEY,\n    requested_at INTEGER DEFAULT CURRENT_TIMESTAMP,\n    downloaded_at INTEGER DEFAULT NULL,\n    removed_at INTEGER DEFAULT NULL,\n    unavailable_at INTEGER DEFAULT NULL\n  )");
    }
}
