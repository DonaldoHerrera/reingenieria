package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.y reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6208y<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ D a;
    final /* synthetic */ List b;

    C6208y(D d, List list) {
        this.a = d;
        this.b = list;
    }

    /* renamed from: a */
    public final IPa<? extends MV> apply(List<C3508cda> list) {
        C7471uYa.b(list, "available");
        List c = C7676xWa.c((Iterable) this.b, (Iterable) list);
        if (!c.isEmpty()) {
            return this.a.e(c);
        }
        IPa<? extends MV> a2 = IPa.a(b.a);
        C7471uYa.a((Object) a2, "Single.just(FetchResult.Success)");
        return a2;
    }
}
