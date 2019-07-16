package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lYa reason: default package and case insensitive filesystem */
/* compiled from: ArrayIterator.kt */
final class C6852lYa<T> implements Iterator<T>, MYa {
    private int a;
    private final T[] b;

    public C6852lYa(T[] tArr) {
        C7471uYa.b(tArr, "array");
        this.b = tArr;
    }

    public boolean hasNext() {
        return this.a < this.b.length;
    }

    public T next() {
        try {
            T[] tArr = this.b;
            int i = this.a;
            this.a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
