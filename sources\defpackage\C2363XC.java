package defpackage;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: XC reason: default package and case insensitive filesystem */
/* compiled from: AbstractIndexedListIterator */
abstract class C2363XC<E> extends C3007gE<E> {
    private final int a;
    private int b;

    protected C2363XC(int i) {
        this(i, 0);
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    protected C2363XC(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.a = i;
        this.b = i2;
    }
}
