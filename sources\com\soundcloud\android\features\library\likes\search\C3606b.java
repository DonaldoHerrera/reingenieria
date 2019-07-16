package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.likes.search.b reason: case insensitive filesystem */
/* compiled from: LikesDataSource.kt */
final class C3606b<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3609e a;

    C3606b(C3609e eVar) {
        this.a = eVar;
    }

    /* renamed from: a */
    public final APa<List<C6185ma>> apply(List<C2862s> list) {
        C7471uYa.b(list, "it");
        return this.a.a(list);
    }
}
