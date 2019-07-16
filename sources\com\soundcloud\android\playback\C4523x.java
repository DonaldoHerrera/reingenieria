package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3707i;

/* renamed from: com.soundcloud.android.playback.x reason: case insensitive filesystem */
/* compiled from: PlaybackListeners.kt */
public final class C4523x {
    private final C5327TLa a;
    /* access modifiers changed from: private */
    public final C4412qb b;
    private final HPa c;

    public C4523x(C5327TLa tLa, C4412qb qbVar, HPa hPa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = tLa;
        this.b = qbVar;
        this.c = hPa;
    }

    public final void a() {
        C5327TLa tLa = this.a;
        C5443XLa<C3707i> xLa = C3876taa.i;
        C7471uYa.a((Object) xLa, "EventQueue.CURRENT_USER_CHANGED");
        tLa.a(xLa).a((C7256rQa<? super T>) C4511v.a).a(this.c).f((C6776kQa<? super T>) new C4516w<Object>(this));
    }
}
