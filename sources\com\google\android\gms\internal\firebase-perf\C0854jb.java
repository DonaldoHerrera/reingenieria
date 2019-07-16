package com.google.android.gms.internal.firebase-perf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.jb reason: case insensitive filesystem */
public class C0854jb {
    private static final Class<?> a = b();
    private static volatile C0854jb b;
    static final C0854jb c = new C0854jb(true);
    private final Map<Object, Object> d;

    C0854jb() {
        this.d = new HashMap();
    }

    public static C0854jb a() {
        C0854jb jbVar = b;
        if (jbVar == null) {
            synchronized (C0854jb.class) {
                jbVar = b;
                if (jbVar == null) {
                    jbVar = C0842gb.a();
                    b = jbVar;
                }
            }
        }
        return jbVar;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private C0854jb(boolean z) {
        this.d = Collections.emptyMap();
    }
}
