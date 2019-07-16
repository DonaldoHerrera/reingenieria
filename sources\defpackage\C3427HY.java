package defpackage;

import android.database.Cursor;

/* renamed from: HY reason: default package and case insensitive filesystem */
/* compiled from: SelectionItemModel */
public interface C3427HY {

    /* renamed from: HY$a */
    /* compiled from: SelectionItemModel */
    public interface a<T extends C3427HY> {
        T a(long j, C3508cda cda, C3508cda cda2, String str, String str2, Long l, String str3, String str4, String str5, String str6);
    }

    /* renamed from: HY$b */
    /* compiled from: SelectionItemModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("selection_item", ud.h("DELETE FROM selection_item"));
        }
    }

    /* renamed from: HY$c */
    /* compiled from: SelectionItemModel */
    public static final class c<T extends C3427HY> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;

        public c(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
        }

        public C6840lMa a() {
            return new C6840lMa("SELECT *\nFROM selection_item", new C7045oMa("selection_item"));
        }

        public e<T> b() {
            return new e<>(this);
        }
    }

    /* renamed from: HY$d */
    /* compiled from: SelectionItemModel */
    public static final class d extends C6908mMa {
        private final c<? extends C3427HY> c;

        public d(Ud ud, c<? extends C3427HY> cVar) {
            super("selection_item", ud.h("INSERT INTO selection_item(urn, selection_urn, artwork_url_template, artwork_style, count, short_title, short_subtitle, web_link, app_link)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.c = cVar;
        }

        public void a(C3508cda cda, C3508cda cda2, String str, String str2, Long l, String str3, String str4, String str5, String str6) {
            if (cda == null) {
                c(1);
            } else {
                a(1, (String) this.c.c.encode(cda));
            }
            a(2, (String) this.c.b.encode(cda2));
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
            if (l == null) {
                c(5);
            } else {
                a(5, l.longValue());
            }
            if (str3 == null) {
                c(6);
            } else {
                a(6, str3);
            }
            if (str4 == null) {
                c(7);
            } else {
                a(7, str4);
            }
            if (str5 == null) {
                c(8);
            } else {
                a(8, str5);
            }
            if (str6 == null) {
                c(9);
            } else {
                a(9, str6);
            }
        }
    }

    /* renamed from: HY$e */
    /* compiled from: SelectionItemModel */
    public static final class e<T extends C3427HY> implements C6772kMa<T> {
        private final c<T> a;

        public e(c<T> cVar) {
            this.a = cVar;
        }

        public T a(Cursor cursor) {
            return this.a.a.a(cursor.getLong(0), (C3508cda) this.a.b.decode(cursor.getString(1)), cursor.isNull(2) ? null : (C3508cda) this.a.c.decode(cursor.getString(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : cursor.getString(7), cursor.isNull(8) ? null : cursor.getString(8), cursor.isNull(9) ? null : cursor.getString(9));
        }
    }

    long a();

    String b();

    C3508cda c();

    Long count();

    String d();

    String e();

    String f();

    C3508cda g();

    String h();

    String i();
}
