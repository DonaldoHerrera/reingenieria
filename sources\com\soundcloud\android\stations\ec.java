package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: StationsOperations.kt */
final class ec<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Uda a;

    ec(Uda uda) {
        this.a = uda;
    }

    /* renamed from: a */
    public final Pb apply(List<? extends C6040qb> list) {
        C7471uYa.b(list, "stationInfoTracks");
        return Pb.a(this.a, list);
    }
}
