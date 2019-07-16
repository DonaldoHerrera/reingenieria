package com.soundcloud.android.stations;

import java.util.List;

/* compiled from: DefaultStationsRepository.kt */
final class X<T> implements C7256rQa<Sda> {
    public static final X a = new X();

    X() {
    }

    /* renamed from: a */
    public final boolean test(Sda sda) {
        C7471uYa.b(sda, "it");
        List e = sda.e();
        C7471uYa.a((Object) e, "it.tracks");
        return !e.isEmpty();
    }
}
