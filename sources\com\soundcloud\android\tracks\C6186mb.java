package com.soundcloud.android.tracks;

import java.util.List;

/* renamed from: com.soundcloud.android.tracks.mb reason: case insensitive filesystem */
/* compiled from: TrackStorage.kt */
final class C6186mb<T, R> implements C7118pQa<T, R> {
    public static final C6186mb a = new C6186mb();

    C6186mb() {
    }

    /* renamed from: a */
    public final List<C3509cea> apply(C5631bLa bla) {
        C7471uYa.b(bla, "result");
        List b = bla.b(C6183lb.a);
        C7471uYa.a((Object) b, "result.toList { trackFromCursorReader(it) }");
        return C7676xWa.f((Iterable) b);
    }
}
