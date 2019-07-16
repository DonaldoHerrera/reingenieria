package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.Map.Entry;

final class Fc implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ C0906wc d;

    private Fc(C0906wc wcVar) {
        this.d = wcVar;
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
                C0906wc wcVar = this.d;
                int i = this.a;
                this.a = i - 1;
                wcVar.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ Fc(C0906wc wcVar, C0902vc vcVar) {
        this(wcVar);
    }
}
