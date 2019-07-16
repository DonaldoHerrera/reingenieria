package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.r.a;

/* compiled from: MediaPeriodInfo */
final class F {
    public final a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    F(a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public F a(long j) {
        if (j == this.c) {
            return this;
        }
        F f2 = new F(this.a, this.b, j, this.d, this.e, this.f, this.g);
        return f2;
    }

    public F b(long j) {
        if (j == this.b) {
            return this;
        }
        F f2 = new F(this.a, j, this.c, this.d, this.e, this.f, this.g);
        return f2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f2 = (F) obj;
        if (!(this.b == f2.b && this.c == f2.c && this.d == f2.d && this.e == f2.e && this.f == f2.f && this.g == f2.g && C0471ar.a((Object) this.a, (Object) f2.a))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
