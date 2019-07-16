package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: _Va reason: default package */
/* compiled from: Collections.kt */
final class _Va<T> implements Collection<T>, MYa {
    private final T[] a;
    private final boolean b;

    public _Va(T[] tArr, boolean z) {
        C7471uYa.b(tArr, "values");
        this.a = tArr;
        this.b = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C6578hWa.a(this.a, obj);
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

    public int f() {
        return this.a.length;
    }

    public boolean isEmpty() {
        return this.a.length == 0;
    }

    public Iterator<T> iterator() {
        return C6920mYa.a(this.a);
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

    public final Object[] toArray() {
        return C6850lWa.a(this.a, this.b);
    }

    public <T> T[] toArray(T[] tArr) {
        return C7195qYa.a(this, tArr);
    }
}
