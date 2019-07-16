package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: gy reason: default package and case insensitive filesystem */
public enum C1343gy {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.valueOf(false)),
    STRING(""),
    BYTE_STRING(C0289Zv.a),
    ENUM(null),
    MESSAGE(null);
    
    private final Object k;

    private C1343gy(Object obj) {
        this.k = obj;
    }
}
