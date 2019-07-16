package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.ha reason: case insensitive filesystem */
final class C0758ha extends C0792t<Integer> implements C0770la<Integer>, RandomAccess {
    private static final C0758ha b;
    private int[] c;
    private int d;

    static {
        C0758ha haVar = new C0758ha();
        b = haVar;
        haVar.zzv();
    }

    C0758ha() {
        this(new int[10], 0);
    }

    private C0758ha(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
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
        throw new IndexOutOfBoundsException(n(i));
    }

    private final void m(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(n(i));
        }
    }

    private final String n(int i) {
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
            return new C0758ha(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        C0761ia.a(collection);
        if (!(collection instanceof C0758ha)) {
            return super.addAll(collection);
        }
        C0758ha haVar = (C0758ha) collection;
        int i = haVar.d;
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
            System.arraycopy(haVar.c, 0, this.c, this.d, haVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i) {
        a(this.d, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758ha)) {
            return super.equals(obj);
        }
        C0758ha haVar = (C0758ha) obj;
        if (this.d != haVar.d) {
            return false;
        }
        int[] iArr = haVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m(i);
        return this.c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        m(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, this.d - i);
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
        m(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.d;
    }
}
