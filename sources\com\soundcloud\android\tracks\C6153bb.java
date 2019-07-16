package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.bb reason: case insensitive filesystem */
/* compiled from: TrackStorage.kt */
final class C6153bb<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Ya a;

    C6153bb(Ya ya) {
        this.a = ya;
    }

    /* renamed from: a */
    public final APa<C3508cda> apply(List<C3508cda> list) {
        C7471uYa.b(list, "batch");
        return this.a.d.a(this.a.f(list)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C6150ab.a);
    }
}
