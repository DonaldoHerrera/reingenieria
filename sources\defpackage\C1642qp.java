package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: qp reason: default package and case insensitive filesystem */
/* compiled from: PgsDecoder */
public final class C1642qp extends Vo {
    private final Pq o = new Pq();
    private final Pq p = new Pq();
    private final a q = new a();
    private Inflater r;

    /* renamed from: qp$a */
    /* compiled from: PgsDecoder */
    private static final class a {
        private final Pq a = new Pq();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* access modifiers changed from: private */
        public void a(Pq pq, int i2) {
            if (i2 >= 4) {
                pq.f(3);
                int i3 = i2 - 4;
                if ((pq.t() & 128) != 0) {
                    if (i3 >= 7) {
                        int w = pq.w();
                        if (w >= 4) {
                            this.h = pq.z();
                            this.i = pq.z();
                            this.a.c(w - 4);
                            i3 -= 7;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int c2 = this.a.c();
                int d2 = this.a.d();
                if (c2 < d2 && i3 > 0) {
                    int min = Math.min(i3, d2 - c2);
                    pq.a(this.a.a, c2, min);
                    this.a.e(c2 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void b(Pq pq, int i2) {
            if (i2 >= 19) {
                this.d = pq.z();
                this.e = pq.z();
                pq.f(11);
                this.f = pq.z();
                this.g = pq.z();
            }
        }

        /* access modifiers changed from: private */
        public void c(Pq pq, int i2) {
            if (i2 % 5 == 2) {
                pq.f(2);
                Arrays.fill(this.b, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int t = pq.t();
                    int t2 = pq.t();
                    int t3 = pq.t();
                    int t4 = pq.t();
                    int t5 = pq.t();
                    double d2 = (double) t2;
                    double d3 = (double) (t3 - 128);
                    int i5 = (int) ((1.402d * d3) + d2);
                    int i6 = i4;
                    double d4 = (double) (t4 - 128);
                    int i7 = (int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d));
                    int i8 = (int) (d2 + (d4 * 1.772d));
                    this.b[t] = C0471ar.a(i8, 0, 255) | (C0471ar.a(i7, 0, 255) << 8) | (t5 << 24) | (C0471ar.a(i5, 0, 255) << 16);
                    i4 = i6 + 1;
                }
                this.c = true;
            }
        }

        public void b() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.c(0);
            this.c = false;
        }

        public Uo a() {
            int i2;
            int i3;
            int i4;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.d() == 0 || this.a.c() != this.a.d() || !this.c) {
                return null;
            }
            this.a.e(0);
            int[] iArr = new int[(this.h * this.i)];
            int i5 = 0;
            while (i5 < iArr.length) {
                int t = this.a.t();
                if (t != 0) {
                    i4 = i5 + 1;
                    iArr[i5] = this.b[t];
                } else {
                    int t2 = this.a.t();
                    if (t2 != 0) {
                        if ((t2 & 64) == 0) {
                            i2 = t2 & 63;
                        } else {
                            i2 = ((t2 & 63) << 8) | this.a.t();
                        }
                        if ((t2 & 128) == 0) {
                            i3 = 0;
                        } else {
                            i3 = this.b[this.a.t()];
                        }
                        i4 = i2 + i5;
                        Arrays.fill(iArr, i5, i4, i3);
                    }
                }
                i5 = i4;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Config.ARGB_8888);
            float f2 = (float) this.f;
            int i6 = this.d;
            float f3 = f2 / ((float) i6);
            float f4 = (float) this.g;
            int i7 = this.e;
            Uo uo = new Uo(createBitmap, f3, 0, f4 / ((float) i7), 0, ((float) this.h) / ((float) i6), ((float) this.i) / ((float) i7));
            return uo;
        }
    }

    public C1642qp() {
        super("PgsDecoder");
    }

    /* access modifiers changed from: protected */
    public Xo a(byte[] bArr, int i, boolean z) throws Zo {
        this.o.a(bArr, i);
        a(this.o);
        this.q.b();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            Uo a2 = a(this.o, this.q);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new C1671rp(Collections.unmodifiableList(arrayList));
    }

    private void a(Pq pq) {
        if (pq.a() > 0 && pq.f() == 120) {
            if (this.r == null) {
                this.r = new Inflater();
            }
            if (C0471ar.a(pq, this.p, this.r)) {
                Pq pq2 = this.p;
                pq.a(pq2.a, pq2.d());
            }
        }
    }

    private static Uo a(Pq pq, a aVar) {
        int d = pq.d();
        int t = pq.t();
        int z = pq.z();
        int c = pq.c() + z;
        Uo uo = null;
        if (c > d) {
            pq.e(d);
            return null;
        }
        if (t != 128) {
            switch (t) {
                case 20:
                    aVar.c(pq, z);
                    break;
                case 21:
                    aVar.a(pq, z);
                    break;
                case 22:
                    aVar.b(pq, z);
                    break;
            }
        } else {
            uo = aVar.a();
            aVar.b();
        }
        pq.e(c);
        return uo;
    }
}
