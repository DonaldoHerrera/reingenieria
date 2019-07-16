package com.google.android.gms.internal.clearcut;

final class Q {
    private static final Class<?> a = b();

    public static S a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (S) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return S.b;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
