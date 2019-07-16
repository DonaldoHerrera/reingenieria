package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.V;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.a reason: case insensitive filesystem */
/* compiled from: TrackLikesAdapter.kt */
final class C3587a<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3588b a;

    C3587a(C3588b bVar) {
        this.a = bVar;
    }

    /* renamed from: a */
    public final HVa<Integer, List<V>> apply(Integer num) {
        C7471uYa.b(num, "it");
        return NVa.a(num, C7676xWa.q(C7469uWa.a(this.a.h(), V.class)));
    }
}
