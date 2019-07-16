package defpackage;

import android.graphics.Color;
import android.util.TimingLogger;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: Cd reason: default package */
/* compiled from: ColorCutQuantizer */
final class Cd {
    private static final Comparator<a> a = new Bd();
    final int[] b;
    final int[] c;
    final List<d> d;
    final TimingLogger e = null;
    final b[] f;
    private final float[] g = new float[3];

    /* renamed from: Cd$a */
    /* compiled from: ColorCutQuantizer */
    private class a {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        a(int i2, int i3) {
            this.a = i2;
            this.b = i3;
            c();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return e() > 1;
        }

        /* access modifiers changed from: 0000 */
        public final int b() {
            int f2 = f();
            Cd cd = Cd.this;
            int[] iArr = cd.b;
            int[] iArr2 = cd.c;
            Cd.a(iArr, f2, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            Cd.a(iArr, f2, this.a, this.b);
            int i2 = this.c / 2;
            int i3 = this.a;
            int i4 = 0;
            while (true) {
                int i5 = this.b;
                if (i3 > i5) {
                    return this.a;
                }
                i4 += iArr2[iArr[i3]];
                if (i4 >= i2) {
                    return Math.min(i5 - 1, i3);
                }
                i3++;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            Cd cd = Cd.this;
            int[] iArr = cd.b;
            int[] iArr2 = cd.c;
            int i2 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i3 = Integer.MIN_VALUE;
            int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i5 = Integer.MIN_VALUE;
            int i6 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.a; i9 <= this.b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int c2 = Cd.c(i10);
                int b2 = Cd.b(i10);
                int a2 = Cd.a(i10);
                if (c2 > i3) {
                    i3 = c2;
                }
                if (c2 < i2) {
                    i2 = c2;
                }
                if (b2 > i5) {
                    i5 = b2;
                }
                if (b2 < i4) {
                    i4 = b2;
                }
                if (a2 > i7) {
                    i7 = a2;
                }
                if (a2 < i6) {
                    i6 = a2;
                }
            }
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = i7;
            this.c = i8;
        }

        /* access modifiers changed from: 0000 */
        public final d d() {
            Cd cd = Cd.this;
            int[] iArr = cd.b;
            int[] iArr2 = cd.c;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.a; i6 <= this.b; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += Cd.c(i7) * i8;
                i4 += Cd.b(i7) * i8;
                i5 += i8 * Cd.a(i7);
            }
            float f2 = (float) i3;
            return new d(Cd.a(Math.round(((float) i2) / f2), Math.round(((float) i4) / f2), Math.round(((float) i5) / f2)), i3);
        }

        /* access modifiers changed from: 0000 */
        public final int e() {
            return (this.b + 1) - this.a;
        }

        /* access modifiers changed from: 0000 */
        public final int f() {
            int i2 = this.e - this.d;
            int i3 = this.g - this.f;
            int i4 = this.i - this.h;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: 0000 */
        public final int g() {
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        /* access modifiers changed from: 0000 */
        public final a h() {
            if (a()) {
                int b2 = b();
                a aVar = new a(b2 + 1, this.b);
                this.b = b2;
                c();
                return aVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    Cd(int[] iArr, int i, b[] bVarArr) {
        this.f = bVarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int e2 = e(iArr[i2]);
            iArr[i2] = e2;
            iArr2[e2] = iArr2[e2] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            if (iArr2[i4] > 0 && g(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.b = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            if (iArr2[i6] > 0) {
                int i7 = i5 + 1;
                iArr3[i5] = i6;
                i5 = i7;
            }
        }
        if (i3 <= i) {
            this.d = new ArrayList();
            for (int i8 : iArr3) {
                this.d.add(new d(d(i8), iArr2[i8]));
            }
            return;
        }
        this.d = f(i);
    }

    static int a(int i) {
        return i & 31;
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    private static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int c(int i) {
        return (i >> 10) & 31;
    }

    private static int d(int i) {
        return a(c(i), b(i), a(i));
    }

    private static int e(int i) {
        return b(Color.blue(i), 8, 5) | (b(Color.red(i), 8, 5) << 10) | (b(Color.green(i), 8, 5) << 5);
    }

    private List<d> f(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, a);
        priorityQueue.offer(new a(0, this.b.length - 1));
        a(priorityQueue, i);
        return a((Collection<a>) priorityQueue);
    }

    private boolean g(int i) {
        int d2 = d(i);
        C0301ab.a(d2, this.g);
        return a(d2, this.g);
    }

    /* access modifiers changed from: 0000 */
    public List<d> a() {
        return this.d;
    }

    private void a(PriorityQueue<a> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            a aVar = (a) priorityQueue.poll();
            if (aVar != null && aVar.a()) {
                priorityQueue.offer(aVar.h());
                priorityQueue.offer(aVar);
            } else {
                return;
            }
        }
    }

    private List<d> a(Collection<a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (a d2 : collection) {
            d d3 = d2.d();
            if (!a(d3)) {
                arrayList.add(d3);
            }
        }
        return arrayList;
    }

    static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -3) {
            return;
        }
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = a(i4) | (b(i4) << 10) | (c(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = c(i5) | (a(i5) << 10) | (b(i5) << 5);
                i2++;
            }
        }
    }

    private boolean a(d dVar) {
        return a(dVar.d(), dVar.b());
    }

    private boolean a(int i, float[] fArr) {
        b[] bVarArr = this.f;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }
}
