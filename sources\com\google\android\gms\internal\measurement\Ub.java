package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class Ub<K> implements Entry<K, Object> {
    private Entry<K, Sb> a;

    private Ub(Entry<K, Sb> entry) {
        this.a = entry;
    }

    public final Sb a() {
        return (Sb) this.a.getValue();
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((Sb) this.a.getValue()) == null) {
            return null;
        }
        Sb.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C1026qc) {
            return ((Sb) this.a.getValue()).a((C1026qc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
