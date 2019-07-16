package com.google.android.gms.internal.firebase-perf;

import java.util.Map;
import java.util.Map.Entry;

final class _b implements Xb {
    _b() {
    }

    public final Object a(Object obj, Object obj2) {
        Yb yb = (Yb) obj;
        Yb yb2 = (Yb) obj2;
        if (!yb2.isEmpty()) {
            if (!yb.i()) {
                yb = yb.e();
            }
            yb.a(yb2);
        }
        return yb;
    }

    public final Vb<?, ?> b(Object obj) {
        return ((Wb) obj).a();
    }

    public final Object d(Object obj) {
        ((Yb) obj).j();
        return obj;
    }

    public final Map<?, ?> e(Object obj) {
        return (Yb) obj;
    }

    public final int a(int i, Object obj, Object obj2) {
        Yb yb = (Yb) obj;
        Wb wb = (Wb) obj2;
        int i2 = 0;
        if (yb.isEmpty()) {
            return 0;
        }
        for (Entry entry : yb.entrySet()) {
            i2 += wb.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
