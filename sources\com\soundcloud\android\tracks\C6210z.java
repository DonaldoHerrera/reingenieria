package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.z reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6210z<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ D a;
    final /* synthetic */ List b;

    C6210z(D d, List list) {
        this.a = d;
        this.b = list;
    }

    /* renamed from: a */
    public final APa<Ida<C3509cea>> apply(MV mv) {
        C7471uYa.b(mv, "fetchResult");
        return QV.a(this.a.a(this.b), mv);
    }
}
