package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.eb reason: case insensitive filesystem */
/* compiled from: PlayQueueExtenderProxy.kt */
public final class C4301eb {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final r b;
    /* access modifiers changed from: private */
    public final C4806CMa<Ya> c;

    public C4301eb(r rVar, C4806CMa<Ya> cMa) {
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(cMa, "playQueueExtender");
        this.b = rVar;
        this.c = cMa;
    }

    public final void a() {
        UPa uPa = this.a;
        VPa f = this.b.a().f((C6776kQa<? super T>) new C4291cb<Object>(this));
        C7471uYa.a((Object) f, "playQueueUpdates.current…tions(it.collectionUrn) }");
        XUa.a(uPa, f);
        UPa uPa2 = this.a;
        VPa f2 = this.b.b().f((C6776kQa<? super T>) new C4296db<Object>(this));
        C7471uYa.a((Object) f2, "playQueueUpdates.playQue…().onPlayQueueEvent(it) }");
        XUa.a(uPa2, f2);
    }
}
