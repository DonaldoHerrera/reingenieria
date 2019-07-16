package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.Map.Entry;

final class Kb<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public Kb(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof Fb ? new Hb(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
