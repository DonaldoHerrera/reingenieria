package defpackage;

/* renamed from: zbb reason: default package and case insensitive filesystem */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C7820zbb implements Bkb {
    private final ClassLoader a;

    public C7820zbb(ClassLoader classLoader) {
        C7471uYa.b(classLoader, "classLoader");
        this.a = classLoader;
    }

    private final a a(String str) {
        Class a2 = C7682xbb.a(this.a, str);
        if (a2 != null) {
            C7751ybb a3 = C7751ybb.a.a(a2);
            if (a3 != null) {
                return new b(a3);
            }
        }
        return null;
    }

    public a a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        return a(C4748Abb.b(rnb));
    }

    public a a(Kib kib) {
        C7471uYa.b(kib, "javaClass");
        C7349snb q = kib.q();
        if (q != null) {
            String a2 = q.a();
            if (a2 != null) {
                return a(a2);
            }
        }
        return null;
    }
}
