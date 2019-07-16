package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.PreloadItem;

/* renamed from: com.soundcloud.android.playback.sd reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4423sd<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3509cea a;

    C4423sd(C3509cea cea) {
        this.a = cea;
    }

    /* renamed from: a */
    public final c apply(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        return new c(this.a.y(), preloadItem);
    }
}
