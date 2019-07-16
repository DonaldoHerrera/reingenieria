package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.mc reason: case insensitive filesystem */
final class C1002mc implements C0984jc {
    C1002mc() {
    }

    public final Map<?, ?> a(Object obj) {
        return (C0990kc) obj;
    }

    public final Map<?, ?> b(Object obj) {
        return (C0990kc) obj;
    }

    public final boolean c(Object obj) {
        return !((C0990kc) obj).i();
    }

    public final C0971hc<?, ?> d(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Object e(Object obj) {
        return C0990kc.k().l();
    }

    public final Object f(Object obj) {
        ((C0990kc) obj).j();
        return obj;
    }

    public final Object a(Object obj, Object obj2) {
        C0990kc kcVar = (C0990kc) obj;
        C0990kc kcVar2 = (C0990kc) obj2;
        if (!kcVar2.isEmpty()) {
            if (!kcVar.i()) {
                kcVar = kcVar.l();
            }
            kcVar.a(kcVar2);
        }
        return kcVar;
    }

    public final int a(int i, Object obj, Object obj2) {
        C0990kc kcVar = (C0990kc) obj;
        if (kcVar.isEmpty()) {
            return 0;
        }
        Iterator it = kcVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
