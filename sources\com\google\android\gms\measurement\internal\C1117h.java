package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.h reason: case insensitive filesystem */
final class C1117h implements Iterator<String> {
    private Iterator<String> a = this.b.a.keySet().iterator();
    private final /* synthetic */ zzah b;

    C1117h(zzah zzah) {
        this.b = zzah;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
