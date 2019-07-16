package com.soundcloud.android.playback.widget;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.playback.C4431ub;

/* compiled from: PlayerWidgetControllerProxy.kt */
public final class s {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final C5327TLa b;
    private final C3989m c;
    private final C4806CMa<l> d;
    private final r e;

    public s(C5327TLa tLa, C3989m mVar, C4806CMa<l> cMa, r rVar) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(mVar, "likesStateProvider");
        C7471uYa.b(cMa, "controller");
        C7471uYa.b(rVar, "playQueueUpdates");
        this.b = tLa;
        this.c = mVar;
        this.d = cMa;
        this.e = rVar;
    }

    public final C4806CMa<l> a() {
        return this.d;
    }

    public final void b() {
        UPa uPa = this.a;
        VPa f = this.c.g().f((C6776kQa<? super T>) new m<Object>(this));
        C7471uYa.a((Object) f, "likesStateProvider.track…).onTrackLikeChange(it) }");
        XUa.a(uPa, f);
        UPa uPa2 = this.a;
        C5327TLa tLa = this.b;
        C5443XLa<Uaa> xLa = C3876taa.p;
        C7471uYa.a((Object) xLa, "EventQueue.TRACK_CHANGED");
        XUa.a(uPa2, tLa.a(xLa, (C6776kQa<E>) new n<E>(this)));
        UPa uPa3 = this.a;
        C5327TLa tLa2 = this.b;
        C5443XLa<C> xLa2 = C3876taa.s;
        C7471uYa.a((Object) xLa2, "EventQueue.REPOST_CHANGED");
        XUa.a(uPa3, tLa2.a(xLa2, (C6776kQa<E>) new o<E>(this)));
        UPa uPa4 = this.a;
        C5327TLa tLa3 = this.b;
        C5443XLa<C3707i> xLa3 = C3876taa.i;
        C7471uYa.a((Object) xLa3, "EventQueue.CURRENT_USER_CHANGED");
        XUa.a(uPa4, tLa3.a(xLa3, (C6776kQa<E>) new p<E>(this)));
        UPa uPa5 = this.a;
        C5327TLa tLa4 = this.b;
        C5443XLa<C4431ub> xLa4 = C3876taa.b;
        C7471uYa.a((Object) xLa4, "EventQueue.PLAYBACK_STATE_CHANGED");
        XUa.a(uPa5, tLa4.a(xLa4, (C6776kQa<E>) new q<E>(this)));
        UPa uPa6 = this.a;
        VPa f2 = this.e.a().f((C6776kQa<? super T>) new r<Object>(this));
        C7471uYa.a((Object) f2, "playQueueUpdates.current…onCurrentItemChange(it) }");
        XUa.a(uPa6, f2);
    }
}
