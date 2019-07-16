package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class Sc implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ Kc d;

    private Sc(Kc kc) {
        this.d = kc;
        this.a = -1;
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        if (this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.b.size()) {
            return (Entry) this.d.b.get(this.a);
        }
        return (Entry) a().next();
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.f();
            if (this.a < this.d.b.size()) {
                Kc kc = this.d;
                int i = this.a;
                this.a = i - 1;
                kc.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ Sc(Kc kc, Jc jc) {
        this(kc);
    }
}
