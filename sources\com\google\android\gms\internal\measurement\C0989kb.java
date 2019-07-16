package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.kb reason: case insensitive filesystem */
public abstract class C0989kb {
    int a;
    int b;
    private int c;
    C0995lb d;
    private boolean e;

    private C0989kb() {
        this.b = 100;
        this.c = BaseClientBuilder.API_PRIORITY_OTHER;
        this.e = false;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0989kb a(byte[] bArr, int i, int i2) {
        return a(bArr, i, i2, false);
    }

    public static int g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double a() throws IOException;

    public abstract <T extends C1026qc> T a(C1073yc<T> ycVar, C1042tb tbVar) throws IOException;

    public abstract void a(int i) throws Rb;

    public abstract float b() throws IOException;

    public abstract boolean b(int i) throws IOException;

    public final int c(int i) {
        if (i >= 0) {
            int i2 = this.b;
            this.b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String c() throws IOException;

    public abstract int d() throws IOException;

    public abstract int d(int i) throws Rb;

    public abstract long e() throws IOException;

    public abstract void e(int i);

    public abstract long f() throws IOException;

    public abstract void f(int i) throws IOException;

    public abstract int g() throws IOException;

    public abstract long h() throws IOException;

    public abstract int i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract String k() throws IOException;

    public abstract Ya l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract boolean s() throws IOException;

    public abstract int t();

    static C0989kb a(byte[] bArr, int i, int i2, boolean z) {
        C1001mb mbVar = new C1001mb(bArr, i, i2, false);
        try {
            mbVar.d(i2);
            return mbVar;
        } catch (Rb e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
