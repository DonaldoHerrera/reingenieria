package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.sa reason: case insensitive filesystem */
final class C0790sa<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public C0790sa(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof C0782pa ? new C0787ra(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
