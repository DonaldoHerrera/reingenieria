package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ko reason: default package and case insensitive filesystem */
/* compiled from: H262Reader */
public final class C1456ko implements C1425jo {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private C1424jn c;
    private boolean d;
    private long e;
    private final Go f;
    private final Pq g;
    private final boolean[] h;
    private final a i;
    private final C1670ro j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    /* renamed from: ko$a */
    /* compiled from: H262Reader */
    private static final class a {
        private static final byte[] a = {0, 0, 1};
        private boolean b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a() {
            this.b = false;
            this.c = 0;
            this.d = 0;
        }

        public boolean a(int i, int i2) {
            if (this.b) {
                this.c -= i2;
                if (this.d == 0 && i == 181) {
                    this.d = this.c;
                } else {
                    this.b = false;
                    return true;
                }
            } else if (i == 179) {
                this.b = true;
            }
            byte[] bArr = a;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    public C1456ko() {
        this(null);
    }

    public void a() {
        Mq.a(this.h);
        this.i.a();
        if (this.f != null) {
            this.j.b();
        }
        this.k = 0;
        this.l = false;
    }

    public void b() {
    }

    public C1456ko(Go go) {
        this.f = go;
        this.h = new boolean[4];
        this.i = new a(128);
        if (go != null) {
            this.j = new C1670ro(178, 128);
            this.g = new Pq();
            return;
        }
        this.j = null;
        this.g = null;
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.b = dVar.b();
        this.c = bnVar.a(dVar.c(), 2);
        Go go = this.f;
        if (go != null) {
            go.a(bnVar, dVar);
        }
    }

    public void a(long j2, int i2) {
        this.m = j2;
    }

    public void a(Pq pq) {
        int i2;
        Pq pq2 = pq;
        int c2 = pq.c();
        int d2 = pq.d();
        byte[] bArr = pq2.a;
        this.k += (long) pq.a();
        this.c.a(pq2, pq.a());
        while (true) {
            int a2 = Mq.a(bArr, c2, d2, this.h);
            if (a2 == d2) {
                break;
            }
            int i3 = a2 + 3;
            byte b2 = pq2.a[i3] & 255;
            int i4 = a2 - c2;
            boolean z = false;
            if (!this.d) {
                if (i4 > 0) {
                    this.i.a(bArr, c2, a2);
                }
                if (this.i.a(b2, i4 < 0 ? -i4 : 0)) {
                    Pair a3 = a(this.i, this.b);
                    this.c.a((Format) a3.first);
                    this.e = ((Long) a3.second).longValue();
                    this.d = true;
                }
            }
            if (this.f != null) {
                if (i4 > 0) {
                    this.j.a(bArr, c2, a2);
                    i2 = 0;
                } else {
                    i2 = -i4;
                }
                if (this.j.a(i2)) {
                    C1670ro roVar = this.j;
                    this.g.a(this.j.d, Mq.c(roVar.d, roVar.e));
                    this.f.a(this.o, this.g);
                }
                if (b2 == 178 && pq2.a[a2 + 2] == 1) {
                    this.j.b(b2);
                }
            }
            if (b2 == 0 || b2 == 179) {
                int i5 = d2 - a2;
                if (this.l && this.q && this.d) {
                    this.c.a(this.o, this.p ? 1 : 0, ((int) (this.k - this.n)) - i5, i5, null);
                }
                if (!this.l || this.q) {
                    this.n = this.k - ((long) i5);
                    long j2 = this.m;
                    if (j2 == -9223372036854775807L) {
                        j2 = this.l ? this.o + this.e : 0;
                    }
                    this.o = j2;
                    this.p = false;
                    this.m = -9223372036854775807L;
                    this.l = true;
                }
                if (b2 == 0) {
                    z = true;
                }
                this.q = z;
            } else if (b2 == 184) {
                this.p = true;
            }
            c2 = i3;
        }
        if (!this.d) {
            this.i.a(bArr, c2, d2);
        }
        if (this.f != null) {
            this.j.a(bArr, c2, d2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    private static Pair<Format, Long> a(a aVar, String str) {
        float f2;
        int i2;
        int i3;
        float f3;
        a aVar2 = aVar;
        byte[] copyOf = Arrays.copyOf(aVar2.e, aVar2.c);
        byte b2 = copyOf[5] & 255;
        int i4 = ((copyOf[4] & 255) << 4) | (b2 >> 4);
        byte b3 = ((b2 & Ascii.SI) << 8) | (copyOf[6] & 255);
        int i5 = (copyOf[7] & 240) >> 4;
        if (i5 == 2) {
            f3 = (float) (b3 * 4);
            i3 = i4 * 3;
        } else if (i5 == 3) {
            f3 = (float) (b3 * Ascii.DLE);
            i3 = i4 * 9;
        } else if (i5 != 4) {
            f2 = 1.0f;
            String str2 = str;
            Format a2 = Format.a(str2, "video/mpeg2", (String) null, -1, -1, i4, (int) b3, -1.0f, Collections.singletonList(copyOf), -1, f2, (DrmInitData) null);
            long j2 = 0;
            i2 = (copyOf[7] & Ascii.SI) - 1;
            if (i2 >= 0) {
                double[] dArr = a;
                if (i2 < dArr.length) {
                    double d2 = dArr[i2];
                    int i6 = aVar2.d + 9;
                    int i7 = (copyOf[i6] & 96) >> 5;
                    byte b4 = copyOf[i6] & Ascii.US;
                    if (i7 != b4) {
                        d2 *= (((double) i7) + 1.0d) / ((double) (b4 + 1));
                    }
                    j2 = (long) (1000000.0d / d2);
                }
            }
            return Pair.create(a2, Long.valueOf(j2));
        } else {
            f3 = (float) (b3 * 121);
            i3 = i4 * 100;
        }
        f2 = f3 / ((float) i3);
        String str22 = str;
        Format a22 = Format.a(str22, "video/mpeg2", (String) null, -1, -1, i4, (int) b3, -1.0f, Collections.singletonList(copyOf), -1, f2, (DrmInitData) null);
        long j22 = 0;
        i2 = (copyOf[7] & Ascii.SI) - 1;
        if (i2 >= 0) {
        }
        return Pair.create(a22, Long.valueOf(j22));
    }
}
