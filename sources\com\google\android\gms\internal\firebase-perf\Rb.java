package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;

final class Rb implements C0898uc {
    private static final C0816ac a = new Ub();
    private final C0816ac b;

    public Rb() {
        this(new Tb(C0893tb.a(), a()));
    }

    public final <T> C0886rc<T> a(Class<T> cls) {
        C0894tc.a(cls);
        C0821bc b2 = this.b.b(cls);
        if (b2.a()) {
            if (C0889sb.class.isAssignableFrom(cls)) {
                return C0847hc.a(C0894tc.c(), C0858kb.a(), b2.b());
            }
            return C0847hc.a(C0894tc.a(), C0858kb.b(), b2.b());
        } else if (C0889sb.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return C0851ic.a(cls, b2, C0863lc.b(), Ob.b(), C0894tc.c(), C0858kb.a(), Zb.b());
            }
            return C0851ic.a(cls, b2, C0863lc.b(), Ob.b(), C0894tc.c(), null, Zb.b());
        } else if (a(b2)) {
            return C0851ic.a(cls, b2, C0863lc.a(), Ob.a(), C0894tc.a(), C0858kb.b(), Zb.a());
        } else {
            return C0851ic.a(cls, b2, C0863lc.a(), Ob.a(), C0894tc.b(), null, Zb.a());
        }
    }

    private Rb(C0816ac acVar) {
        C0897ub.a(acVar, "messageInfoFactory");
        this.b = acVar;
    }

    private static boolean a(C0821bc bcVar) {
        return bcVar.c() == c.i;
    }

    private static C0816ac a() {
        try {
            return (C0816ac) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }
}
