package defpackage;

/* renamed from: rw reason: default package and case insensitive filesystem */
final class C1678rw {
    private static final Class<?> a = b();

    public static C1738tw a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (C1738tw) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C1738tw.c;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
