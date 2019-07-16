package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.mb reason: case insensitive filesystem */
final class C0774mb implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ C0750eb d;

    private C0774mb(C0750eb ebVar) {
        this.d = ebVar;
        this.a = -1;
    }

    /* synthetic */ C0774mb(C0750eb ebVar, C0753fb fbVar) {
        this(ebVar);
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        return (Entry) (i < this.d.b.size() ? this.d.b.get(this.a) : a().next());
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.f();
            if (this.a < this.d.b.size()) {
                C0750eb ebVar = this.d;
                int i = this.a;
                this.a = i - 1;
                ebVar.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
