package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Ln reason: default package */
/* compiled from: FlacReader */
final class Ln extends Sn {
    /* access modifiers changed from: private */
    public Fq n;
    private a o;

    /* renamed from: Ln$a */
    /* compiled from: FlacReader */
    private class a implements Pn, C1363hn {
        private long[] a;
        private long[] b;
        private long c = -1;
        private long d = -1;

        public a() {
        }

        public void a(Pq pq) {
            pq.f(1);
            int w = pq.w() / 18;
            this.a = new long[w];
            this.b = new long[w];
            for (int i = 0; i < w; i++) {
                this.a[i] = pq.p();
                this.b[i] = pq.p();
                pq.f(2);
            }
        }

        public boolean b() {
            return true;
        }

        public long c(long j) {
            long b2 = Ln.this.b(j);
            this.d = this.a[C0471ar.b(this.a, b2, true, true)];
            return b2;
        }

        public C1363hn d() {
            return this;
        }

        public void d(long j) {
            this.c = j;
        }

        public long c() {
            return Ln.this.n.b();
        }

        public long a(C0313an anVar) throws IOException, InterruptedException {
            long j = this.d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.d = -1;
            return j2;
        }

        public defpackage.C1363hn.a a(long j) {
            int b2 = C0471ar.b(this.a, Ln.this.b(j), true, true);
            long a2 = Ln.this.a(this.a[b2]);
            C1393in inVar = new C1393in(a2, this.c + this.b[b2]);
            if (a2 < j) {
                long[] jArr = this.a;
                if (b2 != jArr.length - 1) {
                    int i = b2 + 1;
                    return new defpackage.C1363hn.a(inVar, new C1393in(Ln.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new defpackage.C1363hn.a(inVar);
        }
    }

    Ln() {
    }

    public static boolean b(Pq pq) {
        return pq.a() >= 5 && pq.t() == 127 && pq.v() == 1179402563;
    }

    private int c(Pq pq) {
        int i;
        int i2;
        int i3 = (pq.a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                pq.f(4);
                pq.A();
                int t = i3 == 6 ? pq.t() : pq.z();
                pq.e(0);
                return t + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public long a(Pq pq) {
        if (!a(pq.a)) {
            return -1;
        }
        return (long) c(pq);
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq, long j, a aVar) throws IOException, InterruptedException {
        byte[] bArr = pq.a;
        if (this.n == null) {
            this.n = new Fq(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, pq.d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a2 = this.n.a();
            Fq fq = this.n;
            aVar.a = Format.a(null, "audio/flac", null, -1, a2, fq.f, fq.e, singletonList, null, 0, null);
        } else if ((bArr[0] & Ascii.DEL) == 3) {
            this.o = new a();
            this.o.a(pq);
        } else if (a(bArr)) {
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.d(j);
                aVar.b = this.o;
            }
            return false;
        }
        return true;
    }
}
