package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Eu reason: default package */
abstract class Eu<T> implements Iterator<T> {
    private int a = Gu.b;
    private T b;

    protected Eu() {
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.a = Gu.c;
        return null;
    }

    public final boolean hasNext() {
        Pu.a(this.a != Gu.d);
        int i = Du.a[this.a - 1];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            this.a = Gu.d;
            this.b = a();
            if (this.a != Gu.c) {
                this.a = Gu.a;
                return true;
            }
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.a = Gu.b;
            T t = this.b;
            this.b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
