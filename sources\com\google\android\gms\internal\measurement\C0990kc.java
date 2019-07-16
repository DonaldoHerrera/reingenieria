package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.kc reason: case insensitive filesystem */
public final class C0990kc<K, V> extends LinkedHashMap<K, V> {
    private static final C0990kc a;
    private boolean b = true;

    static {
        C0990kc kcVar = new C0990kc();
        a = kcVar;
        kcVar.b = false;
    }

    private C0990kc() {
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return Hb.a((byte[]) obj);
        }
        if (!(obj instanceof Lb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> C0990kc<K, V> k() {
        return a;
    }

    private final void m() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(C0990kc<K, V> kcVar) {
        m();
        if (!kcVar.isEmpty()) {
            putAll(kcVar);
        }
    }

    public final void clear() {
        m();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Entry entry = (Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                                z2 = value.equals(obj2);
                                continue;
                            } else {
                                z2 = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            }
                            if (!z2) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i;
    }

    public final boolean i() {
        return this.b;
    }

    public final void j() {
        this.b = false;
    }

    public final C0990kc<K, V> l() {
        return isEmpty() ? new C0990kc<>() : new C0990kc<>(this);
    }

    public final V put(K k, V v) {
        m();
        Hb.a(k);
        Hb.a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (Object next : map.keySet()) {
            Hb.a(next);
            Hb.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private C0990kc(Map<K, V> map) {
        super(map);
    }
}
