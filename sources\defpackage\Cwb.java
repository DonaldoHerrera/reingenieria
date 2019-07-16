package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Cwb reason: default package */
/* compiled from: Sequences.kt */
public final class Cwb implements Iterator<T>, MYa {
    private final Iterator<T> a;
    private int b = -1;
    private T c;
    final /* synthetic */ Dwb d;

    Cwb(Dwb dwb) {
        this.d = dwb;
        this.a = dwb.a.iterator();
    }

    private final void a() {
        while (this.a.hasNext()) {
            T next = this.a.next();
            if (((Boolean) this.d.c.invoke(next)).booleanValue() == this.d.b) {
                this.c = next;
                this.b = 1;
                return;
            }
        }
        this.b = 0;
    }

    public boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    public T next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            T t = this.c;
            this.c = null;
            this.b = -1;
            return t;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
