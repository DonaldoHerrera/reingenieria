package com.google.android.gms.measurement.internal;

import java.util.Map;

final /* synthetic */ class Pc implements Runnable {
    private final Qc a;
    private final int b;
    private final Exception c;
    private final byte[] d;
    private final Map e;

    Pc(Qc qc, int i, Exception exc, byte[] bArr, Map map) {
        this.a = qc;
        this.b = i;
        this.c = exc;
        this.d = bArr;
        this.e = map;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
