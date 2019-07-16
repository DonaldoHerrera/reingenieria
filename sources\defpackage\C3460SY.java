package defpackage;

import android.database.Cursor;

/* renamed from: SY reason: default package and case insensitive filesystem */
/* compiled from: SystemPlaylistsTracksModel */
public interface C3460SY {

    /* renamed from: SY$a */
    /* compiled from: SystemPlaylistsTracksModel */
    public interface a<T extends C3460SY> {
        T a(C3508cda cda, C3508cda cda2, long j);
    }

    /* renamed from: SY$b */
    /* compiled from: SystemPlaylistsTracksModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("system_playlists_tracks", ud.h("DELETE FROM system_playlists_tracks"));
        }
    }

    /* renamed from: SY$c */
    /* compiled from: SystemPlaylistsTracksModel */
    public static final class c extends C6908mMa {
        private final d<? extends C3460SY> c;

        public c(Ud ud, d<? extends C3460SY> dVar) {
            super("system_playlists_tracks", ud.h("DELETE FROM system_playlists_tracks\nWHERE system_playlist_urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* renamed from: SY$d */
    /* compiled from: SystemPlaylistsTracksModel */
    public static final class d<T extends C3460SY> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;

        /* renamed from: SY$d$a */
        /* compiled from: SystemPlaylistsTracksModel */
        private final class a extends C6840lMa {
            private final C3508cda c;

            a(C3508cda cda) {
                super("SELECT track_urn\nFROM system_playlists_tracks\nWHERE system_playlist_urn = ?1\nORDER BY position ASC", new C7045oMa("system_playlists_tracks"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) d.this.b.encode(this.c));
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
        }

        public C6840lMa a(C3508cda cda) {
            return new a(cda);
        }

        public C6772kMa<C3508cda> a() {
            return new C3463TY(this);
        }
    }

    /* renamed from: SY$e */
    /* compiled from: SystemPlaylistsTracksModel */
    public static final class e extends C6908mMa {
        private final d<? extends C3460SY> c;

        public e(Ud ud, d<? extends C3460SY> dVar) {
            super("system_playlists_tracks", ud.h("INSERT INTO system_playlists_tracks(system_playlist_urn, track_urn, position)\nVALUES (?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, C3508cda cda2, long j) {
            a(1, (String) this.c.b.encode(cda));
            a(2, (String) this.c.c.encode(cda2));
            a(3, j);
        }
    }

    /* renamed from: SY$f */
    /* compiled from: SystemPlaylistsTracksModel */
    public static final class f<T extends C3460SY> implements C6772kMa<T> {
        private final d<T> a;

        public T a(Cursor cursor) {
            d<T> dVar = this.a;
            return dVar.a.a((C3508cda) dVar.b.decode(cursor.getString(0)), (C3508cda) this.a.c.decode(cursor.getString(1)), cursor.getLong(2));
        }
    }

    C3508cda a();

    C3508cda b();

    long position();
}
