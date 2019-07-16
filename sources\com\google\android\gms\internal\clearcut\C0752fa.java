package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;

/* renamed from: com.google.android.gms.internal.clearcut.fa reason: case insensitive filesystem */
final class C0752fa implements Ka {
    private static final C0752fa a = new C0752fa();

    private C0752fa() {
    }

    public static C0752fa a() {
        return a;
    }

    public final Ja a(Class<?> cls) {
        if (!C0755ga.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (Ja) C0755ga.a(cls.asSubclass(C0755ga.class)).a(e.c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }

    public final boolean b(Class<?> cls) {
        return C0755ga.class.isAssignableFrom(cls);
    }
}
