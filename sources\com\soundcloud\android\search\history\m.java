package com.soundcloud.android.search.history;

/* compiled from: SearchHistoryDatabaseOpenHelper.kt */
public final class m extends a {
    public m() {
        super(1);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE search_history (\n    search_term TEXT NOT NULL PRIMARY KEY ON CONFLICT REPLACE,\n    timestamp INTEGER NOT NULL\n)");
    }
}
