package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.h;
import com.google.android.exoplayer2.video.j;
import com.google.android.exoplayer2.video.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: AtomParsers */
final class d {
    private static final int a = C0471ar.b("vide");
    private static final int b = C0471ar.b("soun");
    private static final int c = C0471ar.b("text");
    private static final int d = C0471ar.b("sbtl");
    private static final int e = C0471ar.b("subt");
    private static final int f = C0471ar.b("clcp");
    private static final int g = C0471ar.b("meta");
    private static final int h = C0471ar.b("mdta");
    private static final byte[] i = C0471ar.c("OpusHead");

    /* compiled from: AtomParsers */
    private static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final Pq f;
        private final Pq g;
        private int h;
        private int i;

        public a(Pq pq, Pq pq2, boolean z) {
            this.g = pq;
            this.f = pq2;
            this.e = z;
            pq2.e(12);
            this.a = pq2.x();
            pq.e(12);
            this.i = pq.x();
            boolean z2 = true;
            if (pq.h() != 1) {
                z2 = false;
            }
            C1852xq.b(z2, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long j;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            if (this.e) {
                j = this.f.y();
            } else {
                j = this.f.v();
            }
            this.d = j;
            if (this.b == this.h) {
                this.c = this.g.x();
                this.g.f(4);
                int i3 = this.i - 1;
                this.i = i3;
                this.h = i3 > 0 ? this.g.x() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers */
    private interface b {
        boolean a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers */
    private static final class c {
        public final o[] a;
        public Format b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new o[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.d$d reason: collision with other inner class name */
    /* compiled from: AtomParsers */
    static final class C0032d implements b {
        private final int a = this.c.x();
        private final int b = this.c.x();
        private final Pq c;

        public C0032d(b bVar) {
            this.c = bVar.gb;
            this.c.e(12);
        }

        public boolean a() {
            return this.a != 0;
        }

        public int b() {
            int i = this.a;
            return i == 0 ? this.c.x() : i;
        }

        public int c() {
            return this.b;
        }
    }

    /* compiled from: AtomParsers */
    static final class e implements b {
        private final Pq a;
        private final int b = this.a.x();
        private final int c = (this.a.x() & 255);
        private int d;
        private int e;

        public e(b bVar) {
            this.a = bVar.gb;
            this.a.e(12);
        }

        public boolean a() {
            return false;
        }

        public int b() {
            int i = this.c;
            if (i == 8) {
                return this.a.t();
            }
            if (i == 16) {
                return this.a.z();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            this.e = this.a.t();
            return (this.e & 240) >> 4;
        }

        public int c() {
            return this.b;
        }
    }

    /* compiled from: AtomParsers */
    private static final class f {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static n a(a aVar, b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) throws H {
        long j2;
        b bVar2;
        long[] jArr;
        long[] jArr2;
        n nVar;
        a aVar2 = aVar;
        a d2 = aVar2.d(c.T);
        int a2 = a(b(d2.e(c.fa).gb));
        if (a2 == -1) {
            return null;
        }
        f e2 = e(aVar2.e(c.ba).gb);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            j2 = e2.b;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long d3 = d(bVar2.gb);
        if (j2 != -9223372036854775807L) {
            j3 = C0471ar.c(j2, 1000000, d3);
        }
        long j4 = j3;
        a d4 = d2.d(c.U).d(c.V);
        Pair c2 = c(d2.e(c.ea).gb);
        c a3 = a(d4.e(c.ga).gb, e2.a, e2.c, (String) c2.second, drmInitData, z2);
        if (!z) {
            Pair b2 = b(aVar2.d(c.ca));
            jArr = (long[]) b2.second;
            jArr2 = (long[]) b2.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (a3.b == null) {
            nVar = null;
        } else {
            int b3 = e2.a;
            long longValue = ((Long) c2.first).longValue();
            Format format = a3.b;
            int i2 = a3.d;
            o[] oVarArr = a3.a;
            int i3 = a3.c;
            nVar = new n(b3, a2, longValue, d3, j4, format, i2, oVarArr, i3, jArr2, jArr);
        }
        return nVar;
    }

    private static Metadata b(Pq pq, int i2) {
        pq.f(8);
        ArrayList arrayList = new ArrayList();
        while (pq.c() < i2) {
            Entry a2 = j.a(pq);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }

    private static Pair<Long, String> c(Pq pq) {
        int i2 = 8;
        pq.e(8);
        int c2 = c.c(pq.h());
        pq.f(c2 == 0 ? 8 : 16);
        long v = pq.v();
        if (c2 == 0) {
            i2 = 4;
        }
        pq.f(i2);
        int z = pq.z();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) (((z >> 10) & 31) + 96));
        sb.append((char) (((z >> 5) & 31) + 96));
        sb.append((char) ((z & 31) + 96));
        return Pair.create(Long.valueOf(v), sb.toString());
    }

    private static Metadata d(Pq pq, int i2) {
        pq.f(12);
        while (pq.c() < i2) {
            int c2 = pq.c();
            int h2 = pq.h();
            if (pq.h() == c.Qa) {
                pq.e(c2);
                return b(pq, c2 + h2);
            }
            pq.e(c2 + h2);
        }
        return null;
    }

    private static f e(Pq pq) {
        boolean z;
        int i2 = 8;
        pq.e(8);
        int c2 = c.c(pq.h());
        pq.f(c2 == 0 ? 8 : 16);
        int h2 = pq.h();
        pq.f(4);
        int c3 = pq.c();
        if (c2 == 0) {
            i2 = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            } else if (pq.a[c3 + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            pq.f(i2);
        } else {
            long v = c2 == 0 ? pq.v() : pq.y();
            if (v != 0) {
                j = v;
            }
        }
        pq.f(16);
        int h3 = pq.h();
        int h4 = pq.h();
        pq.f(4);
        int h5 = pq.h();
        int h6 = pq.h();
        if (h3 == 0 && h4 == 65536 && h5 == -65536 && h6 == 0) {
            i3 = 90;
        } else if (h3 == 0 && h4 == -65536 && h5 == 65536 && h6 == 0) {
            i3 = 270;
        } else if (h3 == -65536 && h4 == 0 && h5 == 0 && h6 == -65536) {
            i3 = 180;
        }
        return new f(h2, j, i3);
    }

    private static int b(Pq pq) {
        pq.e(16);
        return pq.h();
    }

    private static Pair<long[], long[]> b(a aVar) {
        if (aVar != null) {
            b e2 = aVar.e(c.da);
            if (e2 != null) {
                Pq pq = e2.gb;
                pq.e(8);
                int c2 = c.c(pq.h());
                int x = pq.x();
                long[] jArr = new long[x];
                long[] jArr2 = new long[x];
                int i2 = 0;
                while (i2 < x) {
                    jArr[i2] = c2 == 1 ? pq.y() : pq.v();
                    jArr2[i2] = c2 == 1 ? pq.p() : (long) pq.h();
                    if (pq.r() == 1) {
                        pq.f(2);
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    private static float c(Pq pq, int i2) {
        pq.e(i2 + 8);
        return ((float) pq.x()) / ((float) pq.x());
    }

    private static long d(Pq pq) {
        int i2 = 8;
        pq.e(8);
        if (c.c(pq.h()) != 0) {
            i2 = 16;
        }
        pq.f(i2);
        return pq.v();
    }

    private static byte[] c(Pq pq, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            pq.e(i4);
            int h2 = pq.h();
            if (pq.h() == c.Xa) {
                return Arrays.copyOfRange(pq.a, i4, h2 + i4);
            }
            i4 += h2;
        }
        return null;
    }

    private static Pair<Integer, o> d(Pq pq, int i2, int i3) {
        int c2 = pq.c();
        while (c2 - i2 < i3) {
            pq.e(c2);
            int h2 = pq.h();
            C1852xq.a(h2 > 0, "childAtomSize should be positive");
            if (pq.h() == c.ia) {
                Pair<Integer, o> a2 = a(pq, c2, h2);
                if (a2 != null) {
                    return a2;
                }
            }
            c2 += h2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    public static q a(n nVar, a aVar, C1240dn dnVar) throws H {
        b bVar;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        long j;
        int[] iArr;
        long[] jArr;
        int i5;
        int[] iArr2;
        long[] jArr2;
        int i6;
        int[] iArr3;
        long[] jArr3;
        int[] iArr4;
        int[] iArr5;
        int i7;
        boolean z3;
        String str;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        n nVar2 = nVar;
        a aVar2 = aVar;
        C1240dn dnVar2 = dnVar;
        b e2 = aVar2.e(c.Da);
        if (e2 != null) {
            bVar = new C0032d(e2);
        } else {
            b e3 = aVar2.e(c.Ea);
            if (e3 != null) {
                bVar = new e(e3);
            } else {
                throw new H("Track has no sample table size information");
            }
        }
        int c2 = bVar.c();
        if (c2 == 0) {
            q qVar = new q(nVar, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
            return qVar;
        }
        b e4 = aVar2.e(c.Fa);
        if (e4 == null) {
            e4 = aVar2.e(c.Ga);
            z = true;
        } else {
            z = false;
        }
        Pq pq = e4.gb;
        Pq pq2 = aVar2.e(c.Ca).gb;
        Pq pq3 = aVar2.e(c.za).gb;
        b e5 = aVar2.e(c.Aa);
        Pq pq4 = e5 != null ? e5.gb : null;
        b e6 = aVar2.e(c.Ba);
        Pq pq5 = e6 != null ? e6.gb : null;
        a aVar3 = new a(pq2, pq, z);
        pq3.e(12);
        int x = pq3.x() - 1;
        int x2 = pq3.x();
        int x3 = pq3.x();
        if (pq5 != null) {
            pq5.e(12);
            i2 = pq5.x();
        } else {
            i2 = 0;
        }
        int i15 = -1;
        if (pq4 != null) {
            pq4.e(12);
            i3 = pq4.x();
            if (i3 > 0) {
                i15 = pq4.x() - 1;
            } else {
                pq4 = null;
            }
        } else {
            i3 = 0;
        }
        if (bVar.a()) {
            if ("audio/raw".equals(nVar2.f.i) && x == 0 && i2 == 0 && i3 == 0) {
                z2 = true;
                if (z2) {
                    long[] jArr4 = new long[c2];
                    int[] iArr6 = new int[c2];
                    long[] jArr5 = new long[c2];
                    int i16 = i3;
                    iArr = new int[c2];
                    int i17 = x;
                    Pq pq6 = pq3;
                    int i18 = x3;
                    long j2 = 0;
                    long j3 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = i16;
                    int i24 = i2;
                    int i25 = x2;
                    int i26 = i15;
                    int i27 = 0;
                    while (true) {
                        str = "AtomParsers";
                        if (i20 >= c2) {
                            i4 = c2;
                            i8 = i23;
                            i9 = i25;
                            break;
                        }
                        long j4 = j3;
                        boolean z5 = true;
                        while (i27 == 0) {
                            z5 = aVar3.a();
                            if (!z5) {
                                break;
                            }
                            int i28 = i23;
                            int i29 = i25;
                            long j5 = aVar3.d;
                            int i30 = c2;
                            i27 = aVar3.c;
                            j4 = j5;
                            i23 = i28;
                            i25 = i29;
                            c2 = i30;
                        }
                        int i31 = c2;
                        i8 = i23;
                        i9 = i25;
                        if (!z5) {
                            Iq.d(str, "Unexpected end of chunk data");
                            jArr4 = Arrays.copyOf(jArr4, i20);
                            iArr6 = Arrays.copyOf(iArr6, i20);
                            jArr5 = Arrays.copyOf(jArr5, i20);
                            iArr = Arrays.copyOf(iArr, i20);
                            i4 = i20;
                            break;
                        }
                        if (pq5 != null) {
                            int i32 = i24;
                            while (i21 == 0 && i32 > 0) {
                                i21 = pq5.x();
                                i22 = pq5.h();
                                i32--;
                            }
                            i21--;
                            i12 = i32;
                        } else {
                            i12 = i24;
                        }
                        int i33 = i22;
                        jArr4[i20] = j4;
                        iArr6[i20] = bVar.b();
                        if (iArr6[i20] > i19) {
                            i19 = iArr6[i20];
                        }
                        jArr5[i20] = j2 + ((long) i33);
                        iArr[i20] = pq4 == null ? 1 : 0;
                        if (i20 == i26) {
                            iArr[i20] = 1;
                            int i34 = i8 - 1;
                            if (i34 > 0) {
                                i26 = pq4.x() - 1;
                            }
                            i13 = i19;
                            i23 = i34;
                            i14 = i33;
                        } else {
                            i13 = i19;
                            i14 = i33;
                            i23 = i8;
                        }
                        j2 += (long) i18;
                        int i35 = i9 - 1;
                        if (i35 == 0 && i17 > 0) {
                            i35 = pq6.x();
                            i17--;
                            i18 = pq6.h();
                        }
                        i27--;
                        i20++;
                        i22 = i14;
                        i25 = i35;
                        j3 = j4 + ((long) iArr6[i20]);
                        i19 = i13;
                        i24 = i12;
                        c2 = i31;
                    }
                    int i36 = i27;
                    j = j2 + ((long) i22);
                    int i37 = i24;
                    while (true) {
                        if (i37 <= 0) {
                            z4 = true;
                            break;
                        } else if (pq5.x() != 0) {
                            z4 = false;
                            break;
                        } else {
                            pq5.h();
                            i37--;
                        }
                    }
                    if (i8 == 0 && i9 == 0 && i36 == 0 && i17 == 0) {
                        i11 = i21;
                        if (i11 == 0 && z4) {
                            i10 = i19;
                            nVar2 = nVar;
                            jArr2 = jArr4;
                            jArr = jArr5;
                            i5 = i10;
                            iArr2 = iArr6;
                        }
                    } else {
                        i11 = i21;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    i10 = i19;
                    nVar2 = nVar;
                    sb.append(nVar2.a);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i8);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i9);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i36);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i17);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i11);
                    sb.append(!z4 ? ", ctts invalid" : "");
                    Iq.d(str, sb.toString());
                    jArr2 = jArr4;
                    jArr = jArr5;
                    i5 = i10;
                    iArr2 = iArr6;
                } else {
                    i4 = c2;
                    int i38 = aVar3.a;
                    long[] jArr6 = new long[i38];
                    int[] iArr7 = new int[i38];
                    while (aVar3.a()) {
                        int i39 = aVar3.b;
                        jArr6[i39] = aVar3.d;
                        iArr7[i39] = aVar3.c;
                    }
                    Format format = nVar2.f;
                    com.google.android.exoplayer2.extractor.mp4.g.a a2 = g.a(C0471ar.b(format.x, format.v), jArr6, iArr7, (long) x3);
                    jArr2 = a2.a;
                    iArr2 = a2.b;
                    i5 = a2.c;
                    jArr = a2.d;
                    iArr = a2.e;
                    j = a2.f;
                }
                int i40 = i4;
                long c3 = C0471ar.c(j, 1000000, nVar2.c);
                if (nVar2.h != null || dnVar.a()) {
                    long[] jArr7 = jArr2;
                    int[] iArr8 = iArr2;
                    int i41 = i5;
                    int[] iArr9 = iArr;
                    C0471ar.a(jArr, 1000000, nVar2.c);
                    q qVar2 = new q(nVar, jArr7, iArr8, i41, jArr, iArr9, c3);
                    return qVar2;
                }
                long[] jArr8 = nVar2.h;
                if (jArr8.length == 1 && nVar2.b == 1 && jArr.length >= 2) {
                    long j6 = nVar2.i[0];
                    long c4 = j6 + C0471ar.c(jArr8[0], nVar2.c, nVar2.d);
                    iArr3 = iArr2;
                    i6 = i5;
                    if (a(jArr, j, j6, c4)) {
                        long j7 = j - c4;
                        long c5 = C0471ar.c(j6 - jArr[0], (long) nVar2.f.w, nVar2.c);
                        long c6 = C0471ar.c(j7, (long) nVar2.f.w, nVar2.c);
                        if (!(c5 == 0 && c6 == 0) && c5 <= 2147483647L && c6 <= 2147483647L) {
                            int i42 = (int) c5;
                            C1240dn dnVar3 = dnVar;
                            dnVar3.b = i42;
                            dnVar3.c = (int) c6;
                            C0471ar.a(jArr, 1000000, nVar2.c);
                            q qVar3 = new q(nVar, jArr2, iArr3, i6, jArr, iArr, C0471ar.c(nVar2.h[0], 1000000, nVar2.d));
                            return qVar3;
                        }
                    }
                } else {
                    iArr3 = iArr2;
                    i6 = i5;
                }
                long[] jArr9 = nVar2.h;
                if (jArr9.length == 1 && jArr9[0] == 0) {
                    long j8 = nVar2.i[0];
                    for (int i43 = 0; i43 < jArr.length; i43++) {
                        jArr[i43] = C0471ar.c(jArr[i43] - j8, 1000000, nVar2.c);
                    }
                    q qVar4 = new q(nVar, jArr2, iArr3, i6, jArr, iArr, C0471ar.c(j - j8, 1000000, nVar2.c));
                    return qVar4;
                }
                boolean z6 = nVar2.b == 1;
                long[] jArr10 = nVar2.h;
                int[] iArr10 = new int[jArr10.length];
                int[] iArr11 = new int[jArr10.length];
                int i44 = 0;
                boolean z7 = false;
                int i45 = 0;
                int i46 = 0;
                while (true) {
                    long[] jArr11 = nVar2.h;
                    if (i44 >= jArr11.length) {
                        break;
                    }
                    long j9 = nVar2.i[i44];
                    if (j9 != -1) {
                        boolean z8 = z7;
                        int i47 = i45;
                        long c7 = C0471ar.c(jArr11[i44], nVar2.c, nVar2.d);
                        iArr10[i44] = C0471ar.a(jArr, j9, true, true);
                        iArr11[i44] = C0471ar.a(jArr, j9 + c7, z6, false);
                        while (iArr10[i44] < iArr11[i44] && (iArr[iArr10[i44]] & 1) == 0) {
                            iArr10[i44] = iArr10[i44] + 1;
                        }
                        i45 = i47 + (iArr11[i44] - iArr10[i44]);
                        z3 = z8 | (i46 != iArr10[i44]);
                        i7 = iArr11[i44];
                    } else {
                        int i48 = i45;
                        i7 = i46;
                        z3 = z7;
                    }
                    i44++;
                    z7 = z3;
                    i46 = i7;
                }
                boolean z9 = z7;
                int i49 = 0;
                boolean z10 = true;
                if (i45 == i40) {
                    z10 = false;
                }
                boolean z11 = z9 | z10;
                long[] jArr12 = z11 ? new long[i45] : jArr2;
                int[] iArr12 = z11 ? new int[i45] : iArr3;
                int i50 = z11 ? 0 : i6;
                int[] iArr13 = z11 ? new int[i45] : iArr;
                long[] jArr13 = new long[i45];
                int i51 = i50;
                long j10 = 0;
                int i52 = 0;
                while (i49 < nVar2.h.length) {
                    long j11 = nVar2.i[i49];
                    int i53 = iArr10[i49];
                    int[] iArr14 = iArr10;
                    int i54 = iArr11[i49];
                    if (z11) {
                        iArr4 = iArr11;
                        int i55 = i54 - i53;
                        System.arraycopy(jArr2, i53, jArr12, i52, i55);
                        jArr3 = jArr2;
                        iArr5 = iArr3;
                        System.arraycopy(iArr5, i53, iArr12, i52, i55);
                        System.arraycopy(iArr, i53, iArr13, i52, i55);
                    } else {
                        jArr3 = jArr2;
                        iArr4 = iArr11;
                        iArr5 = iArr3;
                    }
                    int i56 = i51;
                    while (i53 < i54) {
                        int[] iArr15 = iArr;
                        int i57 = i54;
                        int[] iArr16 = iArr13;
                        long j12 = j10;
                        jArr13[i52] = C0471ar.c(j10, 1000000, nVar2.d) + C0471ar.c(jArr[i53] - j11, 1000000, nVar2.c);
                        if (z11 && iArr12[i52] > i56) {
                            i56 = iArr5[i53];
                        }
                        i52++;
                        i53++;
                        i54 = i57;
                        iArr = iArr15;
                        j10 = j12;
                        iArr13 = iArr16;
                    }
                    j10 += nVar2.h[i49];
                    i49++;
                    i51 = i56;
                    iArr = iArr;
                    iArr10 = iArr14;
                    iArr11 = iArr4;
                    iArr13 = iArr13;
                    iArr3 = iArr5;
                    jArr2 = jArr3;
                }
                q qVar5 = new q(nVar, jArr12, iArr12, i51, jArr13, iArr13, C0471ar.c(j10, 1000000, nVar2.d));
                return qVar5;
            }
        }
        z2 = false;
        if (z2) {
        }
        int i402 = i4;
        long c32 = C0471ar.c(j, 1000000, nVar2.c);
        if (nVar2.h != null) {
        }
        long[] jArr72 = jArr2;
        int[] iArr82 = iArr2;
        int i412 = i5;
        int[] iArr92 = iArr;
        C0471ar.a(jArr, 1000000, nVar2.c);
        q qVar22 = new q(nVar, jArr72, iArr82, i412, jArr, iArr92, c32);
        return qVar22;
    }

    private static int b(Pq pq, int i2, int i3) {
        int c2 = pq.c();
        while (c2 - i2 < i3) {
            pq.e(c2);
            int h2 = pq.h();
            C1852xq.a(h2 > 0, "childAtomSize should be positive");
            if (pq.h() == c.W) {
                return c2;
            }
            c2 += h2;
        }
        return -1;
    }

    public static Metadata a(b bVar, boolean z) {
        if (z) {
            return null;
        }
        Pq pq = bVar.gb;
        pq.e(8);
        while (pq.a() >= 8) {
            int c2 = pq.c();
            int h2 = pq.h();
            if (pq.h() == c.Oa) {
                pq.e(c2);
                return d(pq, c2 + h2);
            }
            pq.e(c2 + h2);
        }
        return null;
    }

    public static Metadata a(a aVar) {
        b e2 = aVar.e(c.fa);
        b e3 = aVar.e(c.Pa);
        b e4 = aVar.e(c.Qa);
        if (e2 == null || e3 == null || e4 == null || b(e2.gb) != h) {
            return null;
        }
        Pq pq = e3.gb;
        pq.e(12);
        int h2 = pq.h();
        String[] strArr = new String[h2];
        for (int i2 = 0; i2 < h2; i2++) {
            int h3 = pq.h();
            pq.f(4);
            strArr[i2] = pq.b(h3 - 8);
        }
        Pq pq2 = e4.gb;
        pq2.e(8);
        ArrayList arrayList = new ArrayList();
        while (pq2.a() > 8) {
            int c2 = pq2.c();
            int h4 = pq2.h();
            int h5 = pq2.h() - 1;
            if (h5 < 0 || h5 >= strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(h5);
                Iq.d("AtomParsers", sb.toString());
            } else {
                MdtaMetadataEntry a2 = j.a(pq2, c2 + h4, strArr[h5]);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            pq2.e(c2 + h4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }

    private static int a(int i2) {
        if (i2 == b) {
            return 1;
        }
        if (i2 == a) {
            return 2;
        }
        if (i2 == c || i2 == d || i2 == e || i2 == f) {
            return 3;
        }
        return i2 == g ? 4 : -1;
    }

    private static c a(Pq pq, int i2, int i3, String str, DrmInitData drmInitData, boolean z) throws H {
        Pq pq2 = pq;
        pq2.e(12);
        int h2 = pq.h();
        c cVar = new c(h2);
        for (int i4 = 0; i4 < h2; i4++) {
            int c2 = pq.c();
            int h3 = pq.h();
            C1852xq.a(h3 > 0, "childAtomSize should be positive");
            int h4 = pq.h();
            if (h4 == c.b || h4 == c.c || h4 == c.ma || h4 == c.ya || h4 == c.e || h4 == c.f || h4 == c.s || h4 == c.h || h4 == c.i || h4 == c.k || h4 == c.m || h4 == c.n || h4 == c.o || h4 == c.p) {
                a(pq, h4, c2, h3, i2, i3, drmInitData, cVar, i4);
            } else if (h4 == c.v || h4 == c.na || h4 == c.A || h4 == c.C || h4 == c.E || h4 == c.G || h4 == c.J || h4 == c.H || h4 == c.I || h4 == c.La || h4 == c.Ma || h4 == c.y || h4 == c.z || h4 == c.w || h4 == c.Za || h4 == c._a || h4 == c.ab || h4 == c.bb || h4 == c.db) {
                a(pq, h4, c2, h3, i2, str, z, drmInitData, cVar, i4);
            } else if (h4 == c.wa || h4 == c.Ha || h4 == c.Ia || h4 == c.Ja || h4 == c.Ka) {
                a(pq, h4, c2, h3, i2, str, cVar);
            } else if (h4 == c.Ya) {
                cVar.b = Format.a(Integer.toString(i2), "application/x-camera-motion", (String) null, -1, (DrmInitData) null);
            }
            pq2.e(c2 + h3);
        }
        return cVar;
    }

    private static void a(Pq pq, int i2, int i3, int i4, int i5, String str, c cVar) throws H {
        Pq pq2 = pq;
        int i6 = i2;
        c cVar2 = cVar;
        pq2.e(i3 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i6 != c.wa) {
            if (i6 == c.Ha) {
                int i7 = (i4 - 8) - 8;
                byte[] bArr = new byte[i7];
                pq2.a(bArr, 0, i7);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i6 == c.Ia) {
                str2 = "application/x-mp4-vtt";
            } else if (i6 == c.Ja) {
                j = 0;
            } else if (i6 == c.Ka) {
                cVar2.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.b = Format.a(Integer.toString(i5), str2, null, -1, 0, str, -1, null, j, list);
    }

    private static void a(Pq pq, int i2, int i3, int i4, int i5, int i6, DrmInitData drmInitData, c cVar, int i7) throws H {
        Pq pq2 = pq;
        int i8 = i3;
        int i9 = i4;
        DrmInitData drmInitData2 = drmInitData;
        c cVar2 = cVar;
        pq2.e(i8 + 8 + 8);
        pq2.f(16);
        int z = pq.z();
        int z2 = pq.z();
        pq2.f(50);
        int c2 = pq.c();
        String str = null;
        int i10 = i2;
        if (i10 == c.ma) {
            Pair d2 = d(pq2, i8, i9);
            if (d2 != null) {
                i10 = ((Integer) d2.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.a(((o) d2.second).b);
                }
                cVar2.a[i7] = (o) d2.second;
            }
            pq2.e(c2);
        }
        DrmInitData drmInitData3 = drmInitData2;
        String str2 = null;
        List list = null;
        byte[] bArr = null;
        boolean z3 = false;
        float f2 = 1.0f;
        int i11 = -1;
        while (c2 - i8 < i9) {
            pq2.e(c2);
            int c3 = pq.c();
            int h2 = pq.h();
            if (h2 == 0 && pq.c() - i8 == i9) {
                break;
            }
            C1852xq.a(h2 > 0, "childAtomSize should be positive");
            int h3 = pq.h();
            if (h3 == c.d) {
                C1852xq.b(str == null);
                pq2.e(c3 + 8);
                h a2 = h.a(pq);
                list = a2.a;
                cVar2.c = a2.b;
                if (!z3) {
                    f2 = a2.e;
                }
                str = "video/avc";
            } else if (h3 == c.g) {
                C1852xq.b(str == null);
                pq2.e(c3 + 8);
                l a3 = l.a(pq);
                list = a3.a;
                cVar2.c = a3.b;
                str = "video/hevc";
            } else if (h3 == c.q || h3 == c.r) {
                j a4 = j.a(pq);
                if (a4 != null && a4.a == 5) {
                    str2 = a4.c;
                    str = "video/dolby-vision";
                }
            } else if (h3 == c.j) {
                C1852xq.b(str == null);
                str = i10 == c.h ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (h3 == c.l) {
                C1852xq.b(str == null);
                str = "video/av01";
            } else if (h3 == c.t) {
                C1852xq.b(str == null);
                str = "video/3gpp";
            } else if (h3 == c.W) {
                C1852xq.b(str == null);
                Pair a5 = a(pq2, c3);
                str = (String) a5.first;
                list = Collections.singletonList(a5.second);
            } else if (h3 == c.va) {
                f2 = c(pq2, c3);
                z3 = true;
            } else if (h3 == c.Wa) {
                bArr = c(pq2, c3, h2);
            } else if (h3 == c.Va) {
                int t = pq.t();
                pq2.f(3);
                if (t == 0) {
                    int t2 = pq.t();
                    if (t2 == 0) {
                        i11 = 0;
                    } else if (t2 == 1) {
                        i11 = 1;
                    } else if (t2 == 2) {
                        i11 = 2;
                    } else if (t2 == 3) {
                        i11 = 3;
                    }
                }
            }
            c2 += h2;
            i8 = i3;
        }
        if (str != null) {
            cVar2.b = Format.a(Integer.toString(i5), str, str2, -1, -1, z, z2, -1.0f, list, i6, f2, bArr, i11, (ColorInfo) null, drmInitData3);
        }
    }

    private static void a(Pq pq, int i2, int i3, int i4, int i5, String str, boolean z, DrmInitData drmInitData, c cVar, int i6) throws H {
        int i7;
        int i8;
        int i9;
        List list;
        String str2;
        DrmInitData drmInitData2;
        int i10;
        int i11;
        String str3;
        int i12;
        Pq pq2 = pq;
        int i13 = i3;
        int i14 = i4;
        String str4 = str;
        DrmInitData drmInitData3 = drmInitData;
        c cVar2 = cVar;
        pq2.e(i13 + 8 + 8);
        if (z) {
            i7 = pq.z();
            pq2.f(6);
        } else {
            pq2.f(8);
            i7 = 0;
        }
        if (i7 == 0 || i7 == 1) {
            i8 = pq.z();
            pq2.f(6);
            i9 = pq.u();
            if (i7 == 1) {
                pq2.f(16);
            }
        } else if (i7 == 2) {
            pq2.f(16);
            int round = (int) Math.round(pq.g());
            int x = pq.x();
            pq2.f(20);
            i8 = x;
            i9 = round;
        } else {
            return;
        }
        int c2 = pq.c();
        int i15 = i2;
        if (i15 == c.na) {
            Pair d2 = d(pq2, i13, i14);
            if (d2 != null) {
                i15 = ((Integer) d2.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.a(((o) d2.second).b);
                }
                cVar2.a[i6] = (o) d2.second;
            }
            pq2.e(c2);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str5 = "audio/raw";
        String str6 = i15 == c.A ? "audio/ac3" : i15 == c.C ? "audio/eac3" : i15 == c.E ? "audio/ac4" : i15 == c.G ? "audio/vnd.dts" : (i15 == c.H || i15 == c.I) ? "audio/vnd.dts.hd" : i15 == c.J ? "audio/vnd.dts.hd;profile=lbr" : i15 == c.La ? "audio/3gpp" : i15 == c.Ma ? "audio/amr-wb" : (i15 == c.y || i15 == c.z) ? str5 : i15 == c.w ? "audio/mpeg" : i15 == c.Za ? "audio/alac" : i15 == c._a ? "audio/g711-alaw" : i15 == c.ab ? "audio/g711-mlaw" : i15 == c.bb ? "audio/opus" : i15 == c.db ? "audio/flac" : null;
        int i16 = i9;
        int i17 = c2;
        int i18 = i8;
        byte[] bArr = null;
        String str7 = str6;
        while (i17 - i13 < i14) {
            pq2.e(i17);
            int h2 = pq.h();
            C1852xq.a(h2 > 0, "childAtomSize should be positive");
            int h3 = pq.h();
            if (h3 == c.W || (z && h3 == c.x)) {
                i11 = h2;
                str3 = str7;
                i10 = i17;
                str2 = str5;
                drmInitData2 = drmInitData4;
                if (h3 == c.W) {
                    i12 = i10;
                } else {
                    i12 = b(pq2, i10, i11);
                }
                if (i12 != -1) {
                    Pair a2 = a(pq2, i12);
                    str7 = (String) a2.first;
                    bArr = (byte[]) a2.second;
                    if ("audio/mp4a-latm".equals(str7)) {
                        Pair a3 = C1912zq.a(bArr);
                        i16 = ((Integer) a3.first).intValue();
                        i18 = ((Integer) a3.second).intValue();
                    }
                    i17 = i10 + i11;
                    i13 = i3;
                    drmInitData4 = drmInitData2;
                    str5 = str2;
                }
            } else {
                if (h3 == c.B) {
                    pq2.e(i17 + 8);
                    cVar2.b = C1362hm.a(pq2, Integer.toString(i5), str4, drmInitData4);
                } else if (h3 == c.D) {
                    pq2.e(i17 + 8);
                    cVar2.b = C1362hm.b(pq2, Integer.toString(i5), str4, drmInitData4);
                } else if (h3 == c.F) {
                    pq2.e(i17 + 8);
                    cVar2.b = C1423jm.a(pq2, Integer.toString(i5), str4, drmInitData4);
                } else if (h3 == c.K) {
                    int i19 = h2;
                    str3 = str7;
                    int i20 = i17;
                    str2 = str5;
                    drmInitData2 = drmInitData4;
                    cVar2.b = Format.a(Integer.toString(i5), str7, null, -1, -1, i18, i16, null, drmInitData2, 0, str);
                    i11 = i19;
                    i10 = i20;
                } else {
                    int i21 = h2;
                    str3 = str7;
                    int i22 = i17;
                    str2 = str5;
                    drmInitData2 = drmInitData4;
                    if (h3 == c.Za) {
                        i11 = i21;
                        byte[] bArr2 = new byte[i11];
                        i10 = i22;
                        pq2.e(i10);
                        pq2.a(bArr2, 0, i11);
                        bArr = bArr2;
                    } else {
                        i11 = i21;
                        i10 = i22;
                        if (h3 == c.cb) {
                            int i23 = i11 - 8;
                            byte[] bArr3 = i;
                            byte[] bArr4 = new byte[(bArr3.length + i23)];
                            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                            pq2.e(i10 + 8);
                            pq2.a(bArr4, i.length, i23);
                            bArr = bArr4;
                        } else if (i11 == c.eb) {
                            int i24 = i11 - 12;
                            byte[] bArr5 = new byte[i24];
                            pq2.e(i10 + 12);
                            pq2.a(bArr5, 0, i24);
                            bArr = bArr5;
                        }
                    }
                }
                i11 = h2;
                str3 = str7;
                i10 = i17;
                str2 = str5;
                drmInitData2 = drmInitData4;
            }
            str7 = str3;
            i17 = i10 + i11;
            i13 = i3;
            drmInitData4 = drmInitData2;
            str5 = str2;
        }
        String str8 = str7;
        String str9 = str5;
        DrmInitData drmInitData5 = drmInitData4;
        int i25 = 2;
        if (cVar2.b == null) {
            String str10 = str8;
            if (str10 != null) {
                if (!str9.equals(str10)) {
                    i25 = -1;
                }
                String num = Integer.toString(i5);
                if (bArr == null) {
                    list = null;
                } else {
                    list = Collections.singletonList(bArr);
                }
                cVar2.b = Format.a(num, str10, (String) null, -1, -1, i18, i16, i25, list, drmInitData5, 0, str);
            }
        }
    }

    private static Pair<String, byte[]> a(Pq pq, int i2) {
        pq.e(i2 + 8 + 4);
        pq.f(1);
        a(pq);
        pq.f(2);
        int t = pq.t();
        if ((t & 128) != 0) {
            pq.f(2);
        }
        if ((t & 64) != 0) {
            pq.f(pq.z());
        }
        if ((t & 32) != 0) {
            pq.f(2);
        }
        pq.f(1);
        a(pq);
        String a2 = Lq.a(pq.t());
        if ("audio/mpeg".equals(a2) || "audio/vnd.dts".equals(a2) || "audio/vnd.dts.hd".equals(a2)) {
            return Pair.create(a2, null);
        }
        pq.f(12);
        pq.f(1);
        int a3 = a(pq);
        byte[] bArr = new byte[a3];
        pq.a(bArr, 0, a3);
        return Pair.create(a2, bArr);
    }

    static Pair<Integer, o> a(Pq pq, int i2, int i3) {
        int i4 = i2 + 8;
        String str = null;
        Object obj = null;
        int i5 = -1;
        int i6 = 0;
        while (i4 - i2 < i3) {
            pq.e(i4);
            int h2 = pq.h();
            int h3 = pq.h();
            if (h3 == c.oa) {
                obj = Integer.valueOf(pq.h());
            } else if (h3 == c.ja) {
                pq.f(4);
                str = pq.b(4);
            } else if (h3 == c.ka) {
                i5 = i4;
                i6 = h2;
            }
            i4 += h2;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        boolean z = true;
        C1852xq.a(obj != null, "frma atom is mandatory");
        C1852xq.a(i5 != -1, "schi atom is mandatory");
        o a2 = a(pq, i5, i6, str);
        if (a2 == null) {
            z = false;
        }
        C1852xq.a(z, "tenc atom is mandatory");
        return Pair.create(obj, a2);
    }

    private static o a(Pq pq, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            pq.e(i6);
            int h2 = pq.h();
            if (pq.h() == c.la) {
                int c2 = c.c(pq.h());
                pq.f(1);
                if (c2 == 0) {
                    pq.f(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int t = pq.t();
                    i4 = t & 15;
                    i5 = (t & 240) >> 4;
                }
                boolean z = pq.t() == 1;
                int t2 = pq.t();
                byte[] bArr2 = new byte[16];
                pq.a(bArr2, 0, bArr2.length);
                if (z && t2 == 0) {
                    int t3 = pq.t();
                    bArr = new byte[t3];
                    pq.a(bArr, 0, t3);
                }
                o oVar = new o(z, str, t2, bArr2, i5, i4, bArr);
                return oVar;
            }
            i6 += h2;
        }
    }

    private static int a(Pq pq) {
        int t = pq.t();
        int i2 = t & 127;
        while ((t & 128) == 128) {
            t = pq.t();
            i2 = (i2 << 7) | (t & 127);
        }
        return i2;
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int a2 = C0471ar.a(4, 0, length);
        int a3 = C0471ar.a(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[a2] || jArr[a3] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
