package com.soundcloud.android.offline;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;

/* compiled from: OfflineLikesDialog_Factory */
public final class Pd implements C4961HMa<Od> {
    private final C7054oVa<C4197yd> a;
    private final C7054oVa<F> b;
    private final C7054oVa<C3700b> c;

    public Pd(C7054oVa<C4197yd> ova, C7054oVa<F> ova2, C7054oVa<C3700b> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Pd a(C7054oVa<C4197yd> ova, C7054oVa<F> ova2, C7054oVa<C3700b> ova3) {
        return new Pd(ova, ova2, ova3);
    }

    public Od get() {
        Od od = new Od();
        Qd.a(od, (C4197yd) this.a.get());
        Qd.a(od, (F) this.b.get());
        Qd.a(od, (C3700b) this.c.get());
        return od;
    }
}
