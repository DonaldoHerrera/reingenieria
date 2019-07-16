package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.Set;

public abstract class Ad<E> extends td<E> implements Set<E> {
    private transient ud<E> b;

    Ad() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C0844h.a(this, obj);
    }

    public ud<E> h() {
        ud<E> udVar = this.b;
        if (udVar != null) {
            return udVar;
        }
        ud<E> i = i();
        this.b = i;
        return i;
    }

    public int hashCode() {
        return C0844h.a(this);
    }

    /* access modifiers changed from: 0000 */
    public ud<E> i() {
        return ud.a(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
