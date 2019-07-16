package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class Xb<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public Xb(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof Sb ? new Ub(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
