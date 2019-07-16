package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yD reason: default package and case insensitive filesystem */
/* compiled from: ImmutableSet */
public abstract class C3366yD<E> extends C3286uD<E> implements Set<E> {
    @RetainedWith
    @LazyInit
    private transient C3326wD<E> b;

    /* renamed from: yD$a */
    /* compiled from: ImmutableSet */
    private static class a implements Serializable {
        final Object[] a;

        a(Object[] objArr) {
            this.a = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C3366yD.a((E[]) this.a);
        }
    }

    C3366yD() {
    }

    public static <E> C3366yD<E> a(E e) {
        return new C2477cE(e);
    }

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int c(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    public static <E> C3366yD<E> j() {
        return C2382YD.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3366yD) || !i() || !((C3366yD) obj).i() || hashCode() == obj.hashCode()) {
            return C2458bE.a((Set<?>) this, obj);
        }
        return false;
    }

    public C3326wD<E> g() {
        C3326wD<E> wDVar = this.b;
        if (wDVar != null) {
            return wDVar;
        }
        C3326wD<E> h = h();
        this.b = h;
        return h;
    }

    /* access modifiers changed from: 0000 */
    public C3326wD<E> h() {
        return C3326wD.a(toArray());
    }

    public int hashCode() {
        return C2458bE.a((Set<?>) this);
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return false;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new a(toArray());
    }

    public static <E> C3366yD<E> a(E e, E e2) {
        return a(2, e, e2);
    }

    private static <E> C3366yD<E> a(int i, Object... objArr) {
        if (i == 0) {
            return j();
        }
        if (i == 1) {
            return a((E) objArr[0]);
        }
        int c = c(i);
        Object[] objArr2 = new Object[c];
        int i2 = c - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C2272SD.a(obj, i5);
            int hashCode = obj.hashCode();
            int a2 = C3266tD.a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    int i7 = i4 + 1;
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4 = i7;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, null);
        if (i4 == 1) {
            return new C2477cE(objArr[0], i3);
        }
        if (c(i4) < c / 2) {
            return a(i4, objArr);
        }
        if (a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        C2382YD yd = new C2382YD(objArr, i3, objArr2, i2, i4);
        return yd;
    }

    public static <E> C3366yD<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return j();
        }
        if (length != 1) {
            return a(eArr.length, (Object[]) eArr.clone());
        }
        return a(eArr[0]);
    }
}
