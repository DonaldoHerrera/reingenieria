package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.dd reason: case insensitive filesystem */
final class C0944dd implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ C0930bd b;

    C0944dd(C0930bd bdVar) {
        this.b = bdVar;
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
