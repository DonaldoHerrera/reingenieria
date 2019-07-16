package defpackage;

/* renamed from: Wv reason: default package and case insensitive filesystem */
final class C0275Wv {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    static boolean a() {
        return a != null && !b;
    }

    static Class<?> b() {
        return a;
    }

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
