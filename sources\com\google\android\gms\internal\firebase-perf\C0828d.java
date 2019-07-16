package com.google.android.gms.internal.firebase-perf;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.d reason: case insensitive filesystem */
final class C0828d<K, V> extends Ad<Entry<K, V>> {
    private final transient yd<K, V> c;
    /* access modifiers changed from: private */
    public final transient Object[] d;
    private final transient int e = 0;
    /* access modifiers changed from: private */
    public final transient int f;

    C0828d(yd<K, V> ydVar, Object[] objArr, int i, int i2) {
        this.c = ydVar;
        this.d = objArr;
        this.f = i2;
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        return h().a(objArr, i);
    }

    /* renamed from: c */
    public final C0840g<Entry<K, V>> iterator() {
        return (C0840g) h().iterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final ud<Entry<K, V>> i() {
        return new C0823c(this);
    }

    public final int size() {
        return this.f;
    }
}
