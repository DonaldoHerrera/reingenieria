package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.gb reason: case insensitive filesystem */
final class C0842gb {
    private static final Class<?> a = b();

    public static C0854jb a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (C0854jb) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C0854jb.c;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
