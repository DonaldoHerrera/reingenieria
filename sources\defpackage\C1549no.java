package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;

/* renamed from: no reason: default package and case insensitive filesystem */
/* compiled from: H265Reader */
public final class C1549no implements C1425jo {
    private final C1910zo a;
    private String b;
    private C1424jn c;
    private a d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final C1670ro g = new C1670ro(32, 128);
    private final C1670ro h = new C1670ro(33, 128);
    private final C1670ro i = new C1670ro(34, 128);
    private final C1670ro j = new C1670ro(39, 128);
    private final C1670ro k = new C1670ro(40, 128);
    private long l;
    private long m;
    private final Pq n = new Pq();

    /* renamed from: no$a */
    /* compiled from: H265Reader */
    private static final class a {
        private final C1424jn a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(C1424jn jnVar) {
            this.a = jnVar;
        }

        public void a() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void a(long j2, int i2, int i3, long j3) {
            this.g = false;
            this.h = false;
            this.e = j3;
            this.d = 0;
            this.b = j2;
            boolean z = true;
            if (i3 >= 32) {
                if (!this.j && this.i) {
                    a(i2);
                    this.i = false;
                }
                if (i3 <= 34) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            this.c = i3 >= 16 && i3 <= 21;
            if (!this.c && i3 > 9) {
                z = false;
            }
            this.f = z;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f) {
                int i4 = i2 + 2;
                int i5 = this.d;
                int i6 = i4 - i5;
                if (i6 < i3) {
                    this.g = (bArr[i6] & 128) != 0;
                    this.f = false;
                    return;
                }
                this.d = i5 + (i3 - i2);
            }
        }

        public void a(long j2, int i2) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (this.i) {
                    a(i2 + ((int) (j2 - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.i = true;
                this.m = this.c;
            }
        }

        private void a(int i2) {
            int i3 = (int) (this.b - this.k);
            int i4 = i2;
            this.a.a(this.l, this.m ? 1 : 0, i3, i4, null);
        }
    }

    public C1549no(C1910zo zoVar) {
        this.a = zoVar;
    }

    private void b(long j2, int i2, int i3, long j3) {
        if (this.e) {
            this.d.a(j2, i2, i3, j3);
        } else {
            this.g.b(i3);
            this.h.b(i3);
            this.i.b(i3);
        }
        this.j.b(i3);
        this.k.b(i3);
    }

    public void a() {
        Mq.a(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        this.d.a();
        this.l = 0;
    }

    public void b() {
    }

    private static void b(Qq qq) {
        int d2 = qq.d();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            if (i3 != 0) {
                z = qq.b();
            }
            if (z) {
                qq.e();
                qq.d();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (qq.b()) {
                        qq.e();
                    }
                }
            } else {
                int d3 = qq.d();
                int d4 = qq.d();
                int i5 = d3 + d4;
                for (int i6 = 0; i6 < d3; i6++) {
                    qq.d();
                    qq.e();
                }
                for (int i7 = 0; i7 < d4; i7++) {
                    qq.d();
                    qq.e();
                }
                i2 = i5;
            }
        }
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.b = dVar.b();
        this.c = bnVar.a(dVar.c(), 2);
        this.d = new a(this.c);
        this.a.a(bnVar, dVar);
    }

    public void a(long j2, int i2) {
        this.m = j2;
    }

    public void a(Pq pq) {
        Pq pq2 = pq;
        while (pq.a() > 0) {
            int c2 = pq.c();
            int d2 = pq.d();
            byte[] bArr = pq2.a;
            this.l += (long) pq.a();
            this.c.a(pq2, pq.a());
            while (true) {
                if (c2 < d2) {
                    int a2 = Mq.a(bArr, c2, d2, this.f);
                    if (a2 == d2) {
                        a(bArr, c2, d2);
                        return;
                    }
                    int a3 = Mq.a(bArr, a2);
                    int i2 = a2 - c2;
                    if (i2 > 0) {
                        a(bArr, c2, a2);
                    }
                    int i3 = d2 - a2;
                    long j2 = this.l - ((long) i3);
                    int i4 = i2 < 0 ? -i2 : 0;
                    long j3 = j2;
                    int i5 = i3;
                    a(j3, i5, i4, this.m);
                    b(j3, i5, a3, this.m);
                    c2 = a2 + 3;
                }
            }
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (this.e) {
            this.d.a(bArr, i2, i3);
        } else {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void a(long j2, int i2, int i3, long j3) {
        if (this.e) {
            this.d.a(j2, i2);
        } else {
            this.g.a(i3);
            this.h.a(i3);
            this.i.a(i3);
            if (this.g.a() && this.h.a() && this.i.a()) {
                this.c.a(a(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.a(i3)) {
            C1670ro roVar = this.j;
            this.n.a(this.j.d, Mq.c(roVar.d, roVar.e));
            this.n.f(5);
            this.a.a(j3, this.n);
        }
        if (this.k.a(i3)) {
            C1670ro roVar2 = this.k;
            this.n.a(this.k.d, Mq.c(roVar2.d, roVar2.e));
            this.n.f(5);
            this.a.a(j3, this.n);
        }
    }

    private static Format a(String str, C1670ro roVar, C1670ro roVar2, C1670ro roVar3) {
        float f2;
        C1670ro roVar4 = roVar;
        C1670ro roVar5 = roVar2;
        C1670ro roVar6 = roVar3;
        int i2 = roVar4.e;
        byte[] bArr = new byte[(roVar5.e + i2 + roVar6.e)];
        System.arraycopy(roVar4.d, 0, bArr, 0, i2);
        System.arraycopy(roVar5.d, 0, bArr, roVar4.e, roVar5.e);
        System.arraycopy(roVar6.d, 0, bArr, roVar4.e + roVar5.e, roVar6.e);
        Qq qq = new Qq(roVar5.d, 0, roVar5.e);
        qq.c(44);
        int b2 = qq.b(3);
        qq.e();
        qq.c(88);
        qq.c(8);
        int i3 = 0;
        for (int i4 = 0; i4 < b2; i4++) {
            if (qq.b()) {
                i3 += 89;
            }
            if (qq.b()) {
                i3 += 8;
            }
        }
        qq.c(i3);
        if (b2 > 0) {
            qq.c((8 - b2) * 2);
        }
        qq.d();
        int d2 = qq.d();
        if (d2 == 3) {
            qq.e();
        }
        int d3 = qq.d();
        int d4 = qq.d();
        if (qq.b()) {
            d3 -= ((d2 == 1 || d2 == 2) ? 2 : 1) * (qq.d() + qq.d());
            d4 -= (d2 == 1 ? 2 : 1) * (qq.d() + qq.d());
        }
        int i5 = d3;
        int i6 = d4;
        qq.d();
        qq.d();
        int d5 = qq.d();
        for (int i7 = qq.b() ? 0 : b2; i7 <= b2; i7++) {
            qq.d();
            qq.d();
            qq.d();
        }
        qq.d();
        qq.d();
        qq.d();
        qq.d();
        qq.d();
        qq.d();
        if (qq.b() && qq.b()) {
            a(qq);
        }
        qq.c(2);
        if (qq.b()) {
            qq.c(8);
            qq.d();
            qq.d();
            qq.e();
        }
        b(qq);
        if (qq.b()) {
            for (int i8 = 0; i8 < qq.d(); i8++) {
                qq.c(d5 + 4 + 1);
            }
        }
        qq.c(2);
        float f3 = 1.0f;
        if (qq.b() && qq.b()) {
            int b3 = qq.b(8);
            if (b3 == 255) {
                int b4 = qq.b(16);
                int b5 = qq.b(16);
                if (!(b4 == 0 || b5 == 0)) {
                    f3 = ((float) b4) / ((float) b5);
                }
                f2 = f3;
            } else {
                float[] fArr = Mq.b;
                if (b3 < fArr.length) {
                    f2 = fArr[b3];
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(b3);
                    Iq.d("H265Reader", sb.toString());
                }
            }
            return Format.a(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (DrmInitData) null);
        }
        f2 = 1.0f;
        return Format.a(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (DrmInitData) null);
    }

    private static void a(Qq qq) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                if (!qq.b()) {
                    qq.d();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        qq.c();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        qq.c();
                    }
                }
                int i5 = 3;
                if (i2 != 3) {
                    i5 = 1;
                }
                i3 += i5;
            }
        }
    }
}
