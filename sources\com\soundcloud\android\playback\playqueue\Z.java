package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;

/* compiled from: ArtworkPresenter.kt */
final class Z<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C4364ca a;

    Z(C4364ca caVar) {
        this.a = caVar;
    }

    /* renamed from: a */
    public final APa<Nna> apply(C3509cea cea) {
        C7471uYa.b(cea, "track");
        Ona c = this.a.f;
        C5327TLa b = this.a.c;
        C5443XLa<C4431ub> xLa = C3876taa.b;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
        APa h = b.a(xLa).a((C7256rQa<? super T>) new U<Object>(cea)).h(V.a);
        C7471uYa.a((Object) h, "eventBus.queue(EventQueu….toTrackPlaybackState() }");
        C5327TLa b2 = this.a.c;
        C5443XLa<C4519wc> xLa2 = C3876taa.c;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYBACK_PROGRESS");
        APa h2 = b2.a(xLa2).a((C7256rQa<? super T>) new W<Object>(cea)).h(Y.a);
        C7471uYa.a((Object) h2, "eventBus.queue(EventQueu…                        }");
        long i = cea.i();
        APa l = APa.l();
        C7471uYa.a((Object) l, "Observable.never()");
        APa c2 = APa.c(Mna.NONE);
        C7471uYa.a((Object) c2, "Observable.just(ScrubState.NONE)");
        return c.a(h, h2, i, l, c2);
    }
}
