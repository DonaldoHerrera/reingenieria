package defpackage;

import android.database.Cursor;
import java.util.Date;

/* renamed from: RY reason: default package and case insensitive filesystem */
/* compiled from: SystemPlaylistModel */
public interface C3457RY {

    /* renamed from: RY$a */
    /* compiled from: SystemPlaylistModel */
    public interface a<T extends C3457RY> {
        T a(C3508cda cda, C3508cda cda2, String str, String str2, String str3, String str4, Date date);
    }

    /* renamed from: RY$b */
    /* compiled from: SystemPlaylistModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("system_playlist", ud.h("DELETE FROM system_playlist"));
        }
    }

    /* renamed from: RY$c */
    /* compiled from: SystemPlaylistModel */
    public static final class c extends C6908mMa {
        private final d<? extends C3457RY> c;

        public c(Ud ud, d<? extends C3457RY> dVar) {
            super("system_playlist", ud.h("DELETE FROM system_playlist\nWHERE urn = ?"));
            this.c = dVar;
        }

        public void a(C3508cda cda) {
            a(1, (String) this.c.b.encode(cda));
        }
    }

    /* renamed from: RY$d */
    /* compiled from: SystemPlaylistModel */
    public static final class d<T extends C3457RY> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;
        public final C6704jMa<Date, Long> d;

        /* renamed from: RY$d$a */
        /* compiled from: SystemPlaylistModel */
        private final class a extends C6840lMa {
            private final C3508cda c;

            a(C3508cda cda) {
                super("SELECT *\nFROM system_playlist\nWHERE urn = ?1", new C7045oMa("system_playlist"));
                this.c = cda;
            }

            public void a(Wd wd) {
                wd.a(1, (String) d.this.b.encode(this.c));
            }
        }

        public d(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2, C6704jMa<Date, Long> jma3) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
            this.d = jma3;
        }

        public C6840lMa a(C3508cda cda) {
            return new a(cda);
        }

        public f<T> a() {
            return new f<>(this);
        }
    }

    /* renamed from: RY$e */
    /* compiled from: SystemPlaylistModel */
    public static final class e extends C6908mMa {
        private final d<? extends C3457RY> c;

        public e(Ud ud, d<? extends C3457RY> dVar) {
            super("system_playlist", ud.h("INSERT INTO system_playlist(urn, query_urn, title, description, artwork_url_template, tracking_feature_name, last_updated)\nVALUES (?, ?, ?, ?, ?, ?, ?)"));
            this.c = dVar;
        }

        public void a(C3508cda cda, C3508cda cda2, String str, String str2, String str3, String str4, Date date) {
            a(1, (String) this.c.b.encode(cda));
            if (cda2 == null) {
                c(2);
            } else {
                a(2, (String) this.c.c.encode(cda2));
            }
            if (str == null) {
                c(3);
            } else {
                a(3, str);
            }
            if (str2 == null) {
                c(4);
            } else {
                a(4, str2);
            }
            if (str3 == null) {
                c(5);
            } else {
                a(5, str3);
            }
            if (str4 == null) {
                c(6);
            } else {
                a(6, str4);
            }
            if (date == null) {
                c(7);
            } else {
                a(7, ((Long) this.c.d.encode(date)).longValue());
            }
        }
    }

    /* renamed from: RY$f */
    /* compiled from: SystemPlaylistModel */
    public static final class f<T extends C3457RY> implements C6772kMa<T> {
        private final d<T> a;

        public f(d<T> dVar) {
            this.a = dVar;
        }

        public T a(Cursor cursor) {
            d<T> dVar = this.a;
            return dVar.a.a((C3508cda) dVar.b.decode(cursor.getString(0)), cursor.isNull(1) ? null : (C3508cda) this.a.c.decode(cursor.getString(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : (Date) this.a.d.decode(Long.valueOf(cursor.getLong(6))));
        }
    }

    Date a();

    String b();

    C3508cda c();

    C3508cda d();

    String description();

    String e();

    String f();
}
