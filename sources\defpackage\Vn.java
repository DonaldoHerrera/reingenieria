package defpackage;

import com.google.android.exoplayer2.H;
import java.util.Arrays;

/* renamed from: Vn reason: default package */
/* compiled from: VorbisUtil */
final class Vn {

    /* renamed from: Vn$a */
    /* compiled from: VorbisUtil */
    public static final class a {
        public final int a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* renamed from: Vn$b */
    /* compiled from: VorbisUtil */
    public static final class b {
        public final String a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* renamed from: Vn$c */
    /* compiled from: VorbisUtil */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* renamed from: Vn$d */
    /* compiled from: VorbisUtil */
    public static final class d {
        public final long a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(long j2, int i2, long j3, int i3, int i4, int i5, int i6, int i7, boolean z, byte[] bArr) {
            this.a = j2;
            this.b = i2;
            this.c = j3;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static b a(Pq pq) throws H {
        a(3, pq, false);
        String b2 = pq.b((int) pq.m());
        int length = 11 + b2.length();
        long m = pq.m();
        String[] strArr = new String[((int) m)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < m; i2++) {
            int i3 = i + 4;
            strArr[i2] = pq.b((int) pq.m());
            i = i3 + strArr[i2].length();
        }
        if ((pq.t() & 1) != 0) {
            return new b(b2, strArr, i + 1);
        }
        throw new H("framing bit expected to be set");
    }

    public static d b(Pq pq) throws H {
        Pq pq2 = pq;
        a(1, pq2, false);
        long m = pq.m();
        int t = pq.t();
        long m2 = pq.m();
        int k = pq.k();
        int k2 = pq.k();
        int k3 = pq.k();
        int t2 = pq.t();
        d dVar = new d(m, t, m2, k, k2, k3, (int) Math.pow(2.0d, (double) (t2 & 15)), (int) Math.pow(2.0d, (double) ((t2 & 240) >> 4)), (pq.t() & 1) > 0, Arrays.copyOf(pq2.a, pq.d()));
        return dVar;
    }

    private static c[] c(Tn tn) {
        int a2 = tn.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i = 0; i < a2; i++) {
            cVarArr[i] = new c(tn.b(), tn.a(16), tn.a(16), tn.a(8));
        }
        return cVarArr;
    }

    private static void d(Tn tn) throws H {
        int a2 = tn.a(6) + 1;
        int i = 0;
        while (i < a2) {
            if (tn.a(16) <= 2) {
                tn.b(24);
                tn.b(24);
                tn.b(24);
                int a3 = tn.a(6) + 1;
                tn.b(8);
                int[] iArr = new int[a3];
                for (int i2 = 0; i2 < a3; i2++) {
                    iArr[i2] = ((tn.b() ? tn.a(5) : 0) * 8) + tn.a(3);
                }
                for (int i3 = 0; i3 < a3; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            tn.b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new H("residueType greater than 2 is not decodable");
            }
        }
    }

    public static boolean a(int i, Pq pq, boolean z) throws H {
        if (pq.a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("too short header: ");
            sb.append(pq.a());
            throw new H(sb.toString());
        } else if (pq.t() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw new H(sb2.toString());
        } else if (pq.t() == 118 && pq.t() == 111 && pq.t() == 114 && pq.t() == 98 && pq.t() == 105 && pq.t() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new H("expected characters 'vorbis'");
        }
    }

    private static void b(Tn tn) throws H {
        int a2 = tn.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            int a3 = tn.a(16);
            if (a3 == 0) {
                tn.b(8);
                tn.b(16);
                tn.b(16);
                tn.b(6);
                tn.b(8);
                int a4 = tn.a(4) + 1;
                for (int i2 = 0; i2 < a4; i2++) {
                    tn.b(8);
                }
            } else if (a3 == 1) {
                int a5 = tn.a(5);
                int[] iArr = new int[a5];
                int i3 = -1;
                for (int i4 = 0; i4 < a5; i4++) {
                    iArr[i4] = tn.a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int[] iArr2 = new int[(i3 + 1)];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    iArr2[i5] = tn.a(3) + 1;
                    int a6 = tn.a(2);
                    if (a6 > 0) {
                        tn.b(8);
                    }
                    for (int i6 = 0; i6 < (1 << a6); i6++) {
                        tn.b(8);
                    }
                }
                tn.b(2);
                int a7 = tn.a(4);
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < a5; i9++) {
                    i7 += iArr2[iArr[i9]];
                    while (i8 < i7) {
                        tn.b(a7);
                        i8++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("floor type greater than 1 not decodable: ");
                sb.append(a3);
                throw new H(sb.toString());
            }
        }
    }

    public static c[] a(Pq pq, int i) throws H {
        int i2 = 0;
        a(5, pq, false);
        int t = pq.t() + 1;
        Tn tn = new Tn(pq.a);
        tn.b(pq.c() * 8);
        for (int i3 = 0; i3 < t; i3++) {
            a(tn);
        }
        int a2 = tn.a(6) + 1;
        while (i2 < a2) {
            if (tn.a(16) == 0) {
                i2++;
            } else {
                throw new H("placeholder of time domain transforms not zeroed out");
            }
        }
        b(tn);
        d(tn);
        a(i, tn);
        c[] c2 = c(tn);
        if (tn.b()) {
            return c2;
        }
        throw new H("framing bit after modes not set as expected");
    }

    private static void a(int i, Tn tn) throws H {
        int a2 = tn.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = tn.a(16);
            if (a3 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(a3);
                Iq.b("VorbisUtil", sb.toString());
            } else {
                int a4 = tn.b() ? tn.a(4) + 1 : 1;
                if (tn.b()) {
                    int a5 = tn.a(8) + 1;
                    for (int i3 = 0; i3 < a5; i3++) {
                        int i4 = i - 1;
                        tn.b(a(i4));
                        tn.b(a(i4));
                    }
                }
                if (tn.a(2) == 0) {
                    if (a4 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            tn.b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a4; i6++) {
                        tn.b(8);
                        tn.b(8);
                        tn.b(8);
                    }
                } else {
                    throw new H("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    private static a a(Tn tn) throws H {
        if (tn.a(24) == 5653314) {
            int a2 = tn.a(16);
            int a3 = tn.a(24);
            long[] jArr = new long[a3];
            boolean b2 = tn.b();
            long j = 0;
            if (!b2) {
                boolean b3 = tn.b();
                for (int i = 0; i < jArr.length; i++) {
                    if (!b3) {
                        jArr[i] = (long) (tn.a(5) + 1);
                    } else if (tn.b()) {
                        jArr[i] = (long) (tn.a(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int a4 = tn.a(5) + 1;
                int i2 = 0;
                while (i2 < jArr.length) {
                    int a5 = tn.a(a(a3 - i2));
                    int i3 = i2;
                    for (int i4 = 0; i4 < a5 && i3 < jArr.length; i4++) {
                        jArr[i3] = (long) a4;
                        i3++;
                    }
                    a4++;
                    i2 = i3;
                }
            }
            int a6 = tn.a(4);
            if (a6 <= 2) {
                if (a6 == 1 || a6 == 2) {
                    tn.b(32);
                    tn.b(32);
                    int a7 = tn.a(4) + 1;
                    tn.b(1);
                    if (a6 != 1) {
                        j = ((long) a3) * ((long) a2);
                    } else if (a2 != 0) {
                        j = a((long) a3, (long) a2);
                    }
                    tn.b((int) (j * ((long) a7)));
                }
                a aVar = new a(a2, a3, jArr, a6, b2);
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(a6);
            throw new H(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(tn.a());
        throw new H(sb2.toString());
    }

    private static long a(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }
}
