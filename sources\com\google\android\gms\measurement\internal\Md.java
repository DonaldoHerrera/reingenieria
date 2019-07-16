package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class Md implements C1154ob {
    private final /* synthetic */ String a;
    private final /* synthetic */ Kd b;

    Md(Kd kd, String str) {
        this.b = kd;
        this.a = str;
    }

    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.a(i, th, bArr, this.a);
    }
}
