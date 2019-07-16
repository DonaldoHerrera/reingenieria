package com.soundcloud.android.ads;

import java.util.concurrent.Callable;

/* compiled from: AdsOperations.kt */
final class Ua<V> implements Callable<T> {
    final /* synthetic */ Na a;
    final /* synthetic */ String b;
    final /* synthetic */ Fa c;

    Ua(Na na, String str, Fa fa) {
        this.a = na;
        this.b = str;
        this.c = fa;
    }

    public final hfa call() {
        return this.a.a(this.b, this.c);
    }
}
