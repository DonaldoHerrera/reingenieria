package defpackage;

import android.database.Cursor;
import java.util.Date;

/* renamed from: AFa reason: default package and case insensitive filesystem */
/* compiled from: FollowingModel */
public interface C4737AFa {

    /* renamed from: AFa$a */
    /* compiled from: FollowingModel */
    public static final class a extends C6908mMa {
        private final e<? extends C4737AFa> c;

        public a(Ud ud, e<? extends C4737AFa> eVar) {
            super("following", ud.h("UPDATE following SET added_at = null WHERE user_urn = ?"));
            this.c = eVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* renamed from: AFa$b */
    /* compiled from: FollowingModel */
    public interface b<T extends C4737AFa> {
        T a(C3508cda cda, long j, Date date, Date date2);
    }

    /* renamed from: AFa$c */
    /* compiled from: FollowingModel */
    public static final class c extends C6908mMa {
        public c(Ud ud) {
            super("following", ud.h("DELETE FROM following"));
        }
    }

    /* renamed from: AFa$d */
    /* compiled from: FollowingModel */
    public static final class d extends C6908mMa {
        private final e<? extends C4737AFa> c;

        public d(Ud ud, e<? extends C4737AFa> eVar) {
            super("following", ud.h("DELETE FROM following WHERE user_urn = ?"));
            this.c = eVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* renamed from: AFa$e */
    /* compiled from: FollowingModel */
    public static final class e<T extends C4737AFa> {
        public final b<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<Date, Long> c;
        public final C6704jMa<Date, Long> d;

        /* renamed from: AFa$e$a */
        /* compiled from: FollowingModel */
        private final class a extends C6840lMa {
            private final C3508cda[] c;

            a(C3508cda[] cdaArr) {
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM following WHERE user_urn IN ");
                sb.append(C6976nMa.a(cdaArr.length));
                super(sb.toString(), new C7045oMa("following"));
                this.c = cdaArr;
            }

            public void a(Wd wd) {
                C3508cda[] cdaArr = this.c;
                int length = cdaArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    wd.a(i, (String) e.this.b.encode(cdaArr[i2]));
                    i2++;
                    i = i3;
                }
            }
        }

        /* renamed from: AFa$e$b */
        /* compiled from: FollowingModel */
        private final class b extends C6840lMa {
            private final C3508cda c;

            b(C3508cda cda) {
                super("SELECT COUNT(*) FROM following WHERE user_urn = ?1 AND removed_at IS NULL", new C7045oMa("following"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) e.this.b.encode(this.c));
            }
        }

        /* renamed from: AFa$e$c */
        /* compiled from: FollowingModel */
        private final class c extends C6840lMa {
            private final C3508cda c;

            c(C3508cda cda) {
                super("SELECT * FROM following WHERE user_urn = ?1", new C7045oMa("following"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) e.this.b.encode(this.c));
            }
        }

        /* renamed from: AFa$e$d */
        /* compiled from: FollowingModel */
        private final class d extends C6840lMa {
            private final long c;
            private final long d;

            public void a(Wd wd) {
                wd.a(1, this.c);
                wd.a(2, this.d);
            }
        }

        public e(b<T> bVar, C6704jMa<C3508cda, String> jma, C6704jMa<Date, Long> jma2, C6704jMa<Date, Long> jma3) {
            this.a = bVar;
            this.b = jma;
            this.c = jma2;
            this.d = jma3;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT * FROM following WHERE removed_at IS NULL", new C7045oMa("following"));
        }

        public C6840lMa b(C3508cda cda) {
            return new c(cda);
        }

        public C6840lMa c() {
            return new C6840lMa("SELECT user_urn FROM following WHERE added_at IS NULL AND removed_at IS NULL", new C7045oMa("following"));
        }

        public C6772kMa<C3508cda> d() {
            return new C4768BFa(this);
        }

        public C6772kMa<Long> e() {
            return new C4830DFa(this);
        }

        public C6840lMa f() {
            return new C6840lMa("SELECT * FROM following", new C7045oMa("following"));
        }

        public h<T> g() {
            return new h<>(this);
        }

        public C6840lMa h() {
            return new C6840lMa("SELECT * FROM following WHERE added_at NOT NULL OR removed_at NOT NULL", new C7045oMa("following"));
        }

        public C6840lMa i() {
            return new C6840lMa("SELECT COUNT(*) FROM following WHERE added_at NOT NULL OR removed_at NOT NULL", new C7045oMa("following"));
        }

        public C6772kMa<Long> j() {
            return new C4799CFa(this);
        }

        public h<T> k() {
            return new h<>(this);
        }

        public C6840lMa a(C3508cda cda) {
            return new b(cda);
        }

        public h<T> b() {
            return new h<>(this);
        }

        public C6840lMa a(C3508cda[] cdaArr) {
            return new a(cdaArr);
        }
    }

    /* renamed from: AFa$f */
    /* compiled from: FollowingModel */
    public static final class f extends C6908mMa {
        private final e<? extends C4737AFa> c;

        public f(Ud ud, e<? extends C4737AFa> eVar) {
            super("following", ud.h("REPLACE INTO following (user_urn, added_at, removed_at)\nVALUES (?, ?, ?)"));
            this.c = eVar;
        }

        public void a(C3508cda cda, Date date, Date date2) {
            a(1, (String) this.c.b.encode(cda));
            if (date == null) {
                c(2);
            } else {
                a(2, ((Long) this.c.c.encode(date)).longValue());
            }
            if (date2 == null) {
                c(3);
            } else {
                a(3, ((Long) this.c.d.encode(date2)).longValue());
            }
        }
    }

    /* renamed from: AFa$g */
    /* compiled from: FollowingModel */
    public static final class g extends C6908mMa {
        private final e<? extends C4737AFa> c;

        public g(Ud ud, e<? extends C4737AFa> eVar) {
            super("following", ud.h("INSERT INTO following (user_urn, position)\nVALUES (?, ?)"));
            this.c = eVar;
        }

        public void a(C3508cda cda, long j) {
            a(1, (String) this.c.b.encode(cda));
            a(2, j);
        }
    }

    /* renamed from: AFa$h */
    /* compiled from: FollowingModel */
    public static final class h<T extends C4737AFa> implements C6772kMa<T> {
        private final e<T> a;

        public h(e<T> eVar) {
            this.a = eVar;
        }

        public T a(Cursor cursor) {
            e<T> eVar = this.a;
            b<T> bVar = eVar.a;
            C3508cda cda = (C3508cda) eVar.b.decode(cursor.getString(0));
            long j = cursor.getLong(1);
            Date date = null;
            Date date2 = cursor.isNull(2) ? null : (Date) this.a.c.decode(Long.valueOf(cursor.getLong(2)));
            if (!cursor.isNull(3)) {
                date = (Date) this.a.d.decode(Long.valueOf(cursor.getLong(3)));
            }
            return bVar.a(cda, j, date2, date);
        }
    }
}
