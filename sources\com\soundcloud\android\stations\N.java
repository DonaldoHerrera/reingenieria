package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: BriteStationStorage.kt */
final class N extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ B a;
    final /* synthetic */ Sda b;

    N(B b2, Sda sda) {
        this.a = b2;
        this.b = sda;
        super(0);
    }

    public final void d() {
        e eVar = new e(this.a.g.a(), a.b);
        eVar.a(this.b.a(), this.b.getType(), this.b.getTitle(), this.b.d(), (String) this.b.b().d(), this.a.h.b());
        eVar.x();
        long b2 = this.a.b(this.b);
        d dVar = new d(this.a.g.a(), c.b);
        List<Tda> e = this.b.e();
        C7471uYa.a((Object) e, "station.tracks");
        int i = 0;
        for (Tda tda : e) {
            dVar.a(this.b.a(), tda.b(), tda.a(), Long.valueOf(((long) i) + b2));
            dVar.x();
            i++;
        }
    }
}
