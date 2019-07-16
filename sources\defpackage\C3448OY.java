package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: OY reason: default package and case insensitive filesystem */
/* compiled from: SingleContentSelectionCardModel */
public interface C3448OY {

    /* renamed from: OY$a */
    /* compiled from: SingleContentSelectionCardModel */
    public interface a<T extends C3448OY> {
        T a(long j, C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, List<String> list);
    }

    /* renamed from: OY$b */
    /* compiled from: SingleContentSelectionCardModel */
    public static final class b extends C6908mMa {
        public b(Ud ud) {
            super("single_content_selection_card", ud.h("DELETE FROM single_content_selection_card"));
        }
    }

    /* renamed from: OY$c */
    /* compiled from: SingleContentSelectionCardModel */
    public static final class c<T extends C3448OY> {
        public final a<T> a;
        public final C6704jMa<C3508cda, String> b;
        public final C6704jMa<C3508cda, String> c;
        public final C6704jMa<C3508cda, String> d;
        public final C6704jMa<List<String>, String> e;

        public c(a<T> aVar, C6704jMa<C3508cda, String> jma, C6704jMa<C3508cda, String> jma2, C6704jMa<C3508cda, String> jma3, C6704jMa<List<String>, String> jma4) {
            this.a = aVar;
            this.b = jma;
            this.c = jma2;
            this.d = jma3;
            this.e = jma4;
        }
    }

    /* renamed from: OY$d */
    /* compiled from: SingleContentSelectionCardModel */
    public static final class d extends C6908mMa {
        private final c<? extends C3448OY> c;

        public d(Ud ud, c<? extends C3448OY> cVar) {
            super("single_content_selection_card", ud.h("INSERT INTO single_content_selection_card(urn, query_urn, parent_query_urn, style, title, description, tracking_feature_name, social_proof, social_proof_avatar_urls)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.c = cVar;
        }

        public void a(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, String str5, List<String> list) {
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
            if (str5 == null) {
                c(8);
            } else {
                a(8, str5);
            }
            a(9, (String) this.c.e.encode(list));
        }
    }

    /* renamed from: OY$e */
    /* compiled from: SingleContentSelectionCardModel */
    public static final class e<T extends C3448OY> implements C6772kMa<T> {
        private final c<T> a;

        public T a(Cursor cursor) {
            a<T> aVar = this.a.a;
            long j = cursor.getLong(0);
            C3508cda cda = (C3508cda) this.a.b.decode(cursor.getString(1));
            String str = null;
            C3508cda cda2 = cursor.isNull(2) ? null : (C3508cda) this.a.c.decode(cursor.getString(2));
            C3508cda cda3 = cursor.isNull(3) ? null : (C3508cda) this.a.d.decode(cursor.getString(3));
            String string = cursor.isNull(4) ? null : cursor.getString(4);
            String string2 = cursor.isNull(5) ? null : cursor.getString(5);
            String string3 = cursor.isNull(6) ? null : cursor.getString(6);
            String string4 = cursor.isNull(7) ? null : cursor.getString(7);
            if (!cursor.isNull(8)) {
                str = cursor.getString(8);
            }
            return aVar.a(j, cda, cda2, cda3, string, string2, string3, string4, str, (List) this.a.e.decode(cursor.getString(9)));
        }
    }

    long a();

    List<String> b();

    C3508cda c();

    C3508cda d();

    String description();

    String e();

    String f();

    C3508cda g();

    String h();

    String i();
}
