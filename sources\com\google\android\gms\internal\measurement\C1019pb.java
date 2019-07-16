package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.pb reason: case insensitive filesystem */
final class C1019pb extends Sa<Double> implements Ob<Double>, Bc, RandomAccess {
    private static final C1019pb b;
    private double[] c;
    private int d;

    static {
        C1019pb pbVar = new C1019pb(new double[0], 0);
        b = pbVar;
        pbVar.J();
    }

    C1019pb() {
        this(new double[10], 0);
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private final String i(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(double d2) {
        a(this.d, d2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Hb.a(collection);
        if (!(collection instanceof C1019pb)) {
            return super.addAll(collection);
        }
        C1019pb pbVar = (C1019pb) collection;
        int i = pbVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(pbVar.c, 0, this.c, this.d, pbVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ Ob d(int i) {
        if (i >= this.d) {
            return new C1019pb(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1019pb)) {
            return super.equals(obj);
        }
        C1019pb pbVar = (C1019pb) obj;
        if (this.d != pbVar.d) {
            return false;
        }
        double[] dArr = pbVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        c(i);
        return Double.valueOf(this.c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Hb.a(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.c[i]))) {
                double[] dArr = this.c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        c(i);
        double[] dArr = this.c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.d;
    }

    private C1019pb(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    private final void a(int i, double d2) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                double[] dArr = this.c;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
                    this.c = dArr2;
                }
                this.c[i] = d2;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(i(i));
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        double[] dArr = this.c;
        double d2 = dArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d2);
    }
}
