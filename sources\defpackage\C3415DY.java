package defpackage;

import android.database.Cursor;

/* renamed from: DY reason: default package and case insensitive filesystem */
/* compiled from: PromotedTrackCardModel */
public interface C3415DY {

    /* renamed from: DY$a */
    /* compiled from: PromotedTrackCardModel */
    public interface a<T extends C3415DY> {
        T a(long j, long j2, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, String str6);
    }

    /* renamed from: DY$b */
    /* compiled from: PromotedTrackCardModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("promoted_track_card", ud.h("DELETE FROM promoted_track_card"));
        }
    }

    /* renamed from: DY$c */
    /* compiled from: PromotedTrackCardModel */
    public static final class c<T extends C3415DY> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;
        public final C6704jMa<C3508cda, String> d;

        public c(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2, C6704jMa<C3508cda, String> jma3) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
            this.d = jma3;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT *\nFROM promoted_track_card\nORDER BY _id DESC\nLIMIT 1", new C7045oMa("promoted_track_card"));
        }

        public e<T> b() {
            return new e<>(this);
        }
    }

    /* renamed from: DY$d */
    /* compiled from: PromotedTrackCardModel */
    public static final class d extends C6908mMa {
        private final c<? extends C3415DY> c;

        public d(Ud ud, c<? extends C3415DY> cVar) {
            super("promoted_track_card", ud.h("INSERT INTO promoted_track_card(created_at,\n                                track_urn,\n                                promoter_urn,\n                                urn,\n                                tracking_track_clicked_urls,\n                                tracking_profile_clicked_urls,\n                                tracking_promoter_clicked_urls,\n                                tracking_track_played_urls,\n                                tracking_track_impression_urls,\n                                monetization_type)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.c = cVar;
        }

        public void a(long j, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, String str6) {
            a(1, j);
            a(2, (String) this.c.b.encode(cda));
            if (cda2 == null) {
                c(3);
            } else {
                a(3, (String) this.c.c.encode(cda2));
            }
            a(4, (String) this.c.d.encode(cda3));
            a(5, str);
            a(6, str2);
            a(7, str3);
            a(8, str4);
            a(9, str5);
            a(10, str6);
        }
    }

    /* renamed from: DY$e */
    /* compiled from: PromotedTrackCardModel */
    public static final class e<T extends C3415DY> implements C6772kMa<T> {
        private final c<T> a;

        public e(c<T> cVar) {
            this.a = cVar;
        }

        public T a(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.a.a.a(cursor2.getLong(0), cursor2.getLong(1), (C3508cda) this.a.b.decode(cursor2.getString(2)), cursor2.isNull(3) ? null : (C3508cda) this.a.c.decode(cursor2.getString(3)), (C3508cda) this.a.d.decode(cursor2.getString(4)), cursor2.getString(5), cursor2.getString(6), cursor2.getString(7), cursor2.getString(8), cursor2.getString(9), cursor2.getString(10));
        }
    }

    long a();

    C3508cda b();

    C3508cda c();

    long d();

    String e();

    String f();

    String g();

    String h();

    String i();

    C3508cda j();

    String k();
}
