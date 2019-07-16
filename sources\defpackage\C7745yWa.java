package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: yWa reason: default package and case insensitive filesystem */
/* compiled from: Collections.kt */
public final class C7745yWa implements ListIterator, MYa {
    public static final C7745yWa a = new C7745yWa();

    private C7745yWa() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public Void previous() {
        throw new NoSuchElementException();
    }
}
