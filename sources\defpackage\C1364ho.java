package defpackage;

import com.google.android.exoplayer2.Format;

/* renamed from: ho reason: default package and case insensitive filesystem */
/* compiled from: DtsReader */
public final class C1364ho implements C1425jo {
    private final Pq a = new Pq(new byte[18]);
    private final String b;
    private String c;
    private C1424jn d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private Format i;
    private int j;
    private long k;

    public C1364ho(String str) {
        this.b = str;
    }

    private boolean b(Pq pq) {
        while (pq.a() > 0) {
            this.g <<= 8;
            this.g |= pq.t();
            if (Bm.a(this.g)) {
                byte[] bArr = this.a.a;
                int i2 = this.g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] bArr = this.a.a;
        if (this.i == null) {
            this.i = Bm.a(bArr, this.c, this.b, null);
            this.d.a(this.i);
        }
        this.j = Bm.a(bArr);
        this.h = (long) ((int) ((((long) Bm.b(bArr)) * 1000000) / ((long) this.i.w)));
    }

    public void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public void b() {
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = bnVar.a(dVar.c(), 1);
    }

    public void a(long j2, int i2) {
        this.k = j2;
    }

    public void a(Pq pq) {
        while (pq.a() > 0) {
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(pq.a(), this.j - this.f);
                        this.d.a(pq, min);
                        this.f += min;
                        int i3 = this.f;
                        int i4 = this.j;
                        if (i3 == i4) {
                            this.d.a(this.k, 1, i4, 0, null);
                            this.k += this.h;
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(pq, this.a.a, 18)) {
                    c();
                    this.a.e(0);
                    this.d.a(this.a, 18);
                    this.e = 2;
                }
            } else if (b(pq)) {
                this.e = 1;
            }
        }
    }

    private boolean a(Pq pq, byte[] bArr, int i2) {
        int min = Math.min(pq.a(), i2 - this.f);
        pq.a(bArr, this.f, min);
        this.f += min;
        return this.f == i2;
    }
}
