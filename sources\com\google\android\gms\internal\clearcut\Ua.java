package com.google.android.gms.internal.clearcut;

final class Ua {
    private static final Sa a = c();
    private static final Sa b = new Ta();

    static Sa a() {
        return a;
    }

    static Sa b() {
        return b;
    }

    private static Sa c() {
        try {
            return (Sa) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
