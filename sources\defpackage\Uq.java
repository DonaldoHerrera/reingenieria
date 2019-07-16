package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: Uq reason: default package */
/* compiled from: SlidingPercentile */
public class Uq {
    private static final Comparator<a> a = C1762uq.a;
    private static final Comparator<a> b = C1792vq.a;
    private final int c;
    private final ArrayList<a> d = new ArrayList<>();
    private final a[] e = new a[5];
    private int f = -1;
    private int g;
    private int h;
    private int i;

    /* renamed from: Uq$a */
    /* compiled from: SlidingPercentile */
    private static class a {
        public int a;
        public int b;
        public float c;

        private a() {
        }
    }

    public Uq(int i2) {
        this.c = i2;
    }

    static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.a - aVar2.a;
    }

    private void c() {
        if (this.f != 0) {
            Collections.sort(this.d, b);
            this.f = 0;
        }
    }

    private void b() {
        if (this.f != 1) {
            Collections.sort(this.d, a);
            this.f = 1;
        }
    }

    public void a() {
        this.d.clear();
        this.f = -1;
        this.g = 0;
        this.h = 0;
    }

    public void a(int i2, float f2) {
        a aVar;
        b();
        int i3 = this.i;
        if (i3 > 0) {
            a[] aVarArr = this.e;
            int i4 = i3 - 1;
            this.i = i4;
            aVar = aVarArr[i4];
        } else {
            aVar = new a();
        }
        int i5 = this.g;
        this.g = i5 + 1;
        aVar.a = i5;
        aVar.b = i2;
        aVar.c = f2;
        this.d.add(aVar);
        this.h += i2;
        while (true) {
            int i6 = this.h;
            int i7 = this.c;
            if (i6 > i7) {
                int i8 = i6 - i7;
                a aVar2 = (a) this.d.get(0);
                int i9 = aVar2.b;
                if (i9 <= i8) {
                    this.h -= i9;
                    this.d.remove(0);
                    int i10 = this.i;
                    if (i10 < 5) {
                        a[] aVarArr2 = this.e;
                        this.i = i10 + 1;
                        aVarArr2[i10] = aVar2;
                    }
                } else {
                    aVar2.b = i9 - i8;
                    this.h -= i8;
                }
            } else {
                return;
            }
        }
    }

    public float a(float f2) {
        float f3;
        c();
        float f4 = f2 * ((float) this.h);
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            a aVar = (a) this.d.get(i3);
            i2 += aVar.b;
            if (((float) i2) >= f4) {
                return aVar.c;
            }
        }
        if (this.d.isEmpty()) {
            f3 = Float.NaN;
        } else {
            ArrayList<a> arrayList = this.d;
            f3 = ((a) arrayList.get(arrayList.size() - 1)).c;
        }
        return f3;
    }
}
