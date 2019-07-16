package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Id.a;
import com.soundcloud.android.playback.core.PlaybackEncryptionBundle;

/* compiled from: PlaybackItemFactory.kt */
final class Mb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Jb a;
    final /* synthetic */ long b;
    final /* synthetic */ C3509cea c;

    Mb(Jb jb, long j, C3509cea cea) {
        this.a = jb;
        this.b = j;
        this.c = cea;
    }

    /* renamed from: a */
    public final OfflinePlaybackItem apply(a aVar) {
        C7471uYa.b(aVar, "fileStream");
        C3344wV b2 = this.a.e.b();
        C7471uYa.a((Object) b2, "deviceSecret");
        byte[] b3 = b2.b();
        C7471uYa.a((Object) b3, "deviceSecret.key");
        byte[] a2 = b2.a();
        C7471uYa.a((Object) a2, "deviceSecret.initVector");
        OfflinePlaybackItem a3 = OfflinePlaybackItem.h.a(this.a.a(aVar.a()), this.b, this.c.i(), new PlaybackEncryptionBundle(b3, a2));
        Tma.a(a3, this.c.y());
        return a3;
    }
}
