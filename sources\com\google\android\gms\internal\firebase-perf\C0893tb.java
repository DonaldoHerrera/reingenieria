package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;

/* renamed from: com.google.android.gms.internal.firebase-perf.tb reason: case insensitive filesystem */
final class C0893tb implements C0816ac {
    private static final C0893tb a = new C0893tb();

    private C0893tb() {
    }

    public static C0893tb a() {
        return a;
    }

    public final C0821bc b(Class<?> cls) {
        if (!C0889sb.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C0821bc) C0889sb.a(cls.asSubclass(C0889sb.class)).a(c.c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }

    public final boolean a(Class<?> cls) {
        return C0889sb.class.isAssignableFrom(cls);
    }
}
