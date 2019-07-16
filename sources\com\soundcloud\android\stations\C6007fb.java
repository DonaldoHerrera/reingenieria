package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.fb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C6007fb<T> implements C7256rQa<Sda> {
    public static final C6007fb a = new C6007fb();

    C6007fb() {
    }

    /* renamed from: a */
    public final boolean test(Sda sda) {
        C7471uYa.b(sda, "it");
        List e = sda.e();
        C7471uYa.a((Object) e, "it.tracks");
        return !e.isEmpty();
    }
}
