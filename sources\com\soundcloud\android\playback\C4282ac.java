package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.playback.ke.a;
import com.soundcloud.android.playback.players.k;
import com.soundcloud.android.playback.players.r;

/* renamed from: com.soundcloud.android.playback.ac reason: case insensitive filesystem */
/* compiled from: PlaybackListeners.kt */
public final class C4282ac {
    private final r a;
    private final C5327TLa b;
    /* access modifiers changed from: private */
    public final C4422sc c;
    private final C4523x d;
    private final ke e;
    /* access modifiers changed from: private */
    public final C4412qb f;
    private final E g;

    public C4282ac(r rVar, C5327TLa tLa, C4422sc scVar, C4523x xVar, ke keVar, C4412qb qbVar, E e2) {
        C7471uYa.b(rVar, "soundCloudPlayer");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(scVar, "playbackPerformanceListener");
        C7471uYa.b(xVar, "accountChangedListener");
        C7471uYa.b(keVar, "videoSurfaceProvider");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(e2, "audioPortTracker");
        this.a = rVar;
        this.b = tLa;
        this.c = scVar;
        this.d = xVar;
        this.e = keVar;
        this.f = qbVar;
        this.g = e2;
    }

    public final void a() {
        this.a.a((k) this.c);
        C5327TLa tLa = this.b;
        C5443XLa<C3699a> xLa = C3876taa.m;
        C7471uYa.a((Object) xLa, "EventQueue.ACTIVITY_LIFE_CYCLE");
        tLa.a(xLa, (C6776kQa<E>) new Zb<E>(this));
        this.d.a();
        this.e.a((a) new _b(this));
        this.g.c();
    }
}
