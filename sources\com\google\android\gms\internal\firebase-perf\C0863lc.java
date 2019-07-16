package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.lc reason: case insensitive filesystem */
final class C0863lc {
    private static final C0855jc a = c();
    private static final C0855jc b = new C0867mc();

    static C0855jc a() {
        return a;
    }

    static C0855jc b() {
        return b;
    }

    private static C0855jc c() {
        try {
            return (C0855jc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
