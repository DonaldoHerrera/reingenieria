package defpackage;

import android.database.Cursor;
import java.util.Date;

/* renamed from: Rxa reason: default package and case insensitive filesystem */
/* compiled from: StationModel */
public interface C5283Rxa {

    /* renamed from: Rxa$a */
    /* compiled from: StationModel */
    public interface a<T extends C5283Rxa> {
        T a(long j, C3508cda cda, String str, String str2, String str3, String str4, Long l, Date date);
    }

    /* renamed from: Rxa$b */
    /* compiled from: StationModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("station", ud.h("DELETE FROM station"));
        }
    }

    /* renamed from: Rxa$c */
    /* compiled from: StationModel */
    public static final class c extends C6908mMa {
        private final d<? extends C5283Rxa> c;

        public c(Ud ud, d<? extends C5283Rxa> dVar) {
            super("station_play_queues", ud.h("DELETE FROM station_play_queues\nWHERE EXISTS\n    (\n    SELECT * FROM station JOIN station_play_queues\n    ON station.urn = station_play_queues.station_urn\n    WHERE station.urn = ?\n    AND station.play_queue_updated_at <= ?\n    )"));
            this.c = dVar;
        }

        public void a(C3508cda cda, Date date) {
            a(1, (String) this.c.b.encode(cda));
            if (date == null) {
                c(2);
            } else {
                a(2, ((Long) this.c.c.encode(date)).longValue());
            }
        }
    }

    /* renamed from: Rxa$d */
    /* compiled from: StationModel */
    public static final class d<T extends C5283Rxa> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<Date, Long> c;

        /* renamed from: Rxa$d$a */
        /* compiled from: StationModel */
        private final class a extends C6840lMa {
            private final C3508cda[] c;

            a(C3508cda[] cdaArr) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM station WHERE urn in ");
                sb.append(C6976nMa.a(cdaArr.length));
                super(sb.toString(), new C7045oMa("station"));
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

        /* renamed from: Rxa$d$b */
        /* compiled from: StationModel */
        private final class b extends C6840lMa {
            private final defpackage.C5163Nxa.d<? extends C5163Nxa> c;
            private final long d;
            private final C3508cda e;
            private final C3508cda f;

            b(defpackage.C5163Nxa.d<? extends C5163Nxa> dVar, long j, C3508cda cda, C3508cda cda2) {
                super("SELECT station.*,\n       EXISTS(SELECT 1 FROM station_collections WHERE collection_type = ?1 AND station_urn = ?2 AND removed_at IS NULL) AS in_collection\nFROM station\nWHERE urn = ?3", new C7045oMa("station", "station_collections"));
                this.c = dVar;
                this.d = j;
                this.e = cda;
                this.f = cda2;
            }

            public void a(Wd wd) {
                wd.a(1, this.d);
                wd.a(2, (String) this.c.b.encode(this.e));
                wd.a(3, (String) d.this.b.encode(this.f));
            }
        }

        /* renamed from: Rxa$d$c */
        /* compiled from: StationModel */
        private final class c extends C6840lMa {
            private final String c;

            c(String str) {
                super("SELECT urn FROM station\nWHERE permalink = ?1\nLIMIT 1", new C7045oMa("station"));
                this.c = str;
            }

            public void a(Wd wd) {
                String str = this.c;
                if (str != null) {
                    wd.a(1, str);
                } else {
                    wd.c(1);
                }
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<Date, Long> jma2) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
        }

        public C6840lMa a(C3508cda[] cdaArr) {
            return new a(cdaArr);
        }

        public C6772kMa<C3508cda> b() {
            return new C5313Sxa(this);
        }

        public C6772kMa<C3508cda> c() {
            return new C5342Txa(this);
        }

        public C6840lMa a(defpackage.C5163Nxa.d<? extends C5163Nxa> dVar, long j, C3508cda cda, C3508cda cda2) {
            b bVar = new b(dVar, j, cda, cda2);
            return bVar;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT urn FROM station", new C7045oMa("station"));
        }

        public C6840lMa a(String str) {
            return new c(str);
        }
    }

    /* renamed from: Rxa$e */
    /* compiled from: StationModel */
    public static final class e extends C6908mMa {
        private final d<? extends C5283Rxa> c;

        public e(Ud ud, d<? extends C5283Rxa> dVar) {
            super("station", ud.h("INSERT INTO station (urn, type, title, permalink, artwork_url_template, play_queue_updated_at)\nVALUES (?, ?, ?, ?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, String str, String str2, String str3, String str4, Date date) {
            a(1, (String) this.c.b.encode(cda));
            if (str == null) {
                c(2);
            } else {
                a(2, str);
            }
            if (str2 == null) {
                c(3);
            } else {
                a(3, str2);
            }
            if (str3 == null) {
                c(4);
            } else {
                a(4, str3);
            }
            if (str4 == null) {
                c(5);
            } else {
                a(5, str4);
            }
            if (date == null) {
                c(6);
            } else {
                a(6, ((Long) this.c.c.encode(date)).longValue());
            }
        }
    }

    /* renamed from: Rxa$f */
    /* compiled from: StationModel */
    public interface f<T1 extends C5283Rxa, T extends h<T1>> {
        T a(T1 t1, long j);
    }

    /* renamed from: Rxa$g */
    /* compiled from: StationModel */
    public static final class g<T1 extends C5283Rxa, T extends h<T1>> implements C6772kMa<T> {
        private final f<T1, T> a;
        private final d<T1> b;

        public T a(Cursor cursor) {
            f<T1, T> fVar = this.a;
            a<T> aVar = this.b.a;
            long j = cursor.getLong(0);
            C3508cda cda = (C3508cda) this.b.b.decode(cursor.getString(1));
            Date date = null;
            String string = cursor.isNull(2) ? null : cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            String string3 = cursor.isNull(4) ? null : cursor.getString(4);
            String string4 = cursor.isNull(5) ? null : cursor.getString(5);
            Long valueOf = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
            if (!cursor.isNull(7)) {
                date = (Date) this.b.c.decode(Long.valueOf(cursor.getLong(7)));
            }
            return fVar.a(aVar.a(j, cda, string, string2, string3, string4, valueOf, date), cursor.getLong(8));
        }
    }

    /* renamed from: Rxa$h */
    /* compiled from: StationModel */
    public interface h<T1 extends C5283Rxa> {
    }

    /* renamed from: Rxa$i */
    /* compiled from: StationModel */
    public static final class i<T extends C5283Rxa> implements C6772kMa<T> {
        private final d<T> a;

        public T a(Cursor cursor) {
            return this.a.a.a(cursor.getLong(0), (C3508cda) this.a.b.decode(cursor.getString(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)), cursor.isNull(7) ? null : (Date) this.a.c.decode(Long.valueOf(cursor.getLong(7))));
        }
    }

    /* renamed from: Rxa$j */
    /* compiled from: StationModel */
    public static final class j extends C6908mMa {
        private final d<? extends C5283Rxa> c;

        public j(Ud ud, d<? extends C5283Rxa> dVar) {
            super("station", ud.h("UPDATE station SET last_played_track_position = ?\nWHERE urn = ?"));
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

    long a();

    String b();

    C3508cda c();

    Date d();

    String e();

    String f();

    Long g();

    String type();
}
