package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: com.google.android.gms.internal.firebase-perf.bb reason: case insensitive filesystem */
final class C0820bb extends _a {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private C0820bb(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.d = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = this.h;
        this.e = z;
    }

    public final int a(int i2) throws Eb {
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
            throw new Eb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new Eb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int a() {
        return this.h - this.i;
    }
}
