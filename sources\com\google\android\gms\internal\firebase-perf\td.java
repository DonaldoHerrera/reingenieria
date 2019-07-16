package com.google.android.gms.internal.firebase-perf;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class td<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] a = new Object[0];

    td() {
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        C0840g gVar = (C0840g) iterator();
        while (gVar.hasNext()) {
            int i2 = i + 1;
            objArr[i] = gVar.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public abstract C0840g<E> iterator();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: 0000 */
    public Object[] d() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public int g() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    public final <T> T[] toArray(T[] tArr) {
        Db.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d = d();
            if (d != null) {
                return Arrays.copyOfRange(d, f(), g(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
