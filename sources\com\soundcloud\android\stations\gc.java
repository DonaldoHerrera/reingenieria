package com.soundcloud.android.stations;

/* compiled from: StationsOperations.kt */
final class gc extends C7540vYa implements _Xa<Sda, Sda> {
    final /* synthetic */ C3508cda a;

    gc(C3508cda cda) {
        this.a = cda;
        super(1);
    }

    /* renamed from: a */
    public final Sda invoke(Sda sda) {
        C7471uYa.b(sda, "station");
        if (sda.e().isEmpty()) {
            return sda;
        }
        Qda a2 = Qda.a(sda, this.a);
        C7471uYa.a((Object) a2, "Station.stationWithSeedTrack(station, seed)");
        return a2;
    }
}
