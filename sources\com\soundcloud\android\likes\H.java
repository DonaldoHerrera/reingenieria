package com.soundcloud.android.likes;

import java.util.List;

/* compiled from: TrackLikeOperations.kt */
final class H<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4001z a;
    final /* synthetic */ long b;
    final /* synthetic */ List c;

    H(C4001z zVar, long j, List list) {
        this.a = zVar;
        this.b = j;
        this.c = list;
    }

    /* renamed from: a */
    public final IPa<T> apply(Integer num) {
        C7471uYa.b(num, "newCount");
        return this.a.b.a(this.b, this.a.a(this.c)).e(new G(num));
    }
}
