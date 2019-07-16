package com.soundcloud.android.sync;

import java.util.concurrent.Callable;

/* compiled from: SyncController.kt */
final class L<V> implements Callable<T> {
    final /* synthetic */ W a;

    L(W w) {
        this.a = w;
    }

    public final W call() {
        this.a.run();
        return this.a;
    }
}
