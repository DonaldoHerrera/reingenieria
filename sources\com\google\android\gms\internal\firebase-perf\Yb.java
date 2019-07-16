package com.google.android.gms.internal.firebase-perf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Yb<K, V> extends LinkedHashMap<K, V> {
    private static final Yb a;
    private boolean b = true;

    static {
        Yb yb = new Yb();
        a = yb;
        yb.b = false;
    }

    private Yb() {
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C0897ub.a((byte[]) obj);
        }
        if (!(obj instanceof C0909xb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> Yb<K, V> k() {
        return a;
    }

    private final void l() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(Yb<K, V> yb) {
        l();
        if (!yb.isEmpty()) {
            putAll(yb);
        }
    }

    public final void clear() {
        l();
        super.clear();
    }

    public final Yb<K, V> e() {
        return isEmpty() ? new Yb<>() : new Yb<>(this);
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

    public final V put(K k, V v) {
        l();
        C0897ub.a(k);
        C0897ub.a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        l();
        for (Object next : map.keySet()) {
            C0897ub.a(next);
            C0897ub.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private Yb(Map<K, V> map) {
        super(map);
    }
}
