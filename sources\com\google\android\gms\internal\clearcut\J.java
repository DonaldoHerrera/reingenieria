package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public abstract class J {
    private int a;
    private int b;
    private boolean c;

    private J() {
        this.a = 100;
        this.b = BaseClientBuilder.API_PRIORITY_OTHER;
        this.c = false;
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static J a(byte[] bArr, int i, int i2, boolean z) {
        L l = new L(bArr, 0, i2, false);
        try {
            l.b(i2);
            return l;
        } catch (C0773ma e) {
            throw new IllegalArgumentException(e);
        }
    }
}
