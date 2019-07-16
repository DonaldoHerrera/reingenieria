package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lu reason: default package and case insensitive filesystem */
final class C1493lu implements Iterator<T> {
    private final int a = Array.getLength(this.c.a);
    private int b = 0;
    private final /* synthetic */ C1400iu c;

    C1493lu(C1400iu iuVar) {
        this.c = iuVar;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final T next() {
        if (hasNext()) {
            Object obj = this.c.a;
            int i = this.b;
            this.b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
