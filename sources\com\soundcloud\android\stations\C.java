package com.soundcloud.android.stations;

import java.util.Date;

/* compiled from: BriteStationStorage.kt */
final class C extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ B a;
    final /* synthetic */ C3508cda b;

    C(B b2, C3508cda cda) {
        this.a = b2;
        this.b = cda;
        super(0);
    }

    public final void d() {
        c cVar = new c(this.a.g.a(), a.b);
        cVar.a(this.b, new Date(this.a.h.a() - B.a));
        if (cVar.v() > 0) {
            this.a.a(this.b, (Integer) null);
        }
    }
}
