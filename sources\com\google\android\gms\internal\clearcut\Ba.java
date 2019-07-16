package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;

final class Ba implements C0744cb {
    private static final Ka a = new Ca();
    private final Ka b;

    public Ba() {
        this(new Da(C0752fa.a(), a()));
    }

    private Ba(Ka ka) {
        C0761ia.a(ka, "messageInfoFactory");
        this.b = ka;
    }

    private static Ka a() {
        try {
            return (Ka) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }

    private static boolean a(Ja ja) {
        return ja.a() == e.i;
    }

    public final <T> C0741bb<T> a(Class<T> cls) {
        C0747db.a(cls);
        Ja a2 = this.b.a(cls);
        if (a2.b()) {
            return C0755ga.class.isAssignableFrom(cls) ? Qa.a(C0747db.c(), W.a(), a2.c()) : Qa.a(C0747db.a(), W.b(), a2.c());
        }
        if (C0755ga.class.isAssignableFrom(cls)) {
            if (a(a2)) {
                return Pa.a(cls, a2, Ua.b(), C0802wa.b(), C0747db.c(), W.a(), Ia.b());
            }
            return Pa.a(cls, a2, Ua.b(), C0802wa.b(), C0747db.c(), null, Ia.b());
        } else if (a(a2)) {
            return Pa.a(cls, a2, Ua.a(), C0802wa.a(), C0747db.a(), W.b(), Ia.a());
        } else {
            return Pa.a(cls, a2, Ua.a(), C0802wa.a(), C0747db.b(), null, Ia.a());
        }
    }
}
