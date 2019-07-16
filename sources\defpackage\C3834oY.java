package defpackage;

import com.soundcloud.android.sync.la;
import com.soundcloud.android.sync.na;

/* renamed from: oY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryDatabaseOpenHelper.kt */
public final class C3834oY extends a {
    private final la b;

    public C3834oY(la laVar) {
        C7471uYa.b(laVar, "syncStateStorage");
        super(8);
        this.b = laVar;
    }

    private final void e(Ud ud) {
        ud.g("DROP TABLE IF EXISTS selection_item");
        ud.g("DROP TABLE IF EXISTS single_content_selection_card");
        ud.g("DROP TABLE IF EXISTS multiple_content_selection_card");
        ud.g("DROP TABLE IF EXISTS promoted_track_card");
        ud.g("DROP TABLE IF EXISTS discovery_card");
        ud.g("DROP TABLE IF EXISTS system_playlists_tracks");
        ud.g("DROP TABLE IF EXISTS system_playlist");
        c(ud);
    }

    public void b(Ud ud, int i, int i2) {
        C7471uYa.b(ud, "db");
        this.b.a(na.DISCOVERY_CARDS);
        try {
            ud.z();
            e(ud);
            ud.B();
        } finally {
            ud.C();
        }
    }

    public void c(Ud ud) {
        C7471uYa.b(ud, "db");
        ud.g("CREATE TABLE selection_item (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    selection_urn TEXT NOT NULL,\n    urn TEXT,\n    artwork_url_template TEXT,\n    artwork_style TEXT,\n    count INTEGER,\n    short_title TEXT,\n    short_subtitle TEXT,\n    web_link TEXT,\n    app_link TEXT\n  )");
        ud.g("CREATE TABLE single_content_selection_card (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    urn TEXT NOT NULL,\n    query_urn TEXT,\n    parent_query_urn TEXT,\n    style TEXT,\n    title TEXT,\n    description TEXT,\n    tracking_feature_name TEXT,\n    social_proof TEXT,\n    social_proof_avatar_urls TEXT NOT NULL\n  )");
        ud.g("CREATE TABLE multiple_content_selection_card (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    urn TEXT NOT NULL,\n    query_urn TEXT,\n    parent_query_urn TEXT,\n    style TEXT,\n    title TEXT,\n    description TEXT,\n    tracking_feature_name TEXT\n  )");
        ud.g("CREATE TABLE promoted_track_card (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    created_at INTEGER NOT NULL,\n    track_urn TEXT NOT NULL,\n    promoter_urn TEXT,\n    urn TEXT NOT NULL,\n    tracking_track_clicked_urls TEXT NOT NULL,\n    tracking_profile_clicked_urls TEXT NOT NULL,\n    tracking_promoter_clicked_urls TEXT NOT NULL,\n    tracking_track_played_urls TEXT NOT NULL,\n    tracking_track_impression_urls TEXT NOT NULL,\n    monetization_type TEXT NOT NULL\n)");
        ud.g("CREATE TABLE discovery_card (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    single_selection_card_id INTEGER,\n    multiple_selection_card_id INTEGER\n  )");
        ud.g("CREATE TABLE system_playlist (\n    urn TEXT NOT NULL,\n    query_urn TEXT,\n    title TEXT,\n    description TEXT,\n    artwork_url_template TEXT,\n    tracking_feature_name TEXT,\n    last_updated INTEGER,\n    PRIMARY KEY(urn) ON CONFLICT REPLACE\n)");
        ud.g("CREATE TABLE system_playlists_tracks (\n    system_playlist_urn TEXT NOT NULL,\n    track_urn TEXT NOT NULL,\n    position INTEGER NOT NULL,\n    PRIMARY KEY(system_playlist_urn, track_urn),\n    FOREIGN KEY (system_playlist_urn)\n        REFERENCES system_playlist(urn)\n)");
    }
}
