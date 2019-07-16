package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class Vb implements Callable<List<zzq>> {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ Nb d;

    Vb(Nb nb, zzn zzn, String str, String str2) {
        this.d = nb;
        this.a = zzn;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.d.a.o();
        return this.d.a.i().b(this.a.a, this.b, this.c);
    }
}
