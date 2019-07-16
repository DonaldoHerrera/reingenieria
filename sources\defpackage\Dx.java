package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Dx reason: default package */
final class Dx implements Iterator<Object> {
    Dx() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
