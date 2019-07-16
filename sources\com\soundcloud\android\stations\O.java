package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: BriteStationStorage.kt */
final class O extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ B a;
    final /* synthetic */ List b;

    O(B b2, List list) {
        this.a = b2;
        this.b = list;
        super(0);
    }

    public final void d() {
        e eVar = new e(this.a.g.a(), a.b);
        for (C6043s sVar : this.b) {
            eVar.a(sVar.e(), sVar.d(), sVar.c(), sVar.b(), (String) sVar.a().d(), this.a.h.b());
            eVar.x();
        }
    }
}
