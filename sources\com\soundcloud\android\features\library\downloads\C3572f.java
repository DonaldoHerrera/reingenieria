package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.features.library.downloads.s.a;

/* renamed from: com.soundcloud.android.features.library.downloads.f reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3572f extends C7540vYa implements C6376eYa<C3863rda, C2852h, Integer, a> {
    public static final C3572f a = new C3572f();

    C3572f() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return a((C3863rda) obj, (C2852h) obj2, ((Number) obj3).intValue());
    }

    public final a a(C3863rda rda, C2852h hVar, int i) {
        C7471uYa.b(rda, "playlistItem");
        C7471uYa.b(hVar, "<anonymous parameter 1>");
        return new a(rda);
    }
}
