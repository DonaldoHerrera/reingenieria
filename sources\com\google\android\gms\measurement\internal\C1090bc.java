package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bc reason: case insensitive filesystem */
final class C1090bc implements Callable<byte[]> {
    private final /* synthetic */ zzai a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Nb c;

    C1090bc(Nb nb, zzai zzai, String str) {
        this.c = nb;
        this.a = zzai;
        this.b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.c.a.o();
        this.c.a.l().a(this.a, this.b);
        throw null;
    }
}
