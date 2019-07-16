package com.soundcloud.android.playback;

/* compiled from: PlayPublisherProxy.kt */
public final class Ta {
    private final UPa a = new UPa();
    private final C5327TLa b;
    private final C4806CMa<Pa> c;

    public Ta(C5327TLa tLa, C4806CMa<Pa> cMa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(cMa, "controller");
        this.b = tLa;
        this.c = cMa;
    }

    public final void b() {
        UPa uPa = this.a;
        C5327TLa tLa = this.b;
        C5443XLa<C4431ub> xLa = C3876taa.b;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
        VPa f = tLa.a(xLa).a((C7256rQa<? super T>) new Ra<Object>(this)).f((C6776kQa<? super T>) new Sa<Object>(this));
        C7471uYa.a((Object) f, "eventBus.queue(EventQueu…nPlaybackStateChanged() }");
        XUa.a(uPa, f);
    }

    public final C4806CMa<Pa> a() {
        return this.c;
    }

    /* access modifiers changed from: private */
    public final boolean a(C4431ub ubVar) {
        return !ubVar.s().e() && ubVar.j();
    }
}
