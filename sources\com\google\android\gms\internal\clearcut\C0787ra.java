package com.google.android.gms.internal.clearcut;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.ra reason: case insensitive filesystem */
final class C0787ra<K> implements Entry<K, Object> {
    private Entry<K, C0782pa> a;

    private C0787ra(Entry<K, C0782pa> entry) {
        this.a = entry;
    }

    public final C0782pa a() {
        return (C0782pa) this.a.getValue();
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((C0782pa) this.a.getValue()) == null) {
            return null;
        }
        C0782pa.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof La) {
            return ((C0782pa) this.a.getValue()).a((La) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
