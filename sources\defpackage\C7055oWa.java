package defpackage;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: oWa reason: default package and case insensitive filesystem */
/* compiled from: IteratorsJVM.kt */
public final class C7055oWa implements Iterator<T>, MYa {
    final /* synthetic */ Enumeration a;

    C7055oWa(Enumeration<T> enumeration) {
        this.a = enumeration;
    }

    public boolean hasNext() {
        return this.a.hasMoreElements();
    }

    public T next() {
        return this.a.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
