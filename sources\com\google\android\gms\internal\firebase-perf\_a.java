package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public abstract class _a {
    private int a;
    private int b;
    private boolean c;

    private _a() {
        this.a = 100;
        this.b = BaseClientBuilder.API_PRIORITY_OTHER;
        this.c = false;
    }

    static _a a(byte[] bArr, int i, int i2, boolean z) {
        C0820bb bbVar = new C0820bb(bArr, 0, i2, false);
        try {
            bbVar.a(i2);
            return bbVar;
        } catch (Eb e) {
            throw new IllegalArgumentException(e);
        }
    }
}
