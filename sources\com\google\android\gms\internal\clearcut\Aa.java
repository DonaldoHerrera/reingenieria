package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class Aa extends C0792t<Long> implements C0770la<Long>, RandomAccess {
    private static final Aa b;
    private long[] c;
    private int d;

    static {
        Aa aa = new Aa();
        b = aa;
        aa.zzv();
    }

    Aa() {
        this(new long[10], 0);
    }

    private Aa(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    private final void a(int i, long j) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                long[] jArr = this.c;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
                    this.c = jArr2;
                }
                this.c[i] = j;
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
            return new Aa(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(long j) {
        a(this.d, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        C0761ia.a(collection);
        if (!(collection instanceof Aa)) {
            return super.addAll(collection);
        }
        Aa aa = (Aa) collection;
        int i = aa.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.c;
            if (i3 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(aa.c, 0, this.c, this.d, aa.d);
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
        if (!(obj instanceof Aa)) {
            return super.equals(obj);
        }
        Aa aa = (Aa) obj;
        if (this.d != aa.d) {
            return false;
        }
        long[] jArr = aa.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        c(i);
        return this.c[i];
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
        long[] jArr = this.c;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.c[i]))) {
                long[] jArr = this.c;
                System.arraycopy(jArr, i + 1, jArr, i, this.d - i);
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
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        c(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.d;
    }
}
