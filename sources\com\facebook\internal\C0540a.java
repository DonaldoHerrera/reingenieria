package com.facebook.internal;

import java.util.UUID;

/* renamed from: com.facebook.internal.a reason: case insensitive filesystem */
/* compiled from: AppCall */
public class C0540a {
    private static C0540a a;

    public static synchronized C0540a a(UUID uuid, int i) {
        synchronized (C0540a.class) {
            C0540a b = b();
            if (b != null) {
                b.a();
                throw null;
            }
        }
        return null;
    }

    public static C0540a b() {
        return a;
    }

    public UUID a() {
        throw null;
    }
}
