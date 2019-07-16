package defpackage;

import java.util.Collection;

/* renamed from: VVa reason: default package */
/* compiled from: AbstractCollection.kt */
public abstract class VVa<E> implements Collection<E>, MYa {
    protected VVa() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C7471uYa.a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C7471uYa.b(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public abstract int f();

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return f();
    }

    public Object[] toArray() {
        return C7195qYa.a(this);
    }

    public String toString() {
        return C7676xWa.a(this, ", ", "[", "]", 0, null, new UVa(this), 24, null);
    }

    public <T> T[] toArray(T[] tArr) {
        C7471uYa.b(tArr, "array");
        T[] a = C7195qYa.a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
