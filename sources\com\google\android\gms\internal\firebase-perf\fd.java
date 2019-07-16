package com.google.android.gms.internal.firebase-perf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public enum fd {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.valueOf(false)),
    STRING(""),
    BYTE_STRING(Oa.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object k;

    private fd(Object obj) {
        this.k = obj;
    }
}
