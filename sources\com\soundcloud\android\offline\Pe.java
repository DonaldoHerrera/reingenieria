package com.soundcloud.android.offline;

import java.util.List;

/* compiled from: TrackDownloadsStorage.kt */
final class Pe extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ De a;
    final /* synthetic */ Id b;

    Pe(De de, Id id) {
        this.a = de;
        this.b = id;
        super(0);
    }

    public final void d() {
        De de = this.a;
        List b2 = this.b.b();
        C7471uYa.a((Object) b2, "offlineContentUpdates.newTracksToDownload()");
        de.c(b2);
        De de2 = this.a;
        List f = this.b.f();
        C7471uYa.a((Object) f, "offlineContentUpdates.tracksToMarkForDeletion()");
        de2.f(f);
        De de3 = this.a;
        List g = this.b.g();
        C7471uYa.a((Object) g, "offlineContentUpdates.tracksToRestore()");
        de3.d(g);
        De de4 = this.a;
        List h = this.b.h();
        C7471uYa.a((Object) h, "offlineContentUpdates.unavailableTracks()");
        de4.e(h);
    }
}
