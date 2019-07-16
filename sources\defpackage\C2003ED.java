package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ED reason: default package and case insensitive filesystem */
/* compiled from: Iterators */
class C2003ED extends C2988fE<T> {
    boolean a;
    final /* synthetic */ Object b;

    C2003ED(Object obj) {
        this.b = obj;
    }

    public boolean hasNext() {
        return !this.a;
    }

    public T next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
