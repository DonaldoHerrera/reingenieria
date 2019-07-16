package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;

final class Rc implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ Pc b;

    Rc(Pc pc) {
        this.b = pc;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
