package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: XVa reason: default package */
/* compiled from: AbstractIterator.kt */
public abstract class XVa<T> implements Iterator<T>, MYa {
    private WWa a = WWa.NotReady;
    private T b;

    private final boolean e() {
        this.a = WWa.Failed;
        a();
        return this.a == WWa.Ready;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void b(T t) {
        this.b = t;
        this.a = WWa.Ready;
    }

    public boolean hasNext() {
        if (this.a != WWa.Failed) {
            int i = WVa.a[this.a.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public T next() {
        if (hasNext()) {
            this.a = WWa.NotReady;
            return this.b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a = WWa.Done;
    }
}
