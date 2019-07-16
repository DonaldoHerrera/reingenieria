package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.kb reason: case insensitive filesystem */
final class C0858kb {
    private static final C0850ib<?> a = new C0862lb();
    private static final C0850ib<?> b = c();

    static C0850ib<?> a() {
        return a;
    }

    static C0850ib<?> b() {
        C0850ib<?> ibVar = b;
        if (ibVar != null) {
            return ibVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C0850ib<?> c() {
        try {
            return (C0850ib) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
