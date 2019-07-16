package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.x reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6206x<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ D a;
    final /* synthetic */ List b;

    C6206x(D d, List list) {
        this.a = d;
        this.b = list;
    }

    /* renamed from: a */
    public final APa<Ida<C3509cea>> apply(MV mv) {
        C7471uYa.b(mv, "networkResponse");
        return QV.a(this.a.a(this.b), mv);
    }
}
