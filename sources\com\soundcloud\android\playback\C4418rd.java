package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.PreloadItem;

/* renamed from: com.soundcloud.android.playback.rd reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4418rd<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C4428td a;
    final /* synthetic */ C3509cea b;

    C4418rd(C4428td tdVar, C3509cea cea) {
        this.a = tdVar;
        this.b = cea;
    }

    /* renamed from: a */
    public final C7531vPa<PreloadItem> apply(b bVar) {
        C7471uYa.b(bVar, "it");
        Ub e = this.a.a.a.m;
        C3509cea cea = this.b;
        C7471uYa.a((Object) cea, "nextTrack");
        return e.a(cea);
    }
}
