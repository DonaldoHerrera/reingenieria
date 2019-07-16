package defpackage;

import com.google.android.exoplayer2.Format;

/* renamed from: do reason: invalid class name and default package */
/* compiled from: Ac4Reader */
public final class Cdo implements C1425jo {
    private final Oq a;
    private final Pq b;
    private final String c;
    private String d;
    private C1424jn e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private Format k;
    private int l;
    private long m;

    public Cdo() {
        this(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    private boolean b(Pq pq) {
        boolean z;
        int t;
        while (true) {
            z = false;
            if (pq.a() <= 0) {
                return false;
            }
            if (!this.h) {
                if (pq.t() == 172) {
                    z = true;
                }
                this.h = z;
            } else {
                t = pq.t();
                this.h = t == 172;
                if (t == 64 || t == 65) {
                    if (t == 65) {
                        z = true;
                    }
                }
            }
        }
        if (t == 65) {
        }
        this.i = z;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if ("audio/ac4".equals(r1.i) == false) goto L_0x0026;
     */
    private void c() {
        this.a.b(0);
        a a2 = C1423jm.a(this.a);
        Format format = this.k;
        if (format != null && a2.c == format.v && a2.b == format.w) {
        }
        this.k = Format.a(this.d, "audio/ac4", null, -1, -1, a2.c, a2.b, null, null, 0, this.c);
        this.e.a(this.k);
        this.l = a2.d;
        this.j = (((long) a2.e) * 1000000) / ((long) this.k.w);
    }

    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
    }

    public void b() {
    }

    public Cdo(String str) {
        this.a = new Oq(new byte[16]);
        this.b = new Pq(this.a.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.c = str;
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = bnVar.a(dVar.c(), 1);
    }

    public void a(long j2, int i2) {
        this.m = j2;
    }

    public void a(Pq pq) {
        while (pq.a() > 0) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(pq.a(), this.l - this.g);
                        this.e.a(pq, min);
                        this.g += min;
                        int i3 = this.g;
                        int i4 = this.l;
                        if (i3 == i4) {
                            this.e.a(this.m, 1, i4, 0, null);
                            this.m += this.j;
                            this.f = 0;
                        }
                    }
                } else if (a(pq, this.b.a, 16)) {
                    c();
                    this.b.e(0);
                    this.e.a(this.b, 16);
                    this.f = 2;
                }
            } else if (b(pq)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = -84;
                bArr[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    private boolean a(Pq pq, byte[] bArr, int i2) {
        int min = Math.min(pq.a(), i2 - this.g);
        pq.a(bArr, this.g, min);
        this.g += min;
        return this.g == i2;
    }
}
