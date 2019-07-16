package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zf;
import java.util.Map;

final /* synthetic */ class Lb implements Nc {
    private final Mb a;
    private final zf b;

    Lb(Mb mb, zf zfVar) {
        this.a = mb;
        this.b = zfVar;
    }

    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.a.a(this.b, str, i, th, bArr, map);
    }
}
