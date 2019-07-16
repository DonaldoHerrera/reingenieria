package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: com.google.android.gms.internal.measurement.rd reason: case insensitive filesystem */
public enum C1032rd {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.valueOf(false)),
    STRING(""),
    BYTE_STRING(Ya.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object k;

    private C1032rd(Object obj) {
        this.k = obj;
    }
}
