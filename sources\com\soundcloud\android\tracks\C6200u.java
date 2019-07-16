package com.soundcloud.android.tracks;

import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.tracks.u reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6200u<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;

    C6200u(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final Pda<C3509cea> apply(C4928GKa<C3509cea> gKa) {
        C7471uYa.b(gKa, "optionalTrack");
        return (Pda) gKa.b((Function<? super T, V>) C6198t.a).d(c.a.a(this.a, null));
    }
}
