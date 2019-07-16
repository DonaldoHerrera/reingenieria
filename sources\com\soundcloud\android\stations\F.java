package com.soundcloud.android.stations;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BriteStationStorage.kt */
final class F extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ B a;
    final /* synthetic */ List b;

    F(B b2, List list) {
        this.a = b2;
        this.b = list;
        super(0);
    }

    public final void d() {
        c cVar = new c(this.a.g.a());
        long j = (long) 7;
        cVar.a(j);
        cVar.v();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C3508cda cda : this.b) {
            f fVar = new f(this.a.g.a(), b.b);
            fVar.a(cda, j, Long.valueOf((long) i));
            arrayList.add(fVar);
            i++;
        }
        this.a.g.a("station_collections", (List<? extends Yd>) arrayList);
    }
}
