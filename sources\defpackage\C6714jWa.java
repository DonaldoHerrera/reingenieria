package defpackage;

import java.util.Iterator;

/* renamed from: jWa reason: default package and case insensitive filesystem */
/* compiled from: Iterators.kt */
public abstract class C6714jWa implements Iterator<Character>, MYa {
    public abstract char a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Character next() {
        return Character.valueOf(a());
    }
}
