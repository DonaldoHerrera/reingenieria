package defpackage;

import android.database.Cursor;

/* renamed from: AY reason: default package and case insensitive filesystem */
/* compiled from: MultipleContentSelectionCardModel */
public interface C3406AY {

    /* renamed from: AY$a */
    /* compiled from: MultipleContentSelectionCardModel */
    public interface a<T extends C3406AY> {
        T a(long j, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4);
    }

    /* renamed from: AY$b */
    /* compiled from: MultipleContentSelectionCardModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("multiple_content_selection_card", ud.h("DELETE FROM multiple_content_selection_card"));
        }
    }

    /* renamed from: AY$c */
    /* compiled from: MultipleContentSelectionCardModel */
    public static final class c<T extends C3406AY> {
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
    }

    /* renamed from: AY$d */
    /* compiled from: MultipleContentSelectionCardModel */
    public static final class d extends C6908mMa {
        private final c<? extends C3406AY> c;

        public d(Ud ud, c<? extends C3406AY> cVar) {
            super("multiple_content_selection_card", ud.h("INSERT INTO multiple_content_selection_card(urn, query_urn, parent_query_urn, style, title, description, tracking_feature_name)\nVALUES (?, ?, ?, ?, ?, ?, ?)"));
            this.c = cVar;
        }

        public void a(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4) {
            a(1, (String) this.c.b.encode(cda));
            if (cda2 == null) {
                c(2);
            } else {
                a(2, (String) this.c.c.encode(cda2));
            }
            if (cda3 == null) {
                c(3);
            } else {
                a(3, (String) this.c.d.encode(cda3));
            }
            if (str == null) {
                c(4);
            } else {
                a(4, str);
            }
            if (str2 == null) {
                c(5);
            } else {
                a(5, str2);
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
        }
    }

    /* renamed from: AY$e */
    /* compiled from: MultipleContentSelectionCardModel */
    public static final class e<T extends C3406AY> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            return this.a.a.a(cursor.getLong(0), (C3508cda) this.a.b.decode(cursor.getString(1)), cursor.isNull(2) ? null : (C3508cda) this.a.c.decode(cursor.getString(2)), cursor.isNull(3) ? null : (C3508cda) this.a.d.decode(cursor.getString(3)), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : cursor.getString(7));
        }
    }

    long a();

    C3508cda c();

    C3508cda d();

    String description();

    String e();

    String f();

    C3508cda g();

    String h();
}
