package com.google.android.gms.internal.firebase-perf;

import java.util.Map.Entry;

final class Hb<K> implements Entry<K, Object> {
    private Entry<K, Fb> a;

    private Hb(Entry<K, Fb> entry) {
        this.a = entry;
    }

    public final Fb a() {
        return (Fb) this.a.getValue();
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((Fb) this.a.getValue()) == null) {
            return null;
        }
        Fb.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C0835ec) {
            return ((Fb) this.a.getValue()).a((C0835ec) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
