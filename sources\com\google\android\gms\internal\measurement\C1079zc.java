package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zc reason: case insensitive filesystem */
final class C1079zc {
    private static final C1067xc a = c();
    private static final C1067xc b = new C1061wc();

    static C1067xc a() {
        return a;
    }

    static C1067xc b() {
        return b;
    }

    private static C1067xc c() {
        try {
            return (C1067xc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
