package com.soundcloud.android.ads.data;

import com.google.common.base.Function;

/* compiled from: VideoAdStorage.kt */
final class o<T, R> implements C7118pQa<T, R> {
    public static final o a = new o();

    o() {
    }

    /* renamed from: a */
    public final C4928GKa<g> apply(C4928GKa<h> gKa) {
        C7471uYa.b(gKa, "optionalAd");
        if (gKa.c()) {
            return gKa.b((Function<? super T, V>) n.a);
        }
        return C4928GKa.a();
    }
}
