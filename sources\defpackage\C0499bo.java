package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.common.base.Ascii;

/* renamed from: bo reason: default package and case insensitive filesystem */
/* compiled from: Ac3Reader */
public final class C0499bo implements C1425jo {
    private final Oq a;
    private final Pq b;
    private final String c;
    private String d;
    private C1424jn e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private Format j;
    private int k;
    private long l;

    public C0499bo() {
        this(null);
    }

    private boolean b(Pq pq) {
        while (true) {
            boolean z = false;
            if (pq.a() <= 0) {
                return false;
            }
            if (!this.h) {
                if (pq.t() == 11) {
                    z = true;
                }
                this.h = z;
            } else {
                int t = pq.t();
                if (t == 119) {
                    this.h = false;
                    return true;
                }
                if (t == 11) {
                    z = true;
                }
                this.h = z;
            }
        }
    }

    private void c() {
        this.a.b(0);
        a a2 = C1362hm.a(this.a);
        Format format = this.j;
        if (!(format != null && a2.d == format.v && a2.c == format.w && a2.a == format.i)) {
            this.j = Format.a(this.d, a2.a, null, -1, -1, a2.d, a2.c, null, null, 0, this.c);
            this.e.a(this.j);
        }
        this.k = a2.e;
        this.i = (((long) a2.f) * 1000000) / ((long) this.j.w);
    }

    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    public void b() {
    }

    public C0499bo(String str) {
        this.a = new Oq(new byte[128]);
        this.b = new Pq(this.a.a);
        this.f = 0;
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
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(pq.a(), this.k - this.g);
                        this.e.a(pq, min);
                        this.g += min;
                        int i3 = this.g;
                        int i4 = this.k;
                        if (i3 == i4) {
                            this.e.a(this.l, 1, i4, 0, null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (a(pq, this.b.a, 128)) {
                    c();
                    this.b.e(0);
                    this.e.a(this.b, 128);
                    this.f = 2;
                }
            } else if (b(pq)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = Ascii.VT;
                bArr[1] = 119;
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
