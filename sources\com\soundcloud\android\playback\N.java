package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;
import java.util.concurrent.Callable;

/* compiled from: CurrentPlayQueueProvider.kt */
final class N<V> implements Callable<q> {
    final /* synthetic */ P a;

    N(P p) {
        this.a = p;
    }

    public final q call() {
        return this.a.b().h();
    }
}
