package defpackage;

import java.util.NoSuchElementException;

/* renamed from: eD reason: default package and case insensitive filesystem */
/* compiled from: AbstractSequentialIterator */
public abstract class C2968eD<T> extends C2988fE<T> {
    private T a;

    protected C2968eD(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    public final boolean hasNext() {
        return this.a != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.a;
            } finally {
                this.a = a(this.a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
