package com.google.android.gms.internal.firebase-perf;

final class Zb {
    private static final Xb a = c();
    private static final Xb b = new _b();

    static Xb a() {
        return a;
    }

    static Xb b() {
        return b;
    }

    private static Xb c() {
        try {
            return (Xb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
