package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Fa<K, V> extends LinkedHashMap<K, V> {
    private static final Fa a;
    private boolean b = true;

    static {
        Fa fa = new Fa();
        a = fa;
        fa.b = false;
    }

    private Fa() {
    }

    private Fa(Map<K, V> map) {
        super(map);
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C0761ia.a((byte[]) obj);
        }
        if (!(obj instanceof C0764ja)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> Fa<K, V> j() {
        return a;
    }

    private final void m() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(Fa<K, V> fa) {
        m();
        if (!fa.isEmpty()) {
            putAll(fa);
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

    public final Fa<K, V> k() {
        return isEmpty() ? new Fa<>() : new Fa<>(this);
    }

    public final void l() {
        this.b = false;
    }

    public final V put(K k, V v) {
        m();
        C0761ia.a(k);
        C0761ia.a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (Object next : map.keySet()) {
            C0761ia.a(next);
            C0761ia.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m();
        return super.remove(obj);
    }
}
