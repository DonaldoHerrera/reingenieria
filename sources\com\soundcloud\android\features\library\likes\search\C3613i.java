package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.sync.ia;

/* renamed from: com.soundcloud.android.features.library.likes.search.i reason: case insensitive filesystem */
/* compiled from: LikesSearchDataSource.kt */
final class C3613i<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3614j a;
    final /* synthetic */ APa b;

    C3613i(C3614j jVar, APa aPa) {
        this.a = jVar;
        this.b = aPa;
    }

    /* renamed from: a */
    public final APa<N> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        return this.a.a(this.b);
    }
}
