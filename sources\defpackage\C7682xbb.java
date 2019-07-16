package defpackage;

/* renamed from: xbb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C7682xbb {
    public static final Class<?> a(ClassLoader classLoader, String str) {
        C7471uYa.b(classLoader, "$this$tryLoadClass");
        C7471uYa.b(str, "fqName");
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
