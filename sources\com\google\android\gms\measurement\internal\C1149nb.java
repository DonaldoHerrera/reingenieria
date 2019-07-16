package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.nb reason: case insensitive filesystem */
final class C1149nb implements Runnable {
    private final C1154ob a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private C1149nb(String str, C1154ob obVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.checkNotNull(obVar);
        this.a = obVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
