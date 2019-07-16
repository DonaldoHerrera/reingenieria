package com.soundcloud.android.offline;

import android.database.Cursor;

/* compiled from: TrackDownloadsModel */
public interface Ce {

    /* compiled from: TrackDownloadsModel */
    public interface a<T extends Ce> {
        T a(C3508cda cda, Long l, Long l2, Long l3, Long l4);
    }

    /* compiled from: TrackDownloadsModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("track_downloads", ud.h("DELETE FROM track_downloads"));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class c extends C6908mMa {
        private final d<? extends Ce> c;

        public c(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("DELETE FROM track_downloads WHERE urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class d<T extends Ce> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;

        /* compiled from: TrackDownloadsModel */
        private final class a extends C6840lMa {
            private final C3508cda[] c;

            a(C3508cda[] cdaArr) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM track_downloads WHERE urn in ");
                sb.append(C6976nMa.a(cdaArr.length));
                super(sb.toString(), new C7045oMa("track_downloads"));
                this.c = cdaArr;
            }

            public void a(Wd wd) {
                C3508cda[] cdaArr = this.c;
                int length = cdaArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    wd.a(i, (String) d.this.b.encode(cdaArr[i2]));
                    i2++;
                    i = i3;
                }
            }
        }

        /* compiled from: TrackDownloadsModel */
        private final class b extends C6840lMa {
            private final C3508cda[] c;
            final /* synthetic */ d d;

            public void a(Wd wd) {
                C3508cda[] cdaArr = this.c;
                int length = cdaArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    wd.a(i, (String) this.d.b.encode(cdaArr[i2]));
                    i2++;
                    i = i3;
                }
            }
        }

        /* compiled from: TrackDownloadsModel */
        private final class c extends C6840lMa {
            private final Long c;

            c(Long l) {
                super("SELECT * FROM track_downloads WHERE removed_at < ?1", new C7045oMa("track_downloads"));
                this.c = l;
            }

            public void a(Wd wd) {
                Long l = this.c;
                if (l != null) {
                    wd.a(1, l.longValue());
                } else {
                    wd.c(1);
                }
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma) {
            this.a = aVar;
            this.b = jma;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT * FROM track_downloads", new C7045oMa("track_downloads"));
        }

        public C6840lMa b() {
            return new C6840lMa("SELECT * FROM track_downloads WHERE downloaded_at IS NOT NULL AND removed_at IS NULL AND unavailable_at IS NULL", new C7045oMa("track_downloads"));
        }

        public g<T> c() {
            return new g<>(this);
        }

        public g<T> d() {
            return new g<>(this);
        }

        public C6840lMa e() {
            return new C6840lMa("SELECT * FROM track_downloads WHERE removed_at IS NOT NULL AND downloaded_at IS NOT NULL", new C7045oMa("track_downloads"));
        }

        public C6840lMa f() {
            return new C6840lMa("SELECT * FROM track_downloads WHERE requested_at IS NOT NULL AND downloaded_at IS NULL AND removed_at IS NULL", new C7045oMa("track_downloads"));
        }

        public C6840lMa g() {
            return new C6840lMa("SELECT * FROM track_downloads WHERE unavailable_at IS NOT NULL", new C7045oMa("track_downloads"));
        }

        public g<T> h() {
            return new g<>(this);
        }

        public C6840lMa a(C3508cda[] cdaArr) {
            return new a(cdaArr);
        }

        public C6840lMa a(Long l) {
            return new c(l);
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class e extends C6908mMa {
    }

    /* compiled from: TrackDownloadsModel */
    public static final class f extends C6908mMa {
        private final d<? extends Ce> c;

        public f(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("INSERT OR IGNORE INTO track_downloads(urn, requested_at) VALUES (?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, Long l) {
            a(1, (String) this.c.b.encode(cda));
            if (l == null) {
                c(2);
            } else {
                a(2, l.longValue());
            }
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class g<T extends Ce> implements C6772kMa<T> {
        private final d<T> a;

        public g(d<T> dVar) {
            this.a = dVar;
        }

        public T a(Cursor cursor) {
            d<T> dVar = this.a;
            return dVar.a.a((C3508cda) dVar.b.decode(cursor.getString(0)), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class h extends C6908mMa {
        private final d<? extends Ce> c;

        public h(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("UPDATE track_downloads set downloaded_at = ?, unavailable_at = NULL, removed_at = null WHERE urn = ?"));
            this.c = dVar;
        }

        public void a(Long l, C3508cda cda) {
            if (l == null) {
                c(1);
            } else {
                a(1, l.longValue());
            }
            a(2, (String) this.c.b.encode(cda));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class i extends C6908mMa {
        private final d<? extends Ce> c;

        public i(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("UPDATE track_downloads set removed_at = ? WHERE urn = ?"));
            this.c = dVar;
        }

        public void a(Long l, C3508cda cda) {
            if (l == null) {
                c(1);
            } else {
                a(1, l.longValue());
            }
            a(2, (String) this.c.b.encode(cda));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class j extends C6908mMa {
        private final d<? extends Ce> c;

        public j(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("UPDATE track_downloads set removed_at = null WHERE urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class k extends C6908mMa {
        private final d<? extends Ce> c;

        public k(Ud ud, d<? extends Ce> dVar) {
            super("track_downloads", ud.h("INSERT OR REPLACE INTO track_downloads(urn, unavailable_at) VALUES (?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, Long l) {
            a(1, (String) this.c.b.encode(cda));
            if (l == null) {
                c(2);
            } else {
                a(2, l.longValue());
            }
        }
    }

    /* compiled from: TrackDownloadsModel */
    public static final class l extends C6908mMa {
        public l(Ud ud) {
            super("track_downloads", ud.h("UPDATE track_downloads set requested_at = ?, removed_at = NULL, downloaded_at = NULL, unavailable_at = NULL"));
        }

        public void a(Long l) {
            if (l == null) {
                c(1);
            } else {
                a(1, l.longValue());
            }
        }
    }

    Long b();

    C3508cda c();

    Long d();

    Long e();

    Long f();
}
