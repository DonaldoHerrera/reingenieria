package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.vb reason: case insensitive filesystem */
final class C0901vb extends Na<Integer> implements C0913yb, C0871nc, RandomAccess {
    private static final C0901vb b;
    private int[] c;
    private int d;

    static {
        C0901vb vbVar = new C0901vb(new int[0], 0);
        b = vbVar;
        vbVar.M();
    }

    C0901vb() {
        this(new int[10], 0);
    }

    private final void a(int i, int i2) {
        c();
        if (i >= 0) {
            int i3 = this.d;
            if (i <= i3) {
                int[] iArr = this.c;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
                    this.c = iArr2;
                }
                this.c[i] = i2;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m(i));
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(m(i));
        }
    }

    public static C0901vb d() {
        return b;
    }

    private final String m(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        C0897ub.a(collection);
        if (!(collection instanceof C0901vb)) {
            return super.addAll(collection);
        }
        C0901vb vbVar = (C0901vb) collection;
        int i = vbVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(vbVar.c, 0, this.c, this.d, vbVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0901vb)) {
            return super.equals(obj);
        }
        C0901vb vbVar = (C0901vb) obj;
        if (this.d != vbVar.d) {
            return false;
        }
        int[] iArr = vbVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        a(this.d, i);
    }

    /* renamed from: g */
    public final C0913yb i(int i) {
        if (i >= this.d) {
            return new C0901vb(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        c(i);
        return this.c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
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
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        c(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.d;
    }

    private C0901vb(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
