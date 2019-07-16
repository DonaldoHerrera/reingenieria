package com.google.android.gms.internal.clearcut;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: com.google.android.gms.internal.clearcut.oa reason: case insensitive filesystem */
public enum C0779oa {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(A.class, A.class, A.a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> l;
    private final Class<?> m;
    private final Object n;

    private C0779oa(Class<?> cls, Class<?> cls2, Object obj) {
        this.l = cls;
        this.m = cls2;
        this.n = obj;
    }

    public final Class<?> a() {
        return this.m;
    }
}
