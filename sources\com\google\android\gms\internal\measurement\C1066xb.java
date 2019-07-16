package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xb reason: case insensitive filesystem */
final class C1066xb {
    private static final C1054vb<?> a = new C1048ub();
    private static final C1054vb<?> b = c();

    static C1054vb<?> a() {
        return a;
    }

    static C1054vb<?> b() {
        C1054vb<?> vbVar = b;
        if (vbVar != null) {
            return vbVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C1054vb<?> c() {
        try {
            return (C1054vb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
