package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class Ha implements Ga {
    Ha() {
    }

    public final int a(int i, Object obj, Object obj2) {
        Fa fa = (Fa) obj;
        if (fa.isEmpty()) {
            return 0;
        }
        Iterator it = fa.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object a(Object obj, Object obj2) {
        Fa fa = (Fa) obj;
        Fa fa2 = (Fa) obj2;
        if (!fa2.isEmpty()) {
            if (!fa.i()) {
                fa = fa.k();
            }
            fa.a(fa2);
        }
        return fa;
    }

    public final Object b(Object obj) {
        ((Fa) obj).l();
        return obj;
    }

    public final Ea<?, ?> c(Object obj) {
        throw new NoSuchMethodError();
    }

    public final boolean d(Object obj) {
        return !((Fa) obj).i();
    }

    public final Map<?, ?> e(Object obj) {
        return (Fa) obj;
    }

    public final Object f(Object obj) {
        return Fa.j().k();
    }

    public final Map<?, ?> g(Object obj) {
        return (Fa) obj;
    }
}
