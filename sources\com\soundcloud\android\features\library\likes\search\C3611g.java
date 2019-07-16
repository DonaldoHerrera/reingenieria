package com.soundcloud.android.features.library.likes.search;

import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.search.g reason: case insensitive filesystem */
/* compiled from: LikesSearchDataSource.kt */
final class C3611g<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3612h a;
    final /* synthetic */ List b;

    C3611g(C3612h hVar, List list) {
        this.a = hVar;
        this.b = list;
    }

    /* renamed from: a */
    public final N apply(String str) {
        C7471uYa.b(str, "latestQuery");
        C3614j jVar = this.a.a;
        List list = this.b;
        C7471uYa.a((Object) list, "items");
        return this.a.a.a(str, jVar.a(list, (CharSequence) str));
    }
}
