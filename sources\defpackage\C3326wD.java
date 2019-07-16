package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: wD reason: default package and case insensitive filesystem */
/* compiled from: ImmutableList */
public abstract class C3326wD<E> extends C3286uD<E> implements List<E>, RandomAccess {
    private static final C3007gE<Object> b = new a(C2328VD.c, 0);

    /* renamed from: wD$a */
    /* compiled from: ImmutableList */
    static class a<E> extends C2363XC<E> {
        private final C3326wD<E> c;

        a(C3326wD<E> wDVar, int i) {
            super(wDVar.size(), i);
            this.c = wDVar;
        }

        /* access modifiers changed from: protected */
        public E a(int i) {
            return this.c.get(i);
        }
    }

    /* renamed from: wD$b */
    /* compiled from: ImmutableList */
    static class b implements Serializable {
        final Object[] a;

        b(Object[] objArr) {
            this.a = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C3326wD.b(this.a);
        }
    }

    /* renamed from: wD$c */
    /* compiled from: ImmutableList */
    class c extends C3326wD<E> {
        final transient int c;
        final transient int d;

        c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        /* access modifiers changed from: 0000 */
        public Object[] c() {
            return C3326wD.this.c();
        }

        /* access modifiers changed from: 0000 */
        public int d() {
            return C3326wD.this.f() + this.c + this.d;
        }

        /* access modifiers changed from: 0000 */
        public int f() {
            return C3326wD.this.f() + this.c;
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, this.d);
            return C3326wD.this.get(i + this.c);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C3326wD.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C3326wD.super.listIterator();
        }

        public int size() {
            return this.d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C3326wD.super.listIterator(i);
        }

        public C3326wD<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.d);
            C3326wD wDVar = C3326wD.this;
            int i3 = this.c;
            return wDVar.subList(i + i3, i2 + i3);
        }
    }

    C3326wD() {
    }

    public static <E> C3326wD<E> a(E e) {
        return c(e);
    }

    public static <E> C3326wD<E> b(E[] eArr) {
        if (eArr.length == 0) {
            return g();
        }
        return c((Object[]) eArr.clone());
    }

    private static <E> C3326wD<E> c(Object... objArr) {
        C2272SD.a(objArr);
        return a(objArr);
    }

    public static <E> C3326wD<E> g() {
        return C2328VD.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return C2063HD.a((List<?>) this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C2063HD.b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C2063HD.c(this, obj);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new b(toArray());
    }

    static <E> C3326wD<E> a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    public C2988fE<E> iterator() {
        return listIterator();
    }

    public C3326wD<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return g();
        }
        return a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public C3326wD<E> a(int i, int i2) {
        return new c(i, i2 - i);
    }

    public C3007gE<E> listIterator() {
        return listIterator(0);
    }

    static <E> C3326wD<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return g();
        }
        return new C2328VD(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public C3007gE<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return b;
        }
        return new a(this, i);
    }
}
