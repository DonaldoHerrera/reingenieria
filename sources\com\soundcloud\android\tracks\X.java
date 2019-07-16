package com.soundcloud.android.tracks;

/* compiled from: MediaStreamsDatabaseOpenHelper.kt */
public final class X extends a {
    public X() {
        super(2);
    }

    public void a(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
        if (i == 2 && i2 == 1) {
            ud.g("DROP TABLE IF EXISTS DownloadedMediaStreams");
        } else {
            super.a(ud, i, i2);
            throw null;
        }
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
        if (i2 == 2) {
            ud.g("CREATE TABLE IF NOT EXISTS DownloadedMediaStreams (\n    urn TEXT NOT NULL,\n    preset TEXT NOT NULL,\n    quality TEXT NOT NULL,\n    mime_type TEXT NOT NULL,\n    PRIMARY KEY (urn, quality) ON CONFLICT REPLACE\n)");
        }
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE IF NOT EXISTS MediaStreams (\n    urn TEXT NOT NULL,\n    payload TEXT NOT NULL,\n    PRIMARY KEY (urn) ON CONFLICT REPLACE\n)");
        ud.g("CREATE TABLE IF NOT EXISTS DownloadedMediaStreams (\n    urn TEXT NOT NULL,\n    preset TEXT NOT NULL,\n    quality TEXT NOT NULL,\n    mime_type TEXT NOT NULL,\n    PRIMARY KEY (urn, quality) ON CONFLICT REPLACE\n)");
    }
}
