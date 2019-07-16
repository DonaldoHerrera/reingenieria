package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.hb reason: case insensitive filesystem */
final class C0759hb extends C0777nb {
    private final /* synthetic */ C0750eb b;

    private C0759hb(C0750eb ebVar) {
        this.b = ebVar;
        super(ebVar, null);
    }

    /* synthetic */ C0759hb(C0750eb ebVar, C0753fb fbVar) {
        this(ebVar);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C0756gb(this.b, null);
    }
}
