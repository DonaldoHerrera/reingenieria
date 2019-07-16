package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.yc reason: case insensitive filesystem */
final class C0914yc implements Iterator<Entry<K, V>> {
    private int a;
    private Iterator<Entry<K, V>> b;
    private final /* synthetic */ C0906wc c;

    private C0914yc(C0906wc wcVar) {
        this.c = wcVar;
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

    /* synthetic */ C0914yc(C0906wc wcVar, C0902vc vcVar) {
        this(wcVar);
    }
}
