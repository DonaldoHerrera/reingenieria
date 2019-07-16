package com.soundcloud.android.ads;

import java.util.concurrent.Callable;

/* compiled from: PlayerVideoAdsController.kt */
final class Kc<V> implements Callable<T> {
    final /* synthetic */ Oc a;

    Kc(Oc oc) {
        this.a = oc;
    }

    public final boolean call() {
        return this.a.a();
    }
}
