package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.d;

/* renamed from: com.google.android.gms.internal.measurement.dc reason: case insensitive filesystem */
final class C0943dc implements Ic {
    private static final C1008nc a = new C0964gc();
    private final C1008nc b;

    public C0943dc() {
        this(new C0957fc(Eb.a(), a()));
    }

    public final <T> Ec<T> a(Class<T> cls) {
        Gc.a(cls);
        C1014oc a2 = this.b.a(cls);
        if (a2.b()) {
            if (Gb.class.isAssignableFrom(cls)) {
                return C1055vc.a(Gc.c(), C1066xb.a(), a2.a());
            }
            return C1055vc.a(Gc.a(), C1066xb.b(), a2.a());
        } else if (Gb.class.isAssignableFrom(cls)) {
            if (a(a2)) {
                return C1043tc.a(cls, a2, C1079zc.b(), C0922ac.b(), Gc.c(), C1066xb.a(), C0996lc.b());
            }
            return C1043tc.a(cls, a2, C1079zc.b(), C0922ac.b(), Gc.c(), null, C0996lc.b());
        } else if (a(a2)) {
            return C1043tc.a(cls, a2, C1079zc.a(), C0922ac.a(), Gc.a(), C1066xb.b(), C0996lc.a());
        } else {
            return C1043tc.a(cls, a2, C1079zc.a(), C0922ac.a(), Gc.b(), null, C0996lc.a());
        }
    }

    private C0943dc(C1008nc ncVar) {
        Hb.a(ncVar, "messageInfoFactory");
        this.b = ncVar;
    }

    private static boolean a(C1014oc ocVar) {
        return ocVar.c() == d.i;
    }

    private static C1008nc a() {
        try {
            return (C1008nc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }
}
