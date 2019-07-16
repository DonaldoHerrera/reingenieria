package com.google.android.gms.internal.clearcut;

final class Ia {
    private static final Ga a = c();
    private static final Ga b = new Ha();

    static Ga a() {
        return a;
    }

    static Ga b() {
        return b;
    }

    private static Ga c() {
        try {
            return (Ga) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
