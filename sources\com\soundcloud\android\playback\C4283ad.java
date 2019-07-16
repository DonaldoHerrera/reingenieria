package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.ad reason: case insensitive filesystem */
/* compiled from: PlaylistExploderProxy.kt */
public final class C4283ad {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final r b;
    /* access modifiers changed from: private */
    public final C4806CMa<Yc> c;

    public C4283ad(r rVar, C4806CMa<Yc> cMa) {
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(cMa, "playlistExploder");
        this.b = rVar;
        this.c = cMa;
    }

    public final void a() {
        UPa uPa = this.a;
        VPa f = this.b.a().f((C6776kQa<? super T>) new Zc<Object>(this));
        C7471uYa.a((Object) f, "playQueueUpdates.current…nCurrentPlayQueueItem() }");
        XUa.a(uPa, f);
        UPa uPa2 = this.a;
        VPa f2 = this.b.b().f((C6776kQa<? super T>) new _c<Object>(this));
        C7471uYa.a((Object) f2, "playQueueUpdates.playQue…r.get().onPlayQueue(it) }");
        XUa.a(uPa2, f2);
    }
}
