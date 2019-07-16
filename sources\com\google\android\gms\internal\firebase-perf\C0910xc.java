package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.xc reason: case insensitive filesystem */
final class C0910xc extends Dc {
    private final /* synthetic */ C0906wc b;

    private C0910xc(C0906wc wcVar) {
        this.b = wcVar;
        super(wcVar, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C0914yc(this.b, null);
    }

    /* synthetic */ C0910xc(C0906wc wcVar, C0902vc vcVar) {
        this(wcVar);
    }
}
