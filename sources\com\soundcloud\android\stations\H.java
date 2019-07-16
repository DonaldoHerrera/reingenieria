package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: BriteStationStorage.kt */
final class H<T1, T2, R> implements C6504gQa<Qda, List<? extends Tda>, Sda> {
    public static final H a = new H();

    H() {
    }

    /* renamed from: a */
    public final Qda apply(Qda qda, List<Tda> list) {
        C7471uYa.b(qda, "metadata");
        C7471uYa.b(list, "trackList");
        return Qda.a(qda, list);
    }
}
