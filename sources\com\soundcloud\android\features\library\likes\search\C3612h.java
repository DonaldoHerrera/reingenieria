package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.search.h reason: case insensitive filesystem */
/* compiled from: LikesSearchDataSource.kt */
final class C3612h<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3614j a;
    final /* synthetic */ APa b;

    C3612h(C3614j jVar, APa aPa) {
        this.a = jVar;
        this.b = aPa;
    }

    /* renamed from: a */
    public final APa<N> apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "items");
        return this.b.h(new C3611g(this, list));
    }
}
