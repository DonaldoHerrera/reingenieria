package com.soundcloud.android.tracks;

import java.util.List;

/* compiled from: TrackStorage.kt */
final class qb<T, R> implements C7118pQa<T, EPa<? extends R>> {
    public static final qb a = new qb();

    qb() {
    }

    /* renamed from: a */
    public final APa<String> apply(List<String> list) {
        C7471uYa.b(list, "it");
        return APa.a((Iterable<? extends T>) list);
    }
}
