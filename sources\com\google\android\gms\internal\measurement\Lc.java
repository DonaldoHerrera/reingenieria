package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class Lc extends Rc {
    private final /* synthetic */ Kc b;

    private Lc(Kc kc) {
        this.b = kc;
        super(kc, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new Mc(this.b, null);
    }

    /* synthetic */ Lc(Kc kc, Jc jc) {
        this(kc);
    }
}
