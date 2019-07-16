package defpackage;

@Deprecated
/* renamed from: _ea reason: default package */
/* compiled from: Table */
public enum _ea implements C5116MLa {
    SoundStream(false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,sound_id INTEGER, sound_type INTEGER,reposter_id INTEGER,promoted_id INTEGER,created_at INTEGER,FOREIGN KEY(sound_id) REFERENCES Sounds(_id) );"),
    PromotedTracks(false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,created_at INTEGER,ad_urn TEXT, promoter_id INTEGER,promoter_name TEXT,tracking_track_clicked_urls TEXT,tracking_profile_clicked_urls TEXT,tracking_promoter_clicked_urls TEXT,tracking_track_played_urls TEXT,tracking_track_impression_urls TEXT);"),
    Activities(false, "(_id INTEGER PRIMARY KEY AUTOINCREMENT,uuid VARCHAR(255),user_id INTEGER,sound_id INTEGER,sound_type INTEGER,comment_id INTEGER,type String,tags VARCHAR(255),created_at INTEGER,content_id INTEGER,sharing_note_text VARCHAR(255),sharing_note_created_at INTEGER,UNIQUE (created_at, type, content_id, sound_id, user_id));"),
    PlaylistTracks(a.a("_id", "position", "playlist_id"), false, "(playlist_id INTEGER, track_id INTEGER,position INTEGER,added_at INTEGER,removed_at INTEGER,PRIMARY KEY (track_id, position, playlist_id) ON CONFLICT IGNORE);"),
    SoundView(true, Vea.a),
    SoundStreamView(true, Vea.b),
    ActivityView(true, Vea.c);
    
    public final a i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    private _ea(boolean z, String str) {
        this(r8, r9, a.a("_id"), z, str);
    }

    public static String a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE ");
        sb.append(z ? "VIEW" : "TABLE");
        sb.append(" IF NOT EXISTS ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public String toString() {
        return name();
    }

    private _ea(a aVar, boolean z, String str) {
        this.i = aVar;
        this.m = z;
        if (str != null) {
            this.j = a(name(), str, z);
        } else {
            this.j = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        String str2 = ".";
        sb.append(str2);
        sb.append("_id");
        this.k = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(str2);
        sb2.append("_type");
        this.l = sb2.toString();
    }

    public a a() {
        return this.i;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }
}
