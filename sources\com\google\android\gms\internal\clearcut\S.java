package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class S {
    private static final Class<?> a = b();
    static final S b = new S(true);
    private final Map<Object, Object<?, ?>> c;

    S() {
        this.c = new HashMap();
    }

    private S(boolean z) {
        this.c = Collections.emptyMap();
    }

    public static S a() {
        return Q.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
