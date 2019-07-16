package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.dc reason: case insensitive filesystem */
final class C1100dc implements Callable<List<Sd>> {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Nb b;

    C1100dc(Nb nb, zzn zzn) {
        this.b = nb;
        this.a = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.b.a.o();
        return this.b.a.i().a(this.a.a);
    }
}
