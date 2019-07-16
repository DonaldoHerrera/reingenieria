package defpackage;

import java.util.Set;

/* renamed from: wbb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C7613wbb implements _fb {
    private final ClassLoader a;

    public C7613wbb(ClassLoader classLoader) {
        C7471uYa.b(classLoader, "classLoader");
        this.a = classLoader;
    }

    public Kib a(a aVar) {
        C7471uYa.b(aVar, "request");
        C7280rnb a2 = aVar.a();
        C7349snb d = a2.d();
        C7471uYa.a((Object) d, "classId.packageFqName");
        String a3 = a2.e().a();
        C7471uYa.a((Object) a3, "classId.relativeClassName.asString()");
        String a4 = Cxb.a(a3, '.', '$', false, 4, (Object) null);
        if (!d.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(d.a());
            sb.append(".");
            sb.append(a4);
            a4 = sb.toString();
        }
        Class a5 = C7682xbb.a(this.a, a4);
        if (a5 != null) {
            return new C6545gwb(a5);
        }
        return null;
    }

    public Set<String> b(C7349snb snb) {
        C7471uYa.b(snb, "packageFqName");
        return null;
    }

    public Xib a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return new C7298rwb(snb);
    }
}
