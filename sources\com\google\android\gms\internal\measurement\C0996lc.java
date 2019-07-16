package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.lc reason: case insensitive filesystem */
final class C0996lc {
    private static final C0984jc a = c();
    private static final C0984jc b = new C1002mc();

    static C0984jc a() {
        return a;
    }

    static C0984jc b() {
        return b;
    }

    private static C0984jc c() {
        try {
            return (C0984jc) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
