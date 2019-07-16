package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* renamed from: com.soundcloud.android.playback.hb reason: case insensitive filesystem */
/* compiled from: PlayQueueFactory.kt */
final class C4316hb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4336lb a;
    final /* synthetic */ int b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ PlaySessionSource d;

    C4316hb(C4336lb lbVar, int i, C3508cda cda, PlaySessionSource playSessionSource) {
        this.a = lbVar;
        this.b = i;
        this.c = cda;
        this.d = playSessionSource;
    }

    /* renamed from: a */
    public final o apply(o oVar) {
        C7471uYa.b(oVar, "it");
        this.a.a(oVar, this.b, this.c, this.d);
        return oVar;
    }
}
