package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Id.b;
import java.util.concurrent.Callable;

/* compiled from: StreamSelector.kt */
final class Dd<V> implements Callable<C7669xPa<? extends T>> {
    final /* synthetic */ C4527xd a;
    final /* synthetic */ C3509cea b;

    Dd(C4527xd xdVar, C3509cea cea) {
        this.a = xdVar;
        this.b = cea;
    }

    public final C7531vPa<b> call() {
        return C7531vPa.c(this.a.c(this.b));
    }
}
