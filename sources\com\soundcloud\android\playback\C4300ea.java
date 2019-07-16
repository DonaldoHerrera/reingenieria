package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* renamed from: com.soundcloud.android.playback.ea reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController.kt */
final class C4300ea<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ S a;
    final /* synthetic */ PlaySessionSource b;
    final /* synthetic */ int c;

    C4300ea(S s, PlaySessionSource playSessionSource, int i) {
        this.a = s;
        this.b = playSessionSource;
        this.c = i;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(o oVar) {
        C7471uYa.b(oVar, "newQueue");
        return IPa.a(C4536zc.c()).a(this.a.a()).c((C6776kQa<? super T>) new C4295da<Object>(this, oVar));
    }
}
