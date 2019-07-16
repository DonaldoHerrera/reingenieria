package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

final class L extends J {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private L(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.d = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = this.h;
        this.e = z;
    }

    public final int a() {
        return this.h - this.i;
    }

    public final int b(int i2) throws C0773ma {
        if (i2 >= 0) {
            int a = i2 + a();
            int i3 = this.j;
            if (a <= i3) {
                this.j = a;
                this.f += this.g;
                int i4 = this.f;
                int i5 = i4 - this.i;
                int i6 = this.j;
                if (i5 > i6) {
                    this.g = i5 - i6;
                    this.f = i4 - this.g;
                } else {
                    this.g = 0;
                }
                return i3;
            }
            throw C0773ma.a();
        }
        throw new C0773ma("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
