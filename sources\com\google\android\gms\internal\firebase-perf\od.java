package com.google.android.gms.internal.firebase-perf;

import java.util.NoSuchElementException;

abstract class od<E> extends C0852j<E> {
    private final int a;
    private int b;

    protected od(int i, int i2) {
        Db.b(i2, i);
        this.a = i;
        this.b = i2;
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
}
