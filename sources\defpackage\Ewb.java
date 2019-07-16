package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Ewb reason: default package */
/* compiled from: Sequences.kt */
public final class Ewb implements Iterator<E>, MYa {
    private final Iterator<T> a;
    private Iterator<? extends E> b;
    final /* synthetic */ Fwb c;

    Ewb(Fwb fwb) {
        this.c = fwb;
        this.a = fwb.a.iterator();
    }

    private final boolean a() {
        Iterator<? extends E> it = this.b;
        if (it != null && !it.hasNext()) {
            this.b = null;
        }
        while (true) {
            if (this.b == null) {
                if (this.a.hasNext()) {
                    Iterator<? extends E> it2 = (Iterator) this.c.c.invoke(this.c.b.invoke(this.a.next()));
                    if (it2.hasNext()) {
                        this.b = it2;
                        break;
                    }
                } else {
                    return false;
                }
            } else {
                break;
            }
        }
        return true;
    }

    public boolean hasNext() {
        return a();
    }

    public E next() {
        if (a()) {
            Iterator<? extends E> it = this.b;
            if (it != null) {
                return it.next();
            }
            C7471uYa.a();
            throw null;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
