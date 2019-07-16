package com.soundcloud.android.stations;

/* compiled from: StationDatabaseOpenHelper.kt */
public final class Ja extends a {
    public Ja() {
        super(1);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE station (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    urn TEXT NOT NULL,\n    type TEXT,\n    title TEXT,\n    permalink TEXT,\n    artwork_url_template TEXT,\n    last_played_track_position INTEGER DEFAULT NULL,\n    play_queue_updated_at INTEGER DEFAULT CURRENT_TIMESTAMP,\n    UNIQUE(urn) ON CONFLICT REPLACE\n)");
        ud.g("CREATE TABLE station_collections (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    station_urn TEXT NOT NULL,\n    collection_type INTEGER NOT NULL,\n    position INTEGER,\n    added_at INTEGER,\n    removed_at INTEGER,\n    UNIQUE(station_urn, collection_type) ON CONFLICT IGNORE,\n    FOREIGN KEY(station_urn) REFERENCES station(urn)\n)");
        ud.g("CREATE TABLE station_play_queues (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    station_urn TEXT NOT NULL,\n    track_urn TEXT NOT NULL,\n    query_urn TEXT,\n    track_position INTEGER DEFAULT 0,\n    UNIQUE(station_urn, track_urn, track_position) ON CONFLICT REPLACE,\n    FOREIGN KEY(station_urn) REFERENCES station(urn)\n)");
    }
}
