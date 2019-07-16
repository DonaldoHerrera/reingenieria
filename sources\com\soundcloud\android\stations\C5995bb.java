package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.bb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C5995bb<T> implements C7256rQa<Sda> {
    public static final C5995bb a = new C5995bb();

    C5995bb() {
    }

    /* renamed from: a */
    public final boolean test(Sda sda) {
        C7471uYa.b(sda, "it");
        List e = sda.e();
        C7471uYa.a((Object) e, "it.tracks");
        return !e.isEmpty();
    }
}
