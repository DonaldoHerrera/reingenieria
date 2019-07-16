package com.google.android.gms.internal.firebase-perf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class Dc extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ C0906wc a;

    private Dc(C0906wc wcVar) {
        this.a = wcVar;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new Fc(this.a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.a.size();
    }

    /* synthetic */ Dc(C0906wc wcVar, C0902vc vcVar) {
        this(wcVar);
    }
}
