package defpackage;

/* renamed from: bfa reason: default package */
/* compiled from: Tables */
public interface bfa {

    /* renamed from: bfa$a */
    /* compiled from: Tables */
    public static class a extends Yea {
        public static final a c = new a();
        public static final C5085LLa d = C5085LLa.a(c, "_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "urn", String.class);
        public static final C5085LLa f = C5085LLa.a(c, "user_id", Long.class);
        public static final C5085LLa g = C5085LLa.a(c, "track_id", Long.class);
        public static final C5085LLa h = C5085LLa.a(c, "timestamp", Long.class);
        public static final C5085LLa i = C5085LLa.a(c, "created_at", Long.class);
        public static final C5085LLa j = C5085LLa.a(c, "body", String.class);

        a() {
            super("Comments", defpackage.C5116MLa.a.a("_id"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY AUTOINCREMENT,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body VARCHAR(255));";
        }
    }

    /* renamed from: bfa$b */
    /* compiled from: Tables */
    public static class b extends Yea {
        public static final b c = new b();
        public static final C5085LLa d = C5085LLa.a(c, "_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "_type", Long.class);
        public static final C5085LLa f = C5085LLa.a(c, "created_at", Long.class);
        public static final C5085LLa g = C5085LLa.a(c, "added_at", Long.class);
        public static final C5085LLa h = C5085LLa.a(c, "removed_at", Long.class);

        b() {
            super("Likes", defpackage.C5116MLa.a.a("_id", "_type"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS Likes (_id INTEGER NOT NULL,_type INTEGER NOT NULL,created_at INTEGER NOT NULL,added_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));";
        }
    }

    /* renamed from: bfa$c */
    /* compiled from: Tables */
    public static class c extends Yea {
        public static final c c = new c();
        public static final C5085LLa d = C5085LLa.a(c, "pv_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "pv_title", String.class);
        public static final C5085LLa f = C5085LLa.a(c, "pv_username", String.class);
        public static final C5085LLa g = C5085LLa.a(c, "pv_user_id", Long.class);
        public static final C5085LLa h = C5085LLa.a(c, "pv_creator_is_pro", Boolean.class);
        public static final C5085LLa i = C5085LLa.a(c, "pv_track_count", Long.class);
        public static final C5085LLa j = C5085LLa.a(c, "pv_duration", Long.class);
        public static final C5085LLa k = C5085LLa.a(c, "pv_likes_count", Long.class);
        public static final C5085LLa l = C5085LLa.a(c, "pv_reposts_count", Long.class);
        public static final C5085LLa m = C5085LLa.a(c, "pv_sharing", String.class);
        public static final C5085LLa n = C5085LLa.a(c, "pv_artwork_url", String.class);
        public static final C5085LLa o = C5085LLa.a(c, "pv_permalink_url", String.class);
        public static final C5085LLa p = C5085LLa.a(c, "pv_genre", String.class);
        public static final C5085LLa q = C5085LLa.a(c, "pv_tag_list", String.class);
        public static final C5085LLa r = C5085LLa.a(c, "pv_created_at", Long.class);
        public static final C5085LLa s = C5085LLa.a(c, "pv_release_date", String.class);
        public static final C5085LLa t = C5085LLa.a(c, "pv_secret_token", String.class);
        public static final C5085LLa u = C5085LLa.a(c, "pv_set_type", String.class);
        public static final C5085LLa v = C5085LLa.a(c, "pv_local_track_count", Long.class);
        public static final C5085LLa w = C5085LLa.a(c, "pv_is_album", Boolean.class);
        public static final C5085LLa x = C5085LLa.a(c, "pv_last_updated", Long.class);
        public static final C5085LLa y = C5085LLa.a(c, "pv_last_local_change", Long.class);
        static final String z;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE VIEW IF NOT EXISTS PlaylistView AS ");
            C6975nLa a = C6975nLa.a(_ea.SoundView.name());
            StringBuilder sb2 = new StringBuilder();
            String str = "(";
            sb2.append(str);
            sb2.append(c().build());
            String str2 = ")";
            sb2.append(str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(e());
            sb3.append(str2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(d());
            sb4.append(str2);
            sb.append(a.a(C6839lLa.b(_ea.SoundView.a("_id")).a(d.d()), C6839lLa.b(_ea.SoundView.a(k.l)).a(e.d()), C6839lLa.b(_ea.SoundView.a("sound_user_username")).a(f.d()), C6839lLa.b(_ea.SoundView.a("sound_user_id")).a(g.d()), C6839lLa.b(sb2.toString()).a(h.d()), C6839lLa.b(_ea.SoundView.a(k.E)).a(i.d()), C6839lLa.b(_ea.SoundView.a(k.d)).a(j.d()), C6839lLa.b(_ea.SoundView.a(k.A)).a(k.d()), C6839lLa.b(_ea.SoundView.a(k.B)).a(l.d()), C6839lLa.b(_ea.SoundView.a(k.u)).a(m.d()), C6839lLa.b(_ea.SoundView.a(k.n)).a(n.d()), C6839lLa.b(_ea.SoundView.a(k.m)).a(o.d()), C6839lLa.b(_ea.SoundView.a(k.i)).a(p.d()), C6839lLa.b(_ea.SoundView.a(k.j)).a(q.d()), C6839lLa.b(_ea.SoundView.a(k.c)).a(r.d()), C6839lLa.b(_ea.SoundView.a(k.I)).a(s.d()), C6839lLa.b(_ea.SoundView.a("secret_token")).a(t.d()), C6839lLa.b(_ea.SoundView.a(k.H)).a(u.d()), C6839lLa.b(_ea.SoundView.a(k.G)).a(w.d()), C6839lLa.b(_ea.SoundView.a(k.a)).a(x.d()), C6839lLa.b(sb3.toString()).a(v.d()), C6839lLa.b(sb4.toString()).a(y.d())).d(_ea.SoundView.a("_type"), (Object) Integer.valueOf(1)));
            z = sb.toString();
        }

        c() {
            super("PlaylistView", defpackage.C5116MLa.a.a("_id"));
        }

        private static C6975nLa c() {
            return C6975nLa.a(h.c).a((C5116MLa) e.c, C6907mLa.a().d(_ea.SoundView.a("sound_user_id"), (Object) h.d.e())).a(h.s.e());
        }

        private static C6975nLa d() {
            return C6975nLa.a(_ea.PlaylistTracks).a("MAX(added_at)").a(_ea.SoundView.a("_id"), _ea.PlaylistTracks.a("playlist_id"));
        }

        private static C6975nLa e() {
            return C6975nLa.a(_ea.PlaylistTracks).a(C6703jLa.a(_ea.PlaylistTracks.a("track_id"))).a(_ea.SoundView.a("_id"), _ea.PlaylistTracks.a("playlist_id"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return z;
        }
    }

    /* renamed from: bfa$d */
    /* compiled from: Tables */
    public static class d extends Yea {
        public static final d c = new d();
        public static final C5085LLa d = C5085LLa.a(c, C1325gg.TYPE, String.class);
        public static final C5085LLa e = C5085LLa.a(c, "target_type", Long.class);
        public static final C5085LLa f = C5085LLa.a(c, "target_id", Long.class);
        public static final C5085LLa g = C5085LLa.a(c, "created_at", Long.class);
        public static final C5085LLa h = C5085LLa.a(c, "added_at", Long.class);
        public static final C5085LLa i = C5085LLa.a(c, "removed_at", Long.class);

        d() {
            super("Posts", defpackage.C5116MLa.a.a(C1325gg.TYPE, "target_type", "target_id"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS Posts (type STRING NOT NULL,target_id INTEGER NOT NULL,target_type INTEGER NOT NULL,created_at INTEGER NOT NULL,added_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,PRIMARY KEY (type, target_id, target_type),FOREIGN KEY(target_id, target_type) REFERENCES Sounds(_id, _type));";
        }
    }

    /* renamed from: bfa$e */
    /* compiled from: Tables */
    public static class e extends Yea {
        static final C5085LLa A = C5085LLa.a(c, "purchase_url", String.class);
        public static final C5085LLa B = C5085LLa.a(c, "playback_count", Long.class);
        static final C5085LLa C = C5085LLa.a(c, "download_count", Long.class);
        public static final C5085LLa D = C5085LLa.a(c, "comment_count", Long.class);
        public static final C5085LLa E = C5085LLa.a(c, "favoritings_count", Long.class);
        public static final C5085LLa F = C5085LLa.a(c, "reposts_count", Long.class);
        static final C5085LLa G = C5085LLa.a(c, "shared_to_count", Long.class);
        public static final C5085LLa H = C5085LLa.a(c, "user_id", Long.class);
        static final C5085LLa I = C5085LLa.a(c, "state", String.class);
        static final C5085LLa J = C5085LLa.a(c, "tracks_uri", String.class);
        public static final C5085LLa K = C5085LLa.a(c, "track_count", Long.class);
        public static final C5085LLa L = C5085LLa.a(c, "removed_at", Long.class);
        public static final C5085LLa M = C5085LLa.a(c, "modified_at", Long.class);
        public static final C5085LLa N = C5085LLa.a(c, "description", String.class);
        public static final C5085LLa O = C5085LLa.a(c, "is_album", Boolean.class);
        public static final C5085LLa P = C5085LLa.a(c, "set_type", String.class);
        public static final C5085LLa Q = C5085LLa.a(c, "release_date", String.class);
        public static final C5085LLa R = C5085LLa.a(c, "display_stats_enabled", Boolean.class);
        public static final C5085LLa S = C5085LLa.a(c, "secret_token", String.class);
        public static final e c = new e();
        public static final C5085LLa d = C5085LLa.a(c, "_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "_type", Long.class);
        public static final C5085LLa f = C5085LLa.a(c, "created_at", Long.class);
        public static final C5085LLa g = C5085LLa.a(c, "last_updated", Long.class);
        public static final C5085LLa h = C5085LLa.a(c, "permalink", String.class);
        static final C5085LLa i = C5085LLa.a(c, "original_content_size", Long.class);
        public static final C5085LLa j = C5085LLa.a(c, "genre", String.class);
        public static final C5085LLa k = C5085LLa.a(c, "duration", Long.class);
        public static final C5085LLa l = C5085LLa.a(c, "full_duration", Long.class);
        public static final C5085LLa m = C5085LLa.a(c, "snippet_duration", Long.class);
        public static final C5085LLa n = C5085LLa.a(c, "tag_list", String.class);
        static final C5085LLa o = C5085LLa.a(c, "track_type", String.class);
        public static final C5085LLa p = C5085LLa.a(c, "title", String.class);
        public static final C5085LLa q = C5085LLa.a(c, "permalink_url", String.class);
        public static final C5085LLa r = C5085LLa.a(c, "artwork_url", String.class);
        public static final C5085LLa s = C5085LLa.a(c, "waveform_url", String.class);
        static final C5085LLa t = C5085LLa.a(c, "downloadable", Boolean.class);
        static final C5085LLa u = C5085LLa.a(c, "download_url", String.class);
        @Deprecated
        public static final C5085LLa v = C5085LLa.a(c, "stream_url", String.class);
        static final C5085LLa w = C5085LLa.a(c, "streamable", Boolean.class);
        public static final C5085LLa x = C5085LLa.a(c, "commentable", Boolean.class);
        public static final C5085LLa y = C5085LLa.a(c, "sharing", String.class);
        public static final C5085LLa z = C5085LLa.a(c, "license", String.class);

        e() {
            super("Sounds", defpackage.C5116MLa.a.a("_id", "_type"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS Sounds (_id INTEGER,_type INTEGER,last_updated INTEGER,permalink VARCHAR(255),original_content_size INTEGER,duration INTEGER,snippet_duration INTEGER,full_duration INTEGER,state VARCHAR(50),created_at INTEGER,genre VARCHAR(100),tag_list VARCHAR(500),track_type VARCHAR(255),title VARCHAR(255),permalink_url VARCHAR(255),artwork_url VARCHAR(255), waveform_url VARCHAR(255), downloadable BOOLEAN, commentable BOOLEAN, download_url VARCHAR(255), stream_url VARCHAR(255),streamable BOOLEAN DEFAULT 0, sharing VARCHAR(255),license VARCHAR(100),purchase_url VARCHAR(255),playback_count INTEGER DEFAULT -1,download_count INTEGER DEFAULT -1,comment_count INTEGER DEFAULT -1,favoritings_count INTEGER DEFAULT -1,reposts_count INTEGER DEFAULT -1,shared_to_count INTEGER DEFAULT -1,sharing_note_text VARCHAR(255),tracks_uri VARCHAR(255),track_count INTEGER DEFAULT -1,playlist_type VARCHAR(255),user_id INTEGER,removed_at INTEGER DEFAULT NULL,modified_at INTEGER DEFAULT NULL,DESCRIPTION TEXT,is_album BOOLEAN DEFAULT 0,set_type VARCHAR(255),release_date VARCHAR(255),display_stats_enabled BOOLEAN DEFAULT 1,secret_token VARCHAR(255),PRIMARY KEY (_id, _type) ON CONFLICT IGNORE);";
        }
    }

    /* renamed from: bfa$f */
    /* compiled from: Tables */
    public static class f extends Yea {
        public static final f c = new f();
        public static final C5085LLa d = C5085LLa.a(c, "track_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "monetizable", Boolean.class);
        public static final C5085LLa f = C5085LLa.a(c, "blocked", Boolean.class);
        public static final C5085LLa g = C5085LLa.a(c, "snipped", Boolean.class);
        public static final C5085LLa h = C5085LLa.a(c, "sub_mid_tier", Boolean.class);
        public static final C5085LLa i = C5085LLa.a(c, "sub_high_tier", Boolean.class);
        public static final C5085LLa j = C5085LLa.a(c, "policy", String.class);
        public static final C5085LLa k = C5085LLa.a(c, "monetization_model", String.class);
        public static final C5085LLa l = C5085LLa.a(c, "syncable", Boolean.class);
        public static final C5085LLa m = C5085LLa.a(c, "last_updated", Long.class);

        f() {
            super("TrackPolicies", defpackage.C5116MLa.a.a("track_id"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS TrackPolicies (track_id INTEGER, monetizable BOOLEAN DEFAULT 0,blocked BOOLEAN DEFAULT 0,snipped BOOLEAN DEFAULT 0,syncable BOOLEAN DEFAULT 1,sub_mid_tier BOOLEAN DEFAULT 0,sub_high_tier BOOLEAN DEFAULT 0,policy TEXT NOT NULL,monetization_model TEXT,last_updated INTEGER, PRIMARY KEY (track_id) ON CONFLICT REPLACE );";
        }
    }

    /* renamed from: bfa$g */
    /* compiled from: Tables */
    public static class g extends Yea {
        public static final C5085LLa A = C5085LLa.a(c, "tv_syncable", Boolean.class);
        public static final C5085LLa B = C5085LLa.a(c, "tv_snipped", Boolean.class);
        public static final C5085LLa C = C5085LLa.a(c, "tv_sub_high_tier", Boolean.class);
        public static final C5085LLa D = C5085LLa.a(c, "tv_sub_mid_tier", Boolean.class);
        public static final C5085LLa E = C5085LLa.a(c, "tv_artwork_url", String.class);
        public static final C5085LLa F = C5085LLa.a(c, "tv_display_stats_enabled", Boolean.class);
        public static final C5085LLa G = C5085LLa.a(c, "tv_secret_token", String.class);
        public static final String H;
        public static final g c = new g();
        public static final C5085LLa d = C5085LLa.a(c, "tv_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "tv_created_at", Long.class);
        public static final C5085LLa f = C5085LLa.a(c, "tv_title", String.class);
        public static final C5085LLa g = C5085LLa.a(c, "tv_username", String.class);
        public static final C5085LLa h = C5085LLa.a(c, "tv_user_id", Long.class);
        public static final C5085LLa i = C5085LLa.a(c, "tv_creator_is_pro", Boolean.class);
        public static final C5085LLa j = C5085LLa.a(c, "tv_permalink_url", String.class);
        public static final C5085LLa k = C5085LLa.a(c, "tv_waveform_url", String.class);
        public static final C5085LLa l = C5085LLa.a(c, "tv_snippet_duration", Long.class);
        public static final C5085LLa m = C5085LLa.a(c, "tv_full_duration", Long.class);
        public static final C5085LLa n = C5085LLa.a(c, "tv_play_count", Long.class);
        public static final C5085LLa o = C5085LLa.a(c, "tv_likes_count", Long.class);
        public static final C5085LLa p = C5085LLa.a(c, "tv_reposts_count", Long.class);
        public static final C5085LLa q = C5085LLa.a(c, "tv_comments_count", Long.class);
        public static final C5085LLa r = C5085LLa.a(c, "tv_is_commentable", Boolean.class);
        public static final C5085LLa s = C5085LLa.a(c, "tv_genre", String.class);
        public static final C5085LLa t = C5085LLa.a(c, "tv_tag_list", String.class);
        public static final C5085LLa u = C5085LLa.a(c, "tv_sharing", String.class);
        public static final C5085LLa v = C5085LLa.a(c, "tv_policy", String.class);
        public static final C5085LLa w = C5085LLa.a(c, "tv_policy_last_updated_at", Long.class);
        public static final C5085LLa x = C5085LLa.a(c, "tv_monetizable", Boolean.class);
        public static final C5085LLa y = C5085LLa.a(c, "tv_monetization_model", String.class);
        public static final C5085LLa z = C5085LLa.a(c, "tv_blocked", Boolean.class);

        static {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE VIEW IF NOT EXISTS TrackView AS ");
            C6975nLa a = C6975nLa.a(_ea.SoundView.name());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(");
            sb2.append(c().build());
            sb2.append(")");
            sb.append(a.a(C6839lLa.b(_ea.SoundView.a("_id")).a(d.d()), C6839lLa.b(_ea.SoundView.a(k.c)).a(e.d()), C6839lLa.b(_ea.SoundView.a(k.l)).a(f.d()), C6839lLa.b(_ea.SoundView.a("sound_user_username")).a(g.d()), C6839lLa.b(_ea.SoundView.a("sound_user_id")).a(h.d()), C6839lLa.b(sb2.toString()).a(i.d()), C6839lLa.b(_ea.SoundView.a(k.m)).a(j.d()), C6839lLa.b(_ea.SoundView.a(k.o)).a(k.d()), C6839lLa.b(_ea.SoundView.a(k.e)).a(l.d()), C6839lLa.b(_ea.SoundView.a(k.f)).a(m.d()), C6839lLa.b(_ea.SoundView.a(k.i)).a(s.d()), C6839lLa.b(_ea.SoundView.a(k.j)).a(t.d()), C6839lLa.b(_ea.SoundView.a(k.x)).a(n.d()), C6839lLa.b(_ea.SoundView.a(k.A)).a(o.d()), C6839lLa.b(_ea.SoundView.a(k.B)).a(p.d()), C6839lLa.b(_ea.SoundView.a(k.z)).a(q.d()), C6839lLa.b(_ea.SoundView.a(k.t)).a(r.d()), C6839lLa.b(_ea.SoundView.a(k.u)).a(u.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_policy")).a(v.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_policy_last_updated_at")).a(w.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_monetizable")).a(x.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_monetization_model")).a(y.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_blocked")).a(z.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_syncable")).a(A.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_snipped")).a(B.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_sub_high_tier")).a(C.d()), C6839lLa.b(_ea.SoundView.a("sound_policies_sub_mid_tier")).a(D.d()), C6839lLa.b(_ea.SoundView.a("display_stats_enabled")).a(F.d()), C6839lLa.b(_ea.SoundView.a("secret_token")).a(G.d()), C6839lLa.b(_ea.SoundView.a(k.n)).a(E.d())).d(_ea.SoundView.a("_type"), (Object) Integer.valueOf(0)));
            H = sb.toString();
        }

        g() {
            super("TrackView", defpackage.C5116MLa.a.a("_id"));
        }

        private static C6975nLa c() {
            return C6975nLa.a(h.c).a((C5116MLa) e.c, C6907mLa.a().d(_ea.SoundView.a("sound_user_id"), (Object) h.d.e())).a(h.s.e());
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return H;
        }
    }

    /* renamed from: bfa$h */
    /* compiled from: Tables */
    public static class h extends Yea {
        public static final h c = new h();
        public static final C5085LLa d = C5085LLa.a(c, "_id", Long.class);
        public static final C5085LLa e = C5085LLa.a(c, "permalink", String.class);
        public static final C5085LLa f = C5085LLa.a(c, "username", String.class);
        public static final C5085LLa g = C5085LLa.a(c, "avatar_url", String.class);
        public static final C5085LLa h = C5085LLa.a(c, "visual_url", String.class);
        public static final C5085LLa i = C5085LLa.a(c, "city", String.class);
        public static final C5085LLa j = C5085LLa.a(c, "country", String.class);
        public static final C5085LLa k = C5085LLa.a(c, "followers_count", Long.class);
        public static final C5085LLa l = C5085LLa.a(c, "followings_count", Long.class);
        public static final C5085LLa m = C5085LLa.a(c, "first_name", String.class);
        public static final C5085LLa n = C5085LLa.a(c, "last_name", String.class);
        public static final C5085LLa o = C5085LLa.a(c, "track_count", Long.class);
        public static final C5085LLa p = C5085LLa.a(c, "description", String.class);
        public static final C5085LLa q = C5085LLa.a(c, "artist_station", String.class);
        public static final C5085LLa r = C5085LLa.a(c, "signup_date", Long.class);
        public static final C5085LLa s = C5085LLa.a(c, "is_pro", Boolean.class);

        h() {
            super("Users", defpackage.C5116MLa.a.a("_id"));
        }

        /* access modifiers changed from: 0000 */
        public String b() {
            return "CREATE TABLE IF NOT EXISTS Users (_id INTEGER PRIMARY KEY AUTOINCREMENT,_type INTEGER DEFAULT 0,username VARCHAR(255),avatar_url VARCHAR(255),permalink VARCHAR(255),permalink_url VARCHAR(255),first_name VARCHAR(255),last_name VARCHAR(255),full_name VARCHAR(255),description text,city VARCHAR(255),country VARCHAR(255),artist_station TEXT,plan VARCHAR(16),primary_email_confirmed INTEGER,visual_url VARCHAR(255),is_pro BOOLEAN,track_count INTEGER DEFAULT -1,followers_count INTEGER DEFAULT -1,followings_count INTEGER DEFAULT -1,public_favorites_count INTEGER DEFAULT -1,private_tracks_count INTEGER DEFAULT -1,signup_date INTEGER DEFAULT -1,last_updated INTEGER);";
        }
    }
}
