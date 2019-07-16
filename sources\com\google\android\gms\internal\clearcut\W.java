package com.google.android.gms.internal.clearcut;

final class W {
    private static final T<?> a = new U();
    private static final T<?> b = c();

    static T<?> a() {
        return a;
    }

    static T<?> b() {
        T<?> t = b;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static T<?> c() {
        try {
            return (T) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
