package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.x reason: case insensitive filesystem */
final class C0804x extends C0792t<Boolean> implements C0770la<Boolean>, RandomAccess {
    private static final C0804x b;
    private boolean[] c;
    private int d;

    static {
        C0804x xVar = new C0804x();
        b = xVar;
        xVar.zzv();
    }

    C0804x() {
        this(new boolean[10], 0);
    }

    private C0804x(boolean[] zArr, int i) {
        this.c = zArr;
        this.d = i;
    }

    private final void a(int i, boolean z) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                boolean[] zArr = this.c;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.c, i, zArr2, i + 1, this.d - i);
                    this.c = zArr2;
                }
                this.c[i] = z;
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

    private final String m(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ C0770la a(int i) {
        if (i >= this.d) {
            return new C0804x(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z) {
        a(this.d, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        C0761ia.a(collection);
        if (!(collection instanceof C0804x)) {
            return super.addAll(collection);
        }
        C0804x xVar = (C0804x) collection;
        int i = xVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.c;
            if (i3 > zArr.length) {
                this.c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(xVar.c, 0, this.c, this.d, xVar.d);
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
        if (!(obj instanceof C0804x)) {
            return super.equals(obj);
        }
        C0804x xVar = (C0804x) obj;
        if (this.d != xVar.d) {
            return false;
        }
        boolean[] zArr = xVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        c(i);
        return Boolean.valueOf(this.c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + C0761ia.a(this.c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.c[i]))) {
                boolean[] zArr = this.c;
                System.arraycopy(zArr, i + 1, zArr, i, this.d - i);
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
            boolean[] zArr = this.c;
            System.arraycopy(zArr, i2, zArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        c(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.d;
    }
}
