package com.soundcloud.android.stations;

import java.util.concurrent.Callable;

/* compiled from: BriteStationStorage.kt */
final class P<V> implements Callable<Object> {
    final /* synthetic */ B a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ boolean c;

    P(B b2, C3508cda cda, boolean z) {
        this.a = b2;
        this.b = cda;
        this.c = z;
    }

    public final long call() {
        e eVar = new e(this.a.g.a(), b.b);
        eVar.a(this.b, (long) 7, this.c ? Long.valueOf(this.a.h.a()) : null, !this.c ? Long.valueOf(this.a.h.a()) : null);
        return eVar.x();
    }
}
