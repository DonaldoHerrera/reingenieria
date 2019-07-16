package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;

/* renamed from: jw reason: default package and case insensitive filesystem */
public abstract class C1433jw {
    int a;
    int b;
    int c;
    C1619pw d;
    private boolean e;

    private C1433jw() {
        this.b = 100;
        this.c = BaseClientBuilder.API_PRIORITY_OTHER;
        this.e = false;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static C1433jw a(byte[] bArr, int i, int i2, boolean z) {
        C1495lw lwVar = new C1495lw(bArr, 0, i2, false);
        try {
            lwVar.a(i2);
            return lwVar;
        } catch (C0225Kw e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double a() throws IOException;

    public abstract int a(int i) throws C0225Kw;

    public abstract float b() throws IOException;

    public abstract void b(int i);

    public abstract String c() throws IOException;

    public abstract int d() throws IOException;

    public abstract void d(int i) throws C0225Kw;

    public abstract long e() throws IOException;

    public abstract boolean e(int i) throws IOException;

    public abstract long f() throws IOException;

    public abstract int g() throws IOException;

    public abstract long h() throws IOException;

    public abstract int i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract String k() throws IOException;

    public abstract C0289Zv l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract boolean s() throws IOException;

    public abstract int t();
}
