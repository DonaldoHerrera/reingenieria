package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.v reason: case insensitive filesystem */
/* compiled from: DefaultTrackRepository.kt */
final class C6202v<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ D a;
    final /* synthetic */ C3508cda b;

    C6202v(D d, C3508cda cda) {
        this.a = d;
        this.b = cda;
    }

    /* renamed from: a */
    public final IPa<? extends MV> apply(List<C3508cda> list) {
        C7471uYa.b(list, "available");
        if (list.isEmpty()) {
            return this.a.e(C6850lWa.a(this.b));
        }
        if (list.size() == 1) {
            IPa<? extends MV> a2 = IPa.a(b.a);
            C7471uYa.a((Object) a2, "Single.just(FetchResult.Success)");
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid available tracks size: ");
        sb.append(list.size());
        throw new IllegalStateException(sb.toString());
    }
}
