package defpackage;

/* renamed from: Fq reason: default package */
/* compiled from: FlacStreamInfo */
public final class Fq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public Fq(byte[] bArr, int i) {
        Oq oq = new Oq(bArr);
        oq.b(i * 8);
        this.a = oq.a(16);
        this.b = oq.a(16);
        this.c = oq.a(24);
        this.d = oq.a(24);
        this.e = oq.a(20);
        this.f = oq.a(3) + 1;
        this.g = oq.a(5) + 1;
        this.h = ((((long) oq.a(4)) & 15) << 32) | (((long) oq.a(32)) & 4294967295L);
    }

    public int a() {
        return this.g * this.e;
    }

    public long b() {
        return (this.h * 1000000) / ((long) this.e);
    }
}
