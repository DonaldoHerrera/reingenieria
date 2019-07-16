package defpackage;

import android.database.Cursor;

/* renamed from: Nxa reason: default package and case insensitive filesystem */
/* compiled from: StationCollectionsModel */
public interface C5163Nxa {

    /* renamed from: Nxa$a */
    /* compiled from: StationCollectionsModel */
    public interface a<T extends C5163Nxa> {
        T a(long j, C3508cda cda, long j2, Long l, Long l2, Long l3);
    }

    /* renamed from: Nxa$b */
    /* compiled from: StationCollectionsModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("station_collections", ud.h("DELETE FROM station_collections"));
        }
    }

    /* renamed from: Nxa$c */
    /* compiled from: StationCollectionsModel */
    public static final class c extends C6908mMa {
        public c(Ud ud) {
            super("station_collections", ud.h("DELETE FROM station_collections WHERE collection_type = ?"));
        }

        public void a(long j) {
            a(1, j);
        }
    }

    /* renamed from: Nxa$d */
    /* compiled from: StationCollectionsModel */
    public static final class d<T extends C5163Nxa> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;

        /* renamed from: Nxa$d$a */
        /* compiled from: StationCollectionsModel */
        private final class a extends C6840lMa {
            private final long c;

            a(long j) {
                super("SELECT station_urn FROM station_collections\nWHERE collection_type = ?1 AND added_at IS NOT NULL", new C7045oMa("station_collections"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        /* renamed from: Nxa$d$b */
        /* compiled from: StationCollectionsModel */
        private final class b extends C6840lMa {
            private final long c;

            b(long j) {
                super("SELECT station_urn FROM station_collections\nWHERE collection_type = ?1 AND removed_at IS NOT NULL", new C7045oMa("station_collections"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        /* renamed from: Nxa$d$c */
        /* compiled from: StationCollectionsModel */
        private final class c extends C6840lMa {
            private final long c;

            c(long j) {
                super("SELECT station_urn FROM station_collections\nWHERE collection_type = ?1 AND removed_at IS NULL\nORDER BY added_at DESC, position ASC", new C7045oMa("station_collections"));
                this.c = j;
            }

            public void a(Wd wd) {
                wd.a(1, this.c);
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma) {
            this.a = aVar;
            this.b = jma;
        }

        public C6840lMa a(long j) {
            return new a(j);
        }

        public C6840lMa b(long j) {
            return new b(j);
        }

        public C6840lMa c(long j) {
            return new c(j);
        }

        public C6772kMa<C3508cda> a() {
            return new C5193Oxa(this);
        }

        public C6772kMa<C3508cda> b() {
            return new C5223Pxa(this);
        }

        public C6772kMa<C3508cda> c() {
            return new C5253Qxa(this);
        }
    }

    /* renamed from: Nxa$e */
    /* compiled from: StationCollectionsModel */
    public static final class e extends C6908mMa {
        private final d<? extends C5163Nxa> c;

        public e(Ud ud, d<? extends C5163Nxa> dVar) {
            super("station_collections", ud.h("REPLACE INTO station_collections (station_urn, collection_type, added_at, removed_at)\nVALUES (?, ?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, long j, Long l, Long l2) {
            a(1, (String) this.c.b.encode(cda));
            a(2, j);
            if (l == null) {
                c(3);
            } else {
                a(3, l.longValue());
            }
            if (l2 == null) {
                c(4);
            } else {
                a(4, l2.longValue());
            }
        }
    }

    /* renamed from: Nxa$f */
    /* compiled from: StationCollectionsModel */
    public static final class f extends C6908mMa {
        private final d<? extends C5163Nxa> c;

        public f(Ud ud, d<? extends C5163Nxa> dVar) {
            super("station_collections", ud.h("INSERT INTO station_collections (station_urn, collection_type, position)\nVALUES (?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, long j, Long l) {
            a(1, (String) this.c.b.encode(cda));
            a(2, j);
            if (l == null) {
                c(3);
            } else {
                a(3, l.longValue());
            }
        }
    }

    /* renamed from: Nxa$g */
    /* compiled from: StationCollectionsModel */
    public static final class g<T extends C5163Nxa> implements C6772kMa<T> {
        private final d<T> a;

        public T a(Cursor cursor) {
            return this.a.a.a(cursor.getLong(0), (C3508cda) this.a.b.decode(cursor.getString(1)), cursor.getLong(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)));
        }
    }

    long a();

    Long b();

    C3508cda c();

    Long d();

    long e();

    Long position();
}
