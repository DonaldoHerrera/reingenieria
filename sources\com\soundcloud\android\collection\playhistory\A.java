package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.playback.C4431ub;

/* compiled from: PlayHistoryController.kt */
final class A<T1, T2, R> implements C6504gQa<k, C4431ub, Eaa> {
    public static final A a = new A();

    A() {
    }

    /* renamed from: a */
    public final Eaa apply(k kVar, C4431ub ubVar) {
        C7471uYa.b(kVar, "currentPlayQueueItemEvent");
        C7471uYa.b(ubVar, "playStateEvent");
        return new Eaa(kVar, ubVar);
    }
}
