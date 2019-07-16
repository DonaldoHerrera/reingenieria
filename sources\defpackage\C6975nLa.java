package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: nLa reason: default package and case insensitive filesystem */
/* compiled from: Query */
public final class C6975nLa extends C7182qLa<C6907mLa, C6975nLa> {
    private final List<a> b = new ArrayList();
    private Object[] c;
    private String[] d;
    private StringBuilder e;
    private final String[] f;
    private int g;
    private int h = -1;

    /* renamed from: nLa$a */
    /* compiled from: Query */
    private static class a {
        /* access modifiers changed from: private */
        public final String a;
        /* access modifiers changed from: private */
        public final String b;
        /* access modifiers changed from: private */
        public final String c;

        a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        a(String str, String str2, C7113pLa pla) {
            this(str, str2, C7044oLa.a(pla.build(), pla.C()));
        }
    }

    /* renamed from: nLa$b */
    /* compiled from: Query */
    public enum b {
        ASC,
        DESC
    }

    private C6975nLa(String... strArr) {
        super(C6907mLa.a());
        this.f = strArr;
    }

    public static C6975nLa a(String... strArr) {
        return new C6975nLa(strArr);
    }

    private void c(StringBuilder sb) {
        String b2 = b();
        if (b2 != null) {
            sb.append(" LIMIT ");
            sb.append(b2);
        }
    }

    public static C6975nLa d(String str) {
        return new C6975nLa(str).a(C6703jLa.a("*"));
    }

    private void e(StringBuilder sb) {
        String[] strArr;
        sb.append("SELECT ");
        Object[] objArr = this.c;
        if (objArr == null) {
            strArr = new String[]{"*"};
        } else {
            int length = objArr.length;
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                Object obj = this.c[i];
                if (obj instanceof C5085LLa) {
                    strArr2[i] = ((C5085LLa) obj).a();
                } else if (obj instanceof C6635iLa) {
                    strArr2[i] = ((C6635iLa) obj).build();
                } else {
                    strArr2[i] = obj.toString();
                }
            }
            strArr = strArr2;
        }
        String str = ",";
        sb.append(TextUtils.join(str, strArr));
        if (this.f.length > 0) {
            sb.append(" FROM ");
            sb.append(TextUtils.join(str, this.f));
        }
    }

    private void f(StringBuilder sb) {
        String D = ((C6907mLa) this.a).D();
        if (!TextUtils.isEmpty(D)) {
            sb.append(" WHERE ");
            sb.append(D);
        }
    }

    public /* bridge */ /* synthetic */ String[] C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ String D() {
        return super.D();
    }

    public /* synthetic */ This a(C5085LLa lLa) {
        super.a(lLa);
        return this;
    }

    public /* synthetic */ This a(C5085LLa lLa, Object obj) {
        super.a(lLa, obj);
        return this;
    }

    public /* synthetic */ This a(C5085LLa lLa, Collection<?> collection) {
        super.a(lLa, (Collection) collection);
        return this;
    }

    public /* synthetic */ This a(C5085LLa lLa, Object... objArr) {
        super.a(lLa, objArr);
        return this;
    }

    public /* synthetic */ This a(String str) {
        super.a(str);
        return this;
    }

    public /* synthetic */ This a(String str, Object obj) {
        super.a(str, obj);
        return this;
    }

    public C6975nLa b(String str, String str2, String str3) {
        List<a> list = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" = ");
        sb.append(str3);
        list.add(new a(str, "LEFT JOIN", sb.toString()));
        return this;
    }

    public /* synthetic */ This b(C5085LLa lLa) {
        super.b(lLa);
        return this;
    }

    public /* synthetic */ This b(C5085LLa lLa, Object obj) {
        super.b(lLa, obj);
        return this;
    }

    public /* synthetic */ This b(String str) {
        super.b(str);
        return this;
    }

    public /* synthetic */ This b(String str, Object obj) {
        super.b(str, obj);
        return this;
    }

    public /* synthetic */ This b(String str, Collection<?> collection) {
        super.b(str, (Collection) collection);
        return this;
    }

    public /* synthetic */ This b(String str, Object... objArr) {
        super.b(str, objArr);
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder(256);
        e(sb);
        b(sb);
        f(sb);
        a(sb);
        d(sb);
        c(sb);
        return sb.toString();
    }

    public /* synthetic */ This c(C5085LLa lLa, Object obj) {
        super.c(lLa, obj);
        return this;
    }

    public /* synthetic */ This c(String str, Object obj) {
        super.c(str, obj);
        return this;
    }

    public /* synthetic */ This d(C5085LLa lLa, Object obj) {
        super.d(lLa, obj);
        return this;
    }

    public /* synthetic */ This d(String str, Object obj) {
        super.d(str, obj);
        return this;
    }

    public String toString() {
        return C7044oLa.a(build(), C());
    }

    public static C6975nLa a(C5116MLa... mLaArr) {
        return new C6975nLa(mLaArr);
    }

    private void b(StringBuilder sb) {
        for (a aVar : this.b) {
            sb.append(' ');
            sb.append(aVar.b);
            sb.append(' ');
            sb.append(aVar.a);
            sb.append(" ON ");
            sb.append(aVar.c);
        }
    }

    private void d(StringBuilder sb) {
        StringBuilder sb2 = this.e;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append(this.e.toString());
        }
    }

    public static C6975nLa a(C5116MLa mLa) {
        return d(mLa.name());
    }

    public static C6975nLa a(C6635iLa ila) {
        return new C6975nLa(new String[0]).a(ila);
    }

    public C6975nLa(C5116MLa[] mLaArr) {
        super(C6907mLa.a());
        this.f = new String[mLaArr.length];
        for (int i = 0; i < mLaArr.length; i++) {
            this.f[i] = mLaArr[i].name();
        }
    }

    private String b() {
        int i = this.g;
        if (i > 0 && this.h == -1) {
            return Long.toString((long) i);
        }
        if (this.g <= 0) {
            return null;
        }
        return String.format(Locale.US, "%d,%d", new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.g)});
    }

    public C6975nLa a(Object... objArr) {
        this.c = objArr;
        for (C7113pLa pla : objArr) {
            if (pla instanceof C7113pLa) {
                C7113pLa pla2 = pla;
                if (pla2.C() != null) {
                    ((C6907mLa) this.a).a((Object[]) pla2.C());
                }
            }
        }
        return this;
    }

    public C6975nLa a(C7113pLa pla) {
        a(pla.build(), (Object[]) pla.C());
        return this;
    }

    @Deprecated
    public C6975nLa a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" = ");
        sb.append(str2);
        a(sb.toString(), new Object[0]);
        return this;
    }

    public C6975nLa a(String str, String str2, String str3) {
        List<a> list = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" = ");
        sb.append(str3);
        list.add(new a(str, "INNER JOIN", sb.toString()));
        return this;
    }

    public C6975nLa a(String str, C7113pLa pla) {
        if (pla.D() != null) {
            this.b.add(new a(str, "INNER JOIN", pla));
        }
        return this;
    }

    public C6975nLa a(C5116MLa mLa, C7113pLa pla) {
        return a(mLa.name(), pla);
    }

    public C6975nLa a(String str, b bVar) {
        StringBuilder sb = this.e;
        if (sb == null) {
            this.e = new StringBuilder();
        } else {
            sb.append(", ");
        }
        this.e.append(str);
        this.e.append(' ');
        this.e.append(bVar);
        return this;
    }

    public C6975nLa a(C5085LLa lLa, b bVar) {
        return a(lLa.e(), bVar);
    }

    public C6975nLa a(int i) {
        this.g = i;
        return this;
    }

    public Object[] a() {
        return this.c;
    }

    private void a(StringBuilder sb) {
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            sb.append(" GROUP BY ");
            sb.append(TextUtils.join(",", this.d));
        }
    }
}
