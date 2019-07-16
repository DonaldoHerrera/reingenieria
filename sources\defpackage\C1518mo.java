package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: mo reason: default package and case insensitive filesystem */
/* compiled from: H264Reader */
public final class C1518mo implements C1425jo {
    private final C1910zo a;
    private final boolean b;
    private final boolean c;
    private final C1670ro d = new C1670ro(7, 128);
    private final C1670ro e = new C1670ro(8, 128);
    private final C1670ro f = new C1670ro(6, 128);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private C1424jn j;
    private a k;
    private boolean l;
    private long m;
    private boolean n;
    private final Pq o = new Pq();

    /* renamed from: mo$a */
    /* compiled from: H264Reader */
    private static final class a {
        private final C1424jn a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<b> d = new SparseArray<>();
        private final SparseArray<defpackage.Mq.a> e = new SparseArray<>();
        private final Qq f = new Qq(this.g, 0, 0);
        private byte[] g = new byte[128];
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private C0049a m = new C0049a();
        private C0049a n = new C0049a();
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        /* renamed from: mo$a$a reason: collision with other inner class name */
        /* compiled from: H264Reader */
        private static final class C0049a {
            private boolean a;
            private boolean b;
            private b c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private C0049a() {
            }

            public boolean b() {
                if (this.b) {
                    int i2 = this.e;
                    if (i2 == 7 || i2 == 2) {
                        return true;
                    }
                }
                return false;
            }

            public void a() {
                this.b = false;
                this.a = false;
            }

            public void a(int i2) {
                this.e = i2;
                this.b = true;
            }

            public void a(b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.c = bVar;
                this.d = i2;
                this.e = i3;
                this.f = i4;
                this.g = i5;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.a = true;
                this.b = true;
            }

            /* access modifiers changed from: private */
            public boolean a(C0049a aVar) {
                if (this.a) {
                    if (!aVar.a || this.f != aVar.f || this.g != aVar.g || this.h != aVar.h) {
                        return true;
                    }
                    if (this.i && aVar.i && this.j != aVar.j) {
                        return true;
                    }
                    int i2 = this.d;
                    int i3 = aVar.d;
                    if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                        return true;
                    }
                    if (this.c.k == 0 && aVar.c.k == 0 && (this.m != aVar.m || this.n != aVar.n)) {
                        return true;
                    }
                    if (this.c.k == 1 && aVar.c.k == 1 && (this.o != aVar.o || this.p != aVar.p)) {
                        return true;
                    }
                    boolean z = this.k;
                    boolean z2 = aVar.k;
                    if (z != z2) {
                        return true;
                    }
                    if (z && z2 && this.l != aVar.l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public a(C1424jn jnVar, boolean z, boolean z2) {
            this.a = jnVar;
            this.b = z;
            this.c = z2;
            b();
        }

        public boolean a() {
            return this.c;
        }

        public void b() {
            this.k = false;
            this.o = false;
            this.n.a();
        }

        public void a(b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void a(defpackage.Mq.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public void a(long j2, int i2, long j3) {
            this.i = i2;
            this.l = j3;
            this.j = j2;
            if (!this.b || this.i != 1) {
                if (this.c) {
                    int i3 = this.i;
                    if (!(i3 == 5 || i3 == 1 || i3 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C0049a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            this.n.a();
            this.h = 0;
            this.k = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0150  */
        public void a(byte[] bArr, int i2, int i3) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = i2;
            if (this.k) {
                int i11 = i3 - i10;
                byte[] bArr2 = this.g;
                int length = bArr2.length;
                int i12 = this.h;
                if (length < i12 + i11) {
                    this.g = Arrays.copyOf(bArr2, (i12 + i11) * 2);
                }
                System.arraycopy(bArr, i10, this.g, this.h, i11);
                this.h += i11;
                this.f.a(this.g, 0, this.h);
                if (this.f.a(8)) {
                    this.f.e();
                    int b2 = this.f.b(2);
                    this.f.c(5);
                    if (this.f.a()) {
                        this.f.d();
                        if (this.f.a()) {
                            int d2 = this.f.d();
                            if (!this.c) {
                                this.k = false;
                                this.n.a(d2);
                            } else if (this.f.a()) {
                                int d3 = this.f.d();
                                if (this.e.indexOfKey(d3) < 0) {
                                    this.k = false;
                                    return;
                                }
                                defpackage.Mq.a aVar = (defpackage.Mq.a) this.e.get(d3);
                                b bVar = (b) this.d.get(aVar.b);
                                if (bVar.h) {
                                    if (this.f.a(2)) {
                                        this.f.c(2);
                                    } else {
                                        return;
                                    }
                                }
                                if (this.f.a(bVar.j)) {
                                    int b3 = this.f.b(bVar.j);
                                    if (bVar.i) {
                                        z3 = false;
                                    } else if (this.f.a(1)) {
                                        boolean b4 = this.f.b();
                                        if (!b4) {
                                            z3 = b4;
                                        } else if (this.f.a(1)) {
                                            z3 = b4;
                                            z = this.f.b();
                                            z2 = true;
                                            z4 = this.i != 5;
                                            if (z4) {
                                                i4 = 0;
                                            } else if (this.f.a()) {
                                                i4 = this.f.d();
                                            } else {
                                                return;
                                            }
                                            i5 = bVar.k;
                                            if (i5 != 0) {
                                                if (this.f.a(bVar.l)) {
                                                    int b5 = this.f.b(bVar.l);
                                                    if (!aVar.c || z3) {
                                                        i9 = b5;
                                                    } else if (this.f.a()) {
                                                        i8 = this.f.c();
                                                        i9 = b5;
                                                        i7 = 0;
                                                        i6 = 0;
                                                        this.n.a(bVar, b2, d2, b3, d3, z3, z2, z, z4, i4, i9, i8, i7, i6);
                                                        this.k = false;
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            } else if (i5 != 1 || bVar.m) {
                                                i9 = 0;
                                            } else if (this.f.a()) {
                                                int c2 = this.f.c();
                                                if (!aVar.c || z3) {
                                                    i7 = c2;
                                                    i9 = 0;
                                                    i8 = 0;
                                                    i6 = 0;
                                                    this.n.a(bVar, b2, d2, b3, d3, z3, z2, z, z4, i4, i9, i8, i7, i6);
                                                    this.k = false;
                                                } else if (this.f.a()) {
                                                    i6 = this.f.c();
                                                    i7 = c2;
                                                    i9 = 0;
                                                    i8 = 0;
                                                    this.n.a(bVar, b2, d2, b3, d3, z3, z2, z, z4, i4, i9, i8, i7, i6);
                                                    this.k = false;
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                            i8 = 0;
                                            i7 = 0;
                                            i6 = 0;
                                            this.n.a(bVar, b2, d2, b3, d3, z3, z2, z, z4, i4, i9, i8, i7, i6);
                                            this.k = false;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                    z2 = false;
                                    z = false;
                                    if (this.i != 5) {
                                    }
                                    if (z4) {
                                    }
                                    i5 = bVar.k;
                                    if (i5 != 0) {
                                    }
                                    i8 = 0;
                                    i7 = 0;
                                    i6 = 0;
                                    this.n.a(bVar, b2, d2, b3, d3, z3, z2, z, z4, i4, i9, i8, i7, i6);
                                    this.k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean a(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.a(this.m))) {
                if (z && this.o) {
                    a(i2 + ((int) (j2 - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                z2 = this.n.b();
            }
            boolean z4 = this.r;
            int i3 = this.i;
            if (i3 == 5 || (z2 && i3 == 1)) {
                z3 = true;
            }
            this.r = z4 | z3;
            return this.r;
        }

        private void a(int i2) {
            int i3 = (int) (this.j - this.p);
            int i4 = i2;
            this.a.a(this.q, this.r ? 1 : 0, i3, i4, null);
        }
    }

    public C1518mo(C1910zo zoVar, boolean z, boolean z2) {
        this.a = zoVar;
        this.b = z;
        this.c = z2;
    }

    public void a() {
        Mq.a(this.h);
        this.d.b();
        this.e.b();
        this.f.b();
        this.k.b();
        this.g = 0;
        this.n = false;
    }

    public void b() {
    }

    public void a(C0498bn bnVar, d dVar) {
        dVar.a();
        this.i = dVar.b();
        this.j = bnVar.a(dVar.c(), 2);
        this.k = new a(this.j, this.b, this.c);
        this.a.a(bnVar, dVar);
    }

    public void a(long j2, int i2) {
        this.m = j2;
        this.n |= (i2 & 2) != 0;
    }

    public void a(Pq pq) {
        int c2 = pq.c();
        int d2 = pq.d();
        byte[] bArr = pq.a;
        this.g += (long) pq.a();
        this.j.a(pq, pq.a());
        while (true) {
            int a2 = Mq.a(bArr, c2, d2, this.h);
            if (a2 == d2) {
                a(bArr, c2, d2);
                return;
            }
            int b2 = Mq.b(bArr, a2);
            int i2 = a2 - c2;
            if (i2 > 0) {
                a(bArr, c2, a2);
            }
            int i3 = d2 - a2;
            long j2 = this.g - ((long) i3);
            a(j2, i3, i2 < 0 ? -i2 : 0, this.m);
            a(j2, b2, this.m);
            c2 = a2 + 3;
        }
    }

    private void a(long j2, int i2, long j3) {
        if (!this.l || this.k.a()) {
            this.d.b(i2);
            this.e.b(i2);
        }
        this.f.b(i2);
        this.k.a(j2, i2, j3);
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.a()) {
            this.d.a(bArr, i2, i3);
            this.e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void a(long j2, int i2, int i3, long j3) {
        int i4 = i3;
        if (!this.l || this.k.a()) {
            this.d.a(i4);
            this.e.a(i4);
            if (!this.l) {
                if (this.d.a() && this.e.a()) {
                    ArrayList arrayList = new ArrayList();
                    C1670ro roVar = this.d;
                    arrayList.add(Arrays.copyOf(roVar.d, roVar.e));
                    C1670ro roVar2 = this.e;
                    arrayList.add(Arrays.copyOf(roVar2.d, roVar2.e));
                    C1670ro roVar3 = this.d;
                    b b2 = Mq.b(roVar3.d, 3, roVar3.e);
                    C1670ro roVar4 = this.e;
                    defpackage.Mq.a a2 = Mq.a(roVar4.d, 3, roVar4.e);
                    this.j.a(Format.a(this.i, "video/avc", C1912zq.b(b2.a, b2.b, b2.c), -1, -1, b2.e, b2.f, -1.0f, (List<byte[]>) arrayList, -1, b2.g, (DrmInitData) null));
                    this.l = true;
                    this.k.a(b2);
                    this.k.a(a2);
                    this.d.b();
                    this.e.b();
                }
            } else if (this.d.a()) {
                C1670ro roVar5 = this.d;
                this.k.a(Mq.b(roVar5.d, 3, roVar5.e));
                this.d.b();
            } else if (this.e.a()) {
                C1670ro roVar6 = this.e;
                this.k.a(Mq.a(roVar6.d, 3, roVar6.e));
                this.e.b();
            }
        }
        if (this.f.a(i3)) {
            C1670ro roVar7 = this.f;
            this.o.a(this.f.d, Mq.c(roVar7.d, roVar7.e));
            this.o.e(4);
            this.a.a(j3, this.o);
        }
        if (this.k.a(j2, i2, this.l, this.n)) {
            this.n = false;
        }
    }
}
