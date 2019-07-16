package com.soundcloud.android.features.library.downloads;

import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.b reason: case insensitive filesystem */
/* compiled from: DownloadsAdapter.kt */
final class C3568b<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3567a a;

    C3568b(C3567a aVar) {
        this.a = aVar;
    }

    /* renamed from: a */
    public final HVa<s, List<s>> apply(Integer num) {
        C7471uYa.b(num, "it");
        return NVa.a(this.a.g(num.intValue()), this.a.h());
    }
}
