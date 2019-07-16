package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.d;

final class Eb implements C1008nc {
    private static final Eb a = new Eb();

    private Eb() {
    }

    public static Eb a() {
        return a;
    }

    public final boolean b(Class<?> cls) {
        return Gb.class.isAssignableFrom(cls);
    }

    public final C1014oc a(Class<?> cls) {
        if (!Gb.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C1014oc) Gb.a(cls.asSubclass(Gb.class)).a(d.c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
