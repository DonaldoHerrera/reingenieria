package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.tracks.Ca;
import java.util.List;

/* compiled from: StationsOperations.kt */
public class ic {
    private final Vda a;
    private final HPa b;
    private final C5327TLa c;
    /* access modifiers changed from: private */
    public final Ca d;

    public ic(Vda vda, HPa hPa, C5327TLa tLa, Ca ca) {
        C7471uYa.b(vda, "stationsRepository");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(ca, "trackItemRepository");
        this.a = vda;
        this.b = hPa;
        this.c = tLa;
        this.d = ca;
    }

    public void b(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "stationUrn");
        a(cda, z).c(new C4943Gua());
    }

    private C7531vPa<Pb> b(C3508cda cda, _Xa<? super Sda, ? extends Sda> _xa) {
        C7531vPa<Pb> b2 = this.a.b(cda).a((C7669xPa<T>) a(cda, _xa)).b(this.b);
        C7471uYa.a((Object) b2, "stationsRepository.clear…  .subscribeOn(scheduler)");
        return b2;
    }

    public C7531vPa<Sda> a(C3508cda cda) {
        C7471uYa.b(cda, "station");
        C7531vPa<Sda> b2 = this.a.b(cda).a((C7669xPa<T>) this.a.a(cda)).b(this.b);
        C7471uYa.a((Object) b2, "stationsRepository\n     …  .subscribeOn(scheduler)");
        return b2;
    }

    private _Xa<Sda, Sda> b(C3508cda cda) {
        return new gc(cda);
    }

    public C7531vPa<Pb> a(C3508cda cda, C4928GKa<C3508cda> gKa) {
        _Xa _xa;
        C7471uYa.b(cda, "station");
        C7471uYa.b(gKa, "seed");
        if (gKa.c()) {
            Object b2 = gKa.b();
            C7471uYa.a(b2, "seed.get()");
            _xa = b((C3508cda) b2);
        } else {
            _xa = hc.a;
        }
        return b(cda, _xa);
    }

    public IPa<Boolean> b(int i) {
        return this.a.a(i);
    }

    private C7531vPa<Pb> a(C3508cda cda, _Xa<? super Sda, ? extends Sda> _xa) {
        C7531vPa<Pb> e = this.a.a(cda, _xa).e(new fc(this));
        C7471uYa.a((Object) e, "stationsRepository.stati…foTracks) }\n            }");
        return e;
    }

    public IPa<Boolean> b() {
        return this.a.a(7);
    }

    public IPa<List<Sda>> a(int i) {
        return this.a.b(i);
    }

    public void a(C3508cda cda, int i) {
        C7471uYa.b(cda, "collectionUrn");
        this.a.b(cda, i);
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "stationUrn");
        C6979nPa a2 = this.a.a(cda, z);
        C5327TLa tLa = this.c;
        C5443XLa<C3490aba> xLa = C3876taa.o;
        C7471uYa.a((Object) xLa, "URN_STATE_CHANGED");
        C6979nPa b2 = a2.a(tLa.b(xLa, C3490aba.c(cda))).b(this.b);
        C7471uYa.a((Object) b2, "stationsRepository.updat…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<o> a(C3508cda cda, int i, PlaySessionSource playSessionSource) {
        C7471uYa.b(cda, "station");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa<o> b2 = this.a.a(cda, i).e(new cc(cda, PlaySessionSource.a(playSessionSource.g(), playSessionSource.b(), m.STATIONS_SUGGESTIONS))).b(this.b);
        C7471uYa.a((Object) b2, "stationsRepository.loadS…  .subscribeOn(scheduler)");
        return b2;
    }

    public void a() {
        this.a.a();
    }
}
