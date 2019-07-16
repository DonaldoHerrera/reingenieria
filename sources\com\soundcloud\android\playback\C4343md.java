package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: com.soundcloud.android.playback.md reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4343md<T> implements C7256rQa<RVa> {
    final /* synthetic */ C4323id a;

    C4343md(C4323id idVar) {
        this.a = idVar;
    }

    /* renamed from: a */
    public final boolean test(RVa rVa) {
        C7471uYa.b(rVa, "it");
        if (this.a.h.t()) {
            q n = this.a.h.n();
            String str = "playQueueManager.nextPlayQueueItem";
            C7471uYa.a((Object) n, str);
            if (n.j()) {
                C4323id idVar = this.a;
                q n2 = idVar.h.n();
                C7471uYa.a((Object) n2, str);
                if (idVar.a(n2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
