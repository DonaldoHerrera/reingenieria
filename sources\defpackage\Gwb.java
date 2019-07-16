package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Gwb reason: default package */
/* compiled from: Sequences.kt */
public final class Gwb implements Iterator<T>, MYa {
    private T a;
    private int b = -2;
    final /* synthetic */ Hwb c;

    Gwb(Hwb hwb) {
        this.c = hwb;
    }

    private final void a() {
        T t;
        if (this.b == -2) {
            t = this.c.a.d();
        } else {
            _Xa b2 = this.c.b;
            T t2 = this.a;
            if (t2 != null) {
                t = b2.invoke(t2);
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        this.a = t;
        this.b = this.a == null ? 0 : 1;
    }

    public boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    public T next() {
        if (this.b < 0) {
            a();
        }
        if (this.b != 0) {
            T t = this.a;
            if (t != null) {
                this.b = -1;
                return t;
            }
            throw new OVa("null cannot be cast to non-null type T");
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
