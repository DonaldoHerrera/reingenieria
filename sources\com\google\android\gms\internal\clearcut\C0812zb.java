package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.zb reason: case insensitive filesystem */
final class C0812zb implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ C0806xb b;

    C0812zb(C0806xb xbVar) {
        this.b = xbVar;
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
