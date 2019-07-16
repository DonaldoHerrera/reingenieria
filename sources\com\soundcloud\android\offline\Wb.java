package com.soundcloud.android.offline;

import java.util.concurrent.Callable;

/* compiled from: DownloadOperations.kt */
final class Wb<V> implements Callable<T> {
    final /* synthetic */ Vb a;
    final /* synthetic */ C3508cda b;

    Wb(Vb vb, C3508cda cda) {
        this.a = vb;
        this.b = cda;
    }

    public final C3508cda call() {
        this.a.c.a(this.b);
        return this.b;
    }
}
