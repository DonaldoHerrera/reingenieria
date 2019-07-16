package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class Wb implements Callable<List<Sd>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ Nb d;

    Wb(Nb nb, String str, String str2, String str3) {
        this.d = nb;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.d.a.o();
        return this.d.a.i().a(this.a, this.b, this.c);
    }
}
