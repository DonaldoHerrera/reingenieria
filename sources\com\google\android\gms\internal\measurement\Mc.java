package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class Mc implements Iterator<Entry<K, V>> {
    private int a;
    private Iterator<Entry<K, V>> b;
    private final /* synthetic */ Kc c;

    private Mc(Kc kc) {
        this.c = kc;
        this.a = this.c.b.size();
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.b.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Entry) a().next();
        }
        List b2 = this.c.b;
        int i = this.a - 1;
        this.a = i;
        return (Entry) b2.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ Mc(Kc kc, Jc jc) {
        this(kc);
    }
}
