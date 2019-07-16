package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.t reason: case insensitive filesystem */
/* compiled from: DiffUtil */
public class C0425t {
    private static final Comparator<f> a = new C0424s();

    /* renamed from: androidx.recyclerview.widget.t$a */
    /* compiled from: DiffUtil */
    public static abstract class a {
        public abstract int a();

        public abstract boolean a(int i, int i2);

        public abstract int b();

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    /* compiled from: DiffUtil */
    public static class b {
        private final List<f> a;
        private final int[] b;
        private final int[] c;
        private final a d;
        private final int e;
        private final int f;
        private final boolean g;

        b(a aVar, List<f> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(this.b, 0);
            Arrays.fill(this.c, 0);
            this.d = aVar;
            this.e = aVar.b();
            this.f = aVar.a();
            this.g = z;
            a();
            b();
        }

        private void a() {
            f fVar = this.a.isEmpty() ? null : (f) this.a.get(0);
            if (fVar == null || fVar.a != 0 || fVar.b != 0) {
                f fVar2 = new f();
                fVar2.a = 0;
                fVar2.b = 0;
                fVar2.d = false;
                fVar2.c = 0;
                fVar2.e = false;
                this.a.add(0, fVar2);
            }
        }

        private void b() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                f fVar = (f) this.a.get(size);
                int i3 = fVar.a;
                int i4 = fVar.c;
                int i5 = i3 + i4;
                int i6 = fVar.b + i4;
                if (this.g) {
                    while (i > i5) {
                        a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < fVar.c; i7++) {
                    int i8 = fVar.a + i7;
                    int i9 = fVar.b + i7;
                    int i10 = this.d.a(i8, i9) ? 1 : 2;
                    this.b[i8] = (i9 << 5) | i10;
                    this.c[i9] = (i8 << 5) | i10;
                }
                i = fVar.a;
                i2 = fVar.b;
            }
        }

        private void a(int i, int i2, int i3) {
            if (this.b[i - 1] == 0) {
                a(i, i2, i3, false);
            }
        }

        private boolean a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                f fVar = (f) this.a.get(i3);
                int i6 = fVar.a;
                int i7 = fVar.c;
                int i8 = i6 + i7;
                int i9 = fVar.b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.d.b(i11, i4)) {
                            if (!this.d.a(i11, i4)) {
                                i10 = 4;
                            }
                            this.c[i4] = (i11 << 5) | 16;
                            this.b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.d.b(i4, i12)) {
                            if (!this.d.a(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.b[i13] = (i12 << 5) | 16;
                            this.c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = fVar.a;
                i2 = fVar.b;
                i3--;
            }
            return false;
        }

        private void b(int i, int i2, int i3) {
            if (this.c[i2 - 1] == 0) {
                a(i, i2, i3, true);
            }
        }

        private void b(List<d> list, O o, int i, int i2, int i3) {
            if (!this.g) {
                o.b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.b[i5] & 31;
                if (i6 == 0) {
                    o.b(i + i4, 1);
                    for (d dVar : list) {
                        dVar.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.b[i5] >> 5;
                    d a2 = a(list, i7, false);
                    o.c(i + i4, a2.b - 1);
                    if (i6 == 4) {
                        o.a(a2.b - 1, 1, this.d.c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new d(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        public void a(androidx.recyclerview.widget.RecyclerView.a aVar) {
            a((O) new C0408b(aVar));
        }

        public void a(O o) {
            C0414h hVar;
            if (o instanceof C0414h) {
                hVar = (C0414h) o;
            } else {
                hVar = new C0414h(o);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                f fVar = (f) this.a.get(size);
                int i3 = fVar.c;
                int i4 = fVar.a + i3;
                int i5 = fVar.b + i3;
                if (i4 < i) {
                    b(arrayList, hVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    a(arrayList, hVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.b;
                    int i7 = fVar.a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        hVar.a(i7 + i6, 1, this.d.c(i7 + i6, fVar.b + i6));
                    }
                }
                i = fVar.a;
                i2 = fVar.b;
            }
            hVar.a();
        }

        private static d a(List<d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                d dVar = (d) list.get(size);
                if (dVar.a == i && dVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        d dVar2 = (d) list.get(size);
                        dVar2.b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        private void a(List<d> list, O o, int i, int i2, int i3) {
            if (!this.g) {
                o.a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.c[i5] & 31;
                if (i6 == 0) {
                    o.a(i, 1);
                    for (d dVar : list) {
                        dVar.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.c[i5] >> 5;
                    o.c(a(list, i7, true).b, i);
                    if (i6 == 4) {
                        o.a(i, 1, this.d.c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new d(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$c */
    /* compiled from: DiffUtil */
    public static abstract class c<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public Object c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$d */
    /* compiled from: DiffUtil */
    private static class d {
        int a;
        int b;
        boolean c;

        public d(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$e */
    /* compiled from: DiffUtil */
    static class e {
        int a;
        int b;
        int c;
        int d;

        public e() {
        }

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$f */
    /* compiled from: DiffUtil */
    static class f {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        f() {
        }
    }

    public static b a(a aVar) {
        return a(aVar, true);
    }

    public static b a(a aVar, boolean z) {
        e eVar;
        int b2 = aVar.b();
        int a2 = aVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new e(0, b2, 0, a2));
        int abs = Math.abs(b2 - a2) + b2 + a2;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            e eVar2 = (e) arrayList2.remove(arrayList2.size() - 1);
            f a3 = a(aVar, eVar2.a, eVar2.b, eVar2.c, eVar2.d, iArr, iArr2, abs);
            if (a3 != null) {
                if (a3.c > 0) {
                    arrayList.add(a3);
                }
                a3.a += eVar2.a;
                a3.b += eVar2.c;
                if (arrayList3.isEmpty()) {
                    eVar = new e();
                } else {
                    eVar = (e) arrayList3.remove(arrayList3.size() - 1);
                }
                eVar.a = eVar2.a;
                eVar.c = eVar2.c;
                if (a3.e) {
                    eVar.b = a3.a;
                    eVar.d = a3.b;
                } else if (a3.d) {
                    eVar.b = a3.a - 1;
                    eVar.d = a3.b;
                } else {
                    eVar.b = a3.a;
                    eVar.d = a3.b - 1;
                }
                arrayList2.add(eVar);
                if (!a3.e) {
                    int i2 = a3.a;
                    int i3 = a3.c;
                    eVar2.a = i2 + i3;
                    eVar2.c = a3.b + i3;
                } else if (a3.d) {
                    int i4 = a3.a;
                    int i5 = a3.c;
                    eVar2.a = i4 + i5 + 1;
                    eVar2.c = a3.b + i5;
                } else {
                    int i6 = a3.a;
                    int i7 = a3.c;
                    eVar2.a = i6 + i7;
                    eVar2.c = a3.b + i7 + 1;
                }
                arrayList2.add(eVar2);
            } else {
                arrayList3.add(eVar2);
            }
        }
        Collections.sort(arrayList, a);
        b bVar = new b(aVar, arrayList, iArr, iArr2, z);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    private static f a(a aVar, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        a aVar2 = aVar;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i12 = i2 - i;
        int i13 = i4 - i3;
        int i14 = 1;
        if (i12 < 1 || i13 < 1) {
            return null;
        }
        int i15 = i12 - i13;
        int i16 = ((i12 + i13) + 1) / 2;
        int i17 = (i5 - i16) - 1;
        int i18 = i5 + i16 + 1;
        Arrays.fill(iArr3, i17, i18, 0);
        Arrays.fill(iArr4, i17 + i15, i18 + i15, i12);
        boolean z3 = i15 % 2 != 0;
        int i19 = 0;
        while (i19 <= i16) {
            int i20 = -i19;
            int i21 = i20;
            while (i21 <= i19) {
                if (i21 != i20) {
                    if (i21 != i19) {
                        int i22 = i5 + i21;
                    }
                    i10 = iArr3[(i5 + i21) - i14] + i14;
                    z2 = true;
                    i11 = i10 - i21;
                    while (i10 < i12 && i11 < i13 && aVar2.b(i + i10, i3 + i11)) {
                        i10++;
                        i11++;
                    }
                    int i23 = i5 + i21;
                    iArr3[i23] = i10;
                    if (z3 || i21 < (i15 - i19) + 1 || i21 > (i15 + i19) - 1 || iArr3[i23] < iArr4[i23]) {
                        i21 += 2;
                        i14 = 1;
                    } else {
                        f fVar = new f();
                        fVar.a = iArr4[i23];
                        fVar.b = fVar.a - i21;
                        fVar.c = iArr3[i23] - iArr4[i23];
                        fVar.d = z2;
                        fVar.e = false;
                        return fVar;
                    }
                }
                i10 = iArr3[i5 + i21 + i14];
                z2 = false;
                i11 = i10 - i21;
                while (i10 < i12) {
                    i10++;
                    i11++;
                }
                int i232 = i5 + i21;
                iArr3[i232] = i10;
                if (z3) {
                }
                i21 += 2;
                i14 = 1;
            }
            int i24 = i20;
            while (i24 <= i19) {
                int i25 = i24 + i15;
                if (i25 != i19 + i15) {
                    if (i25 != i20 + i15) {
                        int i26 = i5 + i25;
                        i9 = 1;
                    } else {
                        i9 = 1;
                    }
                    i6 = iArr4[(i5 + i25) + i9] - i9;
                    z = true;
                    i7 = i6 - i25;
                    while (true) {
                        if (i6 > 0 && i7 > 0) {
                            i8 = i12;
                            if (!aVar2.b((i + i6) - 1, (i3 + i7) - 1)) {
                                break;
                            }
                            i6--;
                            i7--;
                            i12 = i8;
                        } else {
                            i8 = i12;
                        }
                    }
                    i8 = i12;
                    int i27 = i5 + i25;
                    iArr4[i27] = i6;
                    if (!z3 || i25 < i20 || i25 > i19 || iArr3[i27] < iArr4[i27]) {
                        i24 += 2;
                        i12 = i8;
                    } else {
                        f fVar2 = new f();
                        fVar2.a = iArr4[i27];
                        fVar2.b = fVar2.a - i25;
                        fVar2.c = iArr3[i27] - iArr4[i27];
                        fVar2.d = z;
                        fVar2.e = true;
                        return fVar2;
                    }
                } else {
                    i9 = 1;
                }
                i6 = iArr4[(i5 + i25) - i9];
                z = false;
                i7 = i6 - i25;
                while (true) {
                    if (i6 > 0) {
                        break;
                    }
                    break;
                    i6--;
                    i7--;
                    i12 = i8;
                }
                i8 = i12;
                int i272 = i5 + i25;
                iArr4[i272] = i6;
                if (!z3) {
                }
                i24 += 2;
                i12 = i8;
            }
            i19++;
            i12 = i12;
            i14 = 1;
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
