package defpackage;

import android.database.Cursor;

/* renamed from: Uxa reason: default package and case insensitive filesystem */
/* compiled from: StationPlayQueuesModel */
public interface C5371Uxa {

    /* renamed from: Uxa$a */
    /* compiled from: StationPlayQueuesModel */
    public interface a<T extends C5371Uxa> {
        T a(long j, C3508cda cda, C3508cda cda2, C3508cda cda3, Long l);
    }

    /* renamed from: Uxa$b */
    /* compiled from: StationPlayQueuesModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("station_play_queues", ud.h("DELETE FROM station_play_queues"));
        }
    }

    /* renamed from: Uxa$c */
    /* compiled from: StationPlayQueuesModel */
    public static final class c<T extends C5371Uxa> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;
        public final C6704jMa<C3508cda, String> d;

        /* renamed from: Uxa$c$a */
        /* compiled from: StationPlayQueuesModel */
        private final class a extends C6840lMa {
            private final C3508cda c;

            a(C3508cda cda) {
                super("SELECT COUNT(*) FROM station_play_queues\nWHERE station_urn = ?1", new C7045oMa("station_play_queues"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) c.this.b.encode(this.c));
            }
        }

        /* renamed from: Uxa$c$b */
        /* compiled from: StationPlayQueuesModel */
        private final class b extends C6840lMa {
            private final C3508cda c;
            private final Long d;

            b(C3508cda cda, Long l) {
                super("SELECT track_urn, query_urn\nFROM station_play_queues\nWHERE station_urn = ?1 AND track_position >= ?2\nORDER BY track_position ASC", new C7045oMa("station_play_queues"));
                this.c = cda;
                this.d = l;
            }

            public void a(Wd wd) {
                wd.a(1, (String) c.this.b.encode(this.c));
                Long l = this.d;
                if (l != null) {
                    wd.a(2, l.longValue());
                } else {
                    wd.c(2);
                }
            }
        }

        /* renamed from: Uxa$c$c reason: collision with other inner class name */
        /* compiled from: StationPlayQueuesModel */
        private final class C0155c extends C6840lMa {
            private final C3508cda c;

            C0155c(C3508cda cda) {
                super("SELECT track_urn\nFROM station_play_queues\nWHERE station_urn = ?1\nORDER BY track_position ASC", new C7045oMa("station_play_queues"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) c.this.b.encode(this.c));
            }
        }

        public c(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2, C6704jMa<C3508cda, String> jma3) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
            this.d = jma3;
        }

        public C6840lMa a(C3508cda cda) {
            return new a(cda);
        }

        public C6840lMa b(C3508cda cda) {
            return new C0155c(cda);
        }

        public C6772kMa<C3508cda> c() {
            return new C5458Xxa(this);
        }

        public C6840lMa a(C3508cda cda, Long l) {
            return new b(cda, l);
        }

        public C6840lMa b() {
            return new C6840lMa("SELECT DISTINCT track_urn\nFROM station_play_queues", new C7045oMa("station_play_queues"));
        }

        public C6772kMa<Long> a() {
            return new C5400Vxa(this);
        }
    }

    /* renamed from: Uxa$d */
    /* compiled from: StationPlayQueuesModel */
    public static final class d extends C6908mMa {
        private final c<? extends C5371Uxa> c;

        public d(Ud ud, c<? extends C5371Uxa> cVar) {
            super("station_play_queues", ud.h("INSERT INTO station_play_queues (station_urn, track_urn, query_urn, track_position)\nVALUES (?, ?, ?, ?)"));
            this.c = cVar;
        }

        public void a(C3508cda cda, C3508cda cda2, C3508cda cda3, Long l) {
            a(1, (String) this.c.b.encode(cda));
            a(2, (String) this.c.c.encode(cda2));
            if (cda3 == null) {
                c(3);
            } else {
                a(3, (String) this.c.d.encode(cda3));
            }
            if (l == null) {
                c(4);
            } else {
                a(4, l.longValue());
            }
        }
    }

    /* renamed from: Uxa$e */
    /* compiled from: StationPlayQueuesModel */
    public interface e<T extends g> {
        T a(C3508cda cda, C3508cda cda2);
    }

    /* renamed from: Uxa$f */
    /* compiled from: StationPlayQueuesModel */
    public static final class f<T extends g, T1 extends C5371Uxa> implements C6772kMa<T> {
        private final e<T> a;
        private final c<T1> b;

        public T a(Cursor cursor) {
            return this.a.a((C3508cda) this.b.c.decode(cursor.getString(0)), cursor.isNull(1) ? null : (C3508cda) this.b.d.decode(cursor.getString(1)));
        }
    }

    /* renamed from: Uxa$g */
    /* compiled from: StationPlayQueuesModel */
    public interface g {
    }

    /* renamed from: Uxa$h */
    /* compiled from: StationPlayQueuesModel */
    public static final class h<T extends C5371Uxa> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            a<T> aVar = this.a.a;
            long j = cursor.getLong(0);
            C3508cda cda = (C3508cda) this.a.b.decode(cursor.getString(1));
            C3508cda cda2 = (C3508cda) this.a.c.decode(cursor.getString(2));
            Long l = null;
            C3508cda cda3 = cursor.isNull(3) ? null : (C3508cda) this.a.d.decode(cursor.getString(3));
            if (!cursor.isNull(4)) {
                l = Long.valueOf(cursor.getLong(4));
            }
            return aVar.a(j, cda, cda2, cda3, l);
        }
    }

    long a();

    C3508cda b();

    C3508cda c();

    C3508cda d();

    Long e();
}
