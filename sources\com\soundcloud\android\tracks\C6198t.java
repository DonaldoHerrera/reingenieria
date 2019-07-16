package com.soundcloud.android.tracks;

import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.tracks.t reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6198t<F, T> implements Function<T, V> {
    public static final C6198t a = new C6198t();

    C6198t() {
    }

    /* renamed from: a */
    public final Pda<C3509cea> apply(C3509cea cea) {
        a aVar = b.a;
        if (cea != null) {
            return aVar.a(cea);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
