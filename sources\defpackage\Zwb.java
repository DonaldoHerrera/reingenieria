package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Zwb reason: default package */
/* compiled from: Sequences.kt */
public final class Zwb implements Iterator<T>, MYa {
    private final Iterator<T> a;
    private int b = -1;
    private T c;
    final /* synthetic */ _wb d;

    Zwb(_wb _wb) {
        this.d = _wb;
        this.a = _wb.a.iterator();
    }

    private final void a() {
        if (this.a.hasNext()) {
            T next = this.a.next();
            if (((Boolean) this.d.b.invoke(next)).booleanValue()) {
                this.b = 1;
                this.c = next;
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
