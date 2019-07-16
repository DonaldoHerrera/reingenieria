package com.google.android.gms.internal.firebase-perf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.qc reason: case insensitive filesystem */
final class C0883qc {
    private static final C0883qc a = new C0883qc();
    private final C0898uc b = new Rb();
    private final ConcurrentMap<Class<?>, C0886rc<?>> c = new ConcurrentHashMap();

    private C0883qc() {
    }

    public static C0883qc a() {
        return a;
    }

    public final <T> C0886rc<T> a(Class<T> cls) {
        String str = "messageType";
        C0897ub.a(cls, str);
        C0886rc<T> rcVar = (C0886rc) this.c.get(cls);
        if (rcVar != null) {
            return rcVar;
        }
        C0886rc<T> a2 = this.b.a(cls);
        C0897ub.a(cls, str);
        C0897ub.a(a2, "schema");
        C0886rc rcVar2 = (C0886rc) this.c.putIfAbsent(cls, a2);
        return rcVar2 != null ? rcVar2 : a2;
    }

    public final <T> C0886rc<T> a(T t) {
        return a(t.getClass());
    }
}
