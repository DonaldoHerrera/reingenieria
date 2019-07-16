package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.comscore.streaming.ContentType;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Tea reason: default package */
/* compiled from: DatabaseManager */
public class Tea extends SQLiteOpenHelper {
    private static final AtomicReference<Uea> a = new AtomicReference<>();
    private static long b = 0;
    @SuppressLint({"StaticFieldLeak"})
    private static Tea c;
    private final Context d;
    private final boolean e;
    private final C3469VY f;

    @Deprecated
    public Tea(Context context, C3469VY vy, boolean z) {
        super(context, "SoundCloud", null, 130);
        this.d = context;
        this.e = z;
        this.f = vy;
    }

    private boolean A(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY AUTOINCREMENT,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body VARCHAR(255));", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 59);
            return false;
        }
    }

    private boolean B(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 60);
            return false;
        }
    }

    private boolean C(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(f.c.name(), "CREATE TABLE IF NOT EXISTS TrackPolicies (track_id INTEGER, monetizable BOOLEAN DEFAULT 0,blocked BOOLEAN DEFAULT 0,snipped BOOLEAN DEFAULT 0,syncable BOOLEAN DEFAULT 1,sub_mid_tier BOOLEAN DEFAULT 0,sub_high_tier BOOLEAN DEFAULT 0,policy TEXT NOT NULL,monetization_model TEXT,last_updated INTEGER, PRIMARY KEY (track_id) ON CONFLICT REPLACE );", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 62);
            return false;
        }
    }

    private boolean D(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 63);
            return false;
        }
    }

    private boolean E(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(f.c.name(), "CREATE TABLE IF NOT EXISTS TrackPolicies (track_id INTEGER, monetizable BOOLEAN DEFAULT 0,blocked BOOLEAN DEFAULT 0,snipped BOOLEAN DEFAULT 0,syncable BOOLEAN DEFAULT 1,sub_mid_tier BOOLEAN DEFAULT 0,sub_high_tier BOOLEAN DEFAULT 0,policy TEXT NOT NULL,monetization_model TEXT,last_updated INTEGER, PRIMARY KEY (track_id) ON CONFLICT REPLACE );", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 64);
            return false;
        }
    }

    private boolean F(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), sQLiteDatabase);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,entity_id INTEGER,entity_type INTEGER,reposter_id INTEGER,related_entity TEXT,source TEXT,source_version TEXT,source_urn TEXT,query_urn TEXT,context_type TEXT,context_urn TEXT,context_query TEXT,played BOOLEAN default 1);");
            return true;
        } catch (SQLException e2) {
            a(e2, i, 66);
            return false;
        }
    }

    private boolean G(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("SoundAssociationView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 67);
            return false;
        }
    }

    private boolean H(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("SoundAssociationView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 68);
            return false;
        }
    }

    private boolean I(SQLiteDatabase sQLiteDatabase, int i) {
        return true;
    }

    private boolean J(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 70);
            return false;
        }
    }

    private boolean K(SQLiteDatabase sQLiteDatabase, int i) {
        return true;
    }

    private boolean L(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 72);
            return false;
        }
    }

    private boolean M(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 78);
            return false;
        }
    }

    private boolean N(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(h.c.name(), "CREATE TABLE IF NOT EXISTS Users (_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),first_name VARCHAR(255),last_name VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),artist_station TEXT,plan VARCHAR(16),primary_email_confirmed INTEGER,visual_url VARCHAR(255),is_pro BOOLEAN,track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,signup_date INTEGER DEFAULT -1,last_updated INTEGER);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 81);
            return false;
        }
    }

    private boolean O(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("CollectionItems", sQLiteDatabase);
            Zea.a("CollectionPages", sQLiteDatabase);
            Zea.a("Connections", sQLiteDatabase);
            Zea.a("RecentStations", sQLiteDatabase);
            Zea.a("Recordings", sQLiteDatabase);
            Zea.a("Searches", sQLiteDatabase);
            Zea.a("Suggestions", sQLiteDatabase);
            Zea.a("TrackMetadata", sQLiteDatabase);
            Zea.a(a.c.name(), "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY AUTOINCREMENT,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body VARCHAR(255));", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 82);
            return false;
        }
    }

    private boolean P(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("Shortcuts", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 88);
            return false;
        }
    }

    private boolean Q(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(h.c.name(), "CREATE TABLE IF NOT EXISTS Users (_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),first_name VARCHAR(255),last_name VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),artist_station TEXT,plan VARCHAR(16),primary_email_confirmed INTEGER,visual_url VARCHAR(255),is_pro BOOLEAN,track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,signup_date INTEGER DEFAULT -1,last_updated INTEGER);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 93);
            return false;
        }
    }

    private boolean R(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,entity_id INTEGER,entity_type INTEGER,reposter_id INTEGER,related_entity TEXT,source TEXT,source_version TEXT,source_urn TEXT,query_urn TEXT,context_type TEXT,context_urn TEXT,context_query TEXT,played BOOLEAN default 1);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 94);
            return false;
        }
    }

    public static Tea a(Context context, C3469VY vy, boolean z) {
        if (c == null) {
            c = new Tea(context, vy, z);
        }
        return c;
    }

    private boolean a(int i) {
        return true;
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        for (Yea name : f()) {
            Zea.b(name.name(), sQLiteDatabase);
        }
        for (_ea c2 : d()) {
            Zea.c(c2, sQLiteDatabase);
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(h.c.name(), "CREATE TABLE IF NOT EXISTS Users (_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),first_name VARCHAR(255),last_name VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),artist_station TEXT,plan VARCHAR(16),primary_email_confirmed INTEGER,visual_url VARCHAR(255),is_pro BOOLEAN,track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,signup_date INTEGER DEFAULT -1,last_updated INTEGER);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 108);
            return false;
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        b a2 = SDb.a("DatabaseManager");
        StringBuilder sb = new StringBuilder();
        sb.append("onRecreate(");
        sb.append(sQLiteDatabase);
        sb.append(")");
        a2.a(sb.toString(), new Object[0]);
        for (Yea name : e()) {
            Zea.a(name.name(), sQLiteDatabase);
        }
        Zea.a("RecentStations", sQLiteDatabase);
        for (_ea c2 : c()) {
            Zea.c(c2, sQLiteDatabase);
        }
        b(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    private boolean e(SQLiteDatabase sQLiteDatabase) {
        try {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(new SQLException("Failed to recreate views", e2));
            return false;
        }
    }

    private boolean f(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(h.c.name(), "CREATE TABLE IF NOT EXISTS Users (_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),first_name VARCHAR(255),last_name VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),artist_station TEXT,plan VARCHAR(16),primary_email_confirmed INTEGER,visual_url VARCHAR(255),is_pro BOOLEAN,track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,signup_date INTEGER DEFAULT -1,last_updated INTEGER);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 115);
            return false;
        }
    }

    private boolean g(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 118);
            return false;
        }
    }

    private boolean h() {
        return true;
    }

    private boolean h(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("Recommendations", sQLiteDatabase);
            Zea.a("RecommendationSeeds", sQLiteDatabase);
            Zea.a("RecommendedPlaylistBucket", sQLiteDatabase);
            Zea.a("RecommendedPlaylist", sQLiteDatabase);
            Zea.a("Charts", sQLiteDatabase);
            Zea.a("ChartTracks", sQLiteDatabase);
            this.d.deleteFile("storage_newforyou");
            return true;
        } catch (SQLException e2) {
            a(e2, i, 119);
            return false;
        }
    }

    private boolean i() {
        return true;
    }

    private boolean i(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, (int) ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND);
            return false;
        }
    }

    private boolean j() {
        return true;
    }

    private boolean j(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("UsersView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, (int) ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
            return false;
        }
    }

    private boolean k(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("TrackDownloads", sQLiteDatabase);
            Zea.a("OfflineContent", sQLiteDatabase);
            Zea.a("UserAssociations", sQLiteDatabase);
            Zea.a("Collections", sQLiteDatabase);
            Zea.b("PlaylistTracksView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, (int) ContentType.USER_GENERATED_LIVE);
            return false;
        }
    }

    private boolean l(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 124);
            return false;
        }
    }

    private boolean m(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("SuggestedCreators", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 125);
            return false;
        }
    }

    private boolean n(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("Stations", sQLiteDatabase);
            Zea.a("StationsCollections", sQLiteDatabase);
            Zea.a("StationsPlayQueues", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 127);
            return false;
        }
    }

    private boolean o(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("PlaylistView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 128);
            return false;
        }
    }

    private boolean p(SQLiteDatabase sQLiteDatabase, int i) {
        return true;
    }

    private boolean q(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(_ea.PlaylistTracks, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 37);
            return false;
        }
    }

    private boolean r(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            sQLiteDatabase.execSQL(d.c.b());
            return true;
        } catch (SQLException e2) {
            a(e2, i, 38);
            return false;
        }
    }

    private boolean s(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            sQLiteDatabase.execSQL(f.c.b());
            c(sQLiteDatabase);
            Zea.a(e.c.name(), "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 39);
            return false;
        }
    }

    private boolean t(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a((Yea) d.c, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 40);
            return false;
        }
    }

    private boolean u(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.d(_ea.PromotedTracks, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 41);
            return false;
        }
    }

    private boolean v(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(_ea.PromotedTracks, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 43);
            return false;
        }
    }

    private boolean w(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(f.c.name(), "CREATE TABLE IF NOT EXISTS TrackPolicies (track_id INTEGER, monetizable BOOLEAN DEFAULT 0,blocked BOOLEAN DEFAULT 0,snipped BOOLEAN DEFAULT 0,syncable BOOLEAN DEFAULT 1,sub_mid_tier BOOLEAN DEFAULT 0,sub_high_tier BOOLEAN DEFAULT 0,policy TEXT NOT NULL,monetization_model TEXT,last_updated INTEGER, PRIMARY KEY (track_id) ON CONFLICT REPLACE );", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 44);
            return false;
        }
    }

    private boolean x(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,entity_id INTEGER,entity_type INTEGER,reposter_id INTEGER,related_entity TEXT,source TEXT,source_version TEXT,source_urn TEXT,query_urn TEXT,context_type TEXT,context_urn TEXT,context_query TEXT,played BOOLEAN default 1);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 47);
            return false;
        }
    }

    private boolean y(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a((Yea) a.c, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 48);
            return false;
        }
    }

    private boolean z(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a((Yea) a.c, sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 51);
            return false;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b a2 = SDb.a("DatabaseManager");
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate(");
        sb.append(sQLiteDatabase);
        sb.append(")");
        a2.a(sb.toString(), new Object[0]);
        try {
            for (Yea b2 : e()) {
                sQLiteDatabase.execSQL(b2.b());
            }
            for (_ea b3 : c()) {
                Zea.b(b3, sQLiteDatabase);
            }
            a(sQLiteDatabase);
        } catch (SQLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        b = System.currentTimeMillis();
        String str = "DatabaseManager";
        b a2 = SDb.a(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        a2.a(sb.toString(), new Object[0]);
        if (i2 > i) {
            sQLiteDatabase.beginTransaction();
            if (i >= 35) {
                int i3 = i;
                z = false;
                while (i3 < i2) {
                    i3++;
                    switch (i3) {
                        case 36:
                            z = p(sQLiteDatabase, i);
                            continue;
                        case 37:
                            z = q(sQLiteDatabase, i);
                            continue;
                        case 38:
                            z = r(sQLiteDatabase, i);
                            continue;
                        case 39:
                            z = s(sQLiteDatabase, i);
                            continue;
                        case 40:
                            z = t(sQLiteDatabase, i);
                            continue;
                        case 41:
                            z = u(sQLiteDatabase, i);
                            continue;
                        case 43:
                            z = v(sQLiteDatabase, i);
                            continue;
                        case 44:
                            z = w(sQLiteDatabase, i);
                            continue;
                        case 45:
                            z = h();
                            continue;
                        case 47:
                            z = x(sQLiteDatabase, i);
                            continue;
                        case 48:
                            z = y(sQLiteDatabase, i);
                            continue;
                        case 49:
                        case 50:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 61:
                        case 73:
                        case 74:
                        case 77:
                        case 84:
                        case 86:
                        case 87:
                        case 113:
                        case 114:
                        case 126:
                        case 129:
                        case 130:
                            z = true;
                            continue;
                        case 51:
                            z = z(sQLiteDatabase, i);
                            continue;
                        case 59:
                            z = A(sQLiteDatabase, i);
                            continue;
                        case 60:
                            z = B(sQLiteDatabase, i);
                            continue;
                        case 62:
                            z = C(sQLiteDatabase, i);
                            continue;
                        case 63:
                            z = D(sQLiteDatabase, i);
                            continue;
                        case 64:
                            z = E(sQLiteDatabase, i);
                            continue;
                        case 66:
                            z = F(sQLiteDatabase, i);
                            continue;
                        case 67:
                            z = G(sQLiteDatabase, i);
                            continue;
                        case 68:
                            z = H(sQLiteDatabase, i);
                            continue;
                        case 69:
                            z = I(sQLiteDatabase, i);
                            continue;
                        case 70:
                            z = J(sQLiteDatabase, i);
                            continue;
                        case 71:
                            z = K(sQLiteDatabase, i);
                            continue;
                        case 72:
                            z = L(sQLiteDatabase, i);
                            continue;
                        case 78:
                            z = M(sQLiteDatabase, i);
                            continue;
                        case 81:
                            z = N(sQLiteDatabase, i);
                            continue;
                        case 82:
                            z = O(sQLiteDatabase, i);
                            continue;
                        case 88:
                            z = P(sQLiteDatabase, i);
                            continue;
                        case 92:
                            z = i();
                            continue;
                        case 93:
                            z = Q(sQLiteDatabase, i);
                            continue;
                        case 94:
                            z = R(sQLiteDatabase, i);
                            continue;
                        case 98:
                            z = j();
                            continue;
                        case 103:
                            z = a(sQLiteDatabase, i);
                            continue;
                        case 104:
                            z = b(sQLiteDatabase, i);
                            continue;
                        case 108:
                            z = c(sQLiteDatabase, i);
                            continue;
                        case 110:
                            z = d(sQLiteDatabase, i);
                            continue;
                        case 112:
                            z = e(sQLiteDatabase, i);
                            continue;
                        case 115:
                            z = f(sQLiteDatabase, i);
                            continue;
                        case 118:
                            z = g(sQLiteDatabase, i);
                            continue;
                        case 119:
                            z = a(i);
                            continue;
                        case 120:
                            z = h(sQLiteDatabase, i);
                            continue;
                        case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /*121*/:
                            z = i(sQLiteDatabase, i);
                            continue;
                        case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /*122*/:
                            z = j(sQLiteDatabase, i);
                            continue;
                        case ContentType.USER_GENERATED_LIVE /*123*/:
                            z = k(sQLiteDatabase, i);
                            continue;
                        case 124:
                            z = l(sQLiteDatabase, i);
                            continue;
                        case 125:
                            z = m(sQLiteDatabase, i);
                            continue;
                        case 127:
                            z = n(sQLiteDatabase, i);
                            continue;
                        case 128:
                            z = o(sQLiteDatabase, i);
                            continue;
                    }
                    if (!z) {
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                SDb.a(str).d("successful db recreating views", new Object[0]);
                z = e(sQLiteDatabase);
            }
            if (z) {
                SDb.a(str).d("successful db upgrade", new Object[0]);
                a.set(Uea.a(g()));
            } else {
                SDb.a(str).f("upgrade not successful, recreating db", new Object[0]);
                d(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return;
        }
        d(sQLiteDatabase);
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        List asList = Arrays.asList(new String[]{"_id", "monetizable", "policy"});
        Zea.a(sQLiteDatabase, f.c.name(), Arrays.asList(new String[]{f.d.d(), f.e.d(), f.j.d()}), e.c.name(), asList);
    }

    private List<Yea> f() {
        return Arrays.asList(new Yea[]{c.c, g.c});
    }

    private long g() {
        return System.currentTimeMillis() - b;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        for (_ea b2 : d()) {
            Zea.b(b2, sQLiteDatabase);
        }
        for (Yea b3 : f()) {
            sQLiteDatabase.execSQL(b3.b());
        }
    }

    private boolean e(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a("Waveforms", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 112);
            return false;
        }
    }

    public Uea b() {
        return (Uea) a.getAndSet(null);
    }

    private boolean b(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.a(a.c.name(), "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,entity_id INTEGER,entity_type INTEGER,reposter_id INTEGER,related_entity TEXT,source TEXT,source_version TEXT,source_urn TEXT,query_urn TEXT,context_type TEXT,context_urn TEXT,context_query TEXT,played BOOLEAN default 1);", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 104);
            return false;
        }
    }

    private List<Yea> e() {
        return Arrays.asList(new Yea[]{h.c, e.c, f.c, b.c, d.c, a.c});
    }

    public void a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        for (Yea name : e()) {
            a(name.name(), writableDatabase);
        }
        for (_ea name2 : c()) {
            a(name2.name(), writableDatabase);
        }
    }

    private boolean d(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("SearchSuggestions", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 110);
            return false;
        }
    }

    private List<_ea> d() {
        return C2063HD.a(C1943BD.b(Arrays.asList(_ea.values()), Rea.a));
    }

    private List<_ea> c() {
        return C2063HD.a(C1943BD.b(Arrays.asList(_ea.values()), Sea.a));
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            Zea.b("UserAssociationView", sQLiteDatabase);
            return true;
        } catch (SQLException e2) {
            a(e2, i, 103);
            return false;
        }
    }

    private void a(SQLException sQLException, int i, int i2) {
        String format = String.format(Locale.US, "error during upgrade%d (from %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
        a.set(Uea.a(i, i2, g(), sQLException.getMessage()));
        a(new SQLException(format, sQLException));
    }

    @SuppressLint({"sc.SilentExceptionUsage"})
    private void a(SQLException sQLException) {
        if (this.e) {
            this.f.a(sQLException, new HVa[0]);
            return;
        }
        throw sQLException;
    }

    private void a(String str, SQLiteDatabase sQLiteDatabase) {
        SDb.a("DatabaseManager").a("clearing %s", str);
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        sQLiteDatabase.execSQL(sb.toString());
    }

    static /* synthetic */ boolean a(_ea _ea) {
        return !_ea.m;
    }
}
