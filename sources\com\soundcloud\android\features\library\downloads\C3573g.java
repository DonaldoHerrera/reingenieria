package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.collections.data.C2852h;
import com.soundcloud.android.features.library.downloads.s.b;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.features.library.downloads.g reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3573g extends C7540vYa implements C6376eYa<C6185ma, C2852h, Integer, b> {
    public static final C3573g a = new C3573g();

    C3573g() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return a((C6185ma) obj, (C2852h) obj2, ((Number) obj3).intValue());
    }

    public final b a(C6185ma maVar, C2852h hVar, int i) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(hVar, "<anonymous parameter 1>");
        return new b(maVar);
    }
}
