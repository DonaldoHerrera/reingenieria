package defpackage;

import com.google.android.exoplayer2.Format;

/* renamed from: qo reason: default package and case insensitive filesystem */
/* compiled from: MpegAudioReader */
public final class C1641qo implements C1425jo {
    private final Pq a;
    private final C1301fn b;
    private final String c;
    private String d;
    private C1424jn e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public C1641qo() {
        this(null);
    }

    private void b(Pq pq) {
        byte[] bArr = pq.a;
        int d2 = pq.d();
        for (int c2 = pq.c(); c2 < d2; c2++) {
            boolean z = (bArr[c2] & 255) == 255;
            boolean z2 = this.i && (bArr[c2] & 224) == 224;
            this.i = z;
            if (z2) {
                pq.e(c2 + 1);
                this.i = false;
                this.a.a[1] = bArr[c2];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        pq.e(d2);
    }

    private void c(Pq pq) {
        int min = Math.min(pq.a(), this.k - this.g);
        this.e.a(pq, min);
        this.g += min;
        int i2 = this.g;
        int i3 = this.k;
        if (i2 >= i3) {
            this.e.a(this.l, 1, i3, 0, null);
            this.l += this.j;
            this.g = 0;
            this.f = 0;
        }
    }

    private void d(Pq pq) {
        int min = Math.min(pq.a(), 4 - this.g);
        pq.a(this.a.a, this.g, min);
        this.g += min;
        if (this.g >= 4) {
            this.a.e(0);
            if (!C1301fn.a(this.a.h(), this.b)) {
                this.g = 0;
                this.f = 1;
                return;
            }
            C1301fn fnVar = this.b;
            this.k = fnVar.j;
            if (!this.h) {
                long j2 = ((long) fnVar.n) * 1000000;
                int i2 = fnVar.k;
                this.j = j2 / ((long) i2);
                this.e.a(Format.a(this.d, fnVar.i, null, -1, 4096, fnVar.l, i2, null, null, 0, this.c));
                this.h = true;
            }
            this.a.e(0);
            this.e.a(this.a, 4);
            this.f = 2;
        }
    }

    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    public void b() {
    }

    public C1641qo(String str) {
        this.f = 0;
        this.a = new Pq(4);
        this.a.a[0] = -1;
        this.b = new C1301fn();
        this.c = str;
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = bnVar.a(dVar.c(), 1);
    }

    public void a(long j2, int i2) {
        this.l = j2;
    }

    public void a(Pq pq) {
        while (pq.a() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                b(pq);
            } else if (i2 == 1) {
                d(pq);
            } else if (i2 == 2) {
                c(pq);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
