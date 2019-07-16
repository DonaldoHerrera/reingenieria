package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: DefaultPlaySessionController.kt */
final class U<T> implements C6776kQa<q> {
    final /* synthetic */ S a;

    U(S s) {
        this.a = s;
    }

    /* renamed from: a */
    public final void accept(q qVar) {
        C5327TLa b = this.a.l;
        C5443XLa<Haa> xLa = C3876taa.f;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_COMMAND");
        b.c(xLa, Haa.u());
    }
}
