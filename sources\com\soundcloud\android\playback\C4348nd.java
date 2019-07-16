package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: com.soundcloud.android.playback.nd reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4348nd<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4323id a;

    C4348nd(C4323id idVar) {
        this.a = idVar;
    }

    /* renamed from: a */
    public final C3508cda apply(RVa rVa) {
        C7471uYa.b(rVa, "it");
        q n = this.a.h.n();
        C7471uYa.a((Object) n, "playQueueManager.nextPlayQueueItem");
        return n.c();
    }
}
