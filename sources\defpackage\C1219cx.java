package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: cx reason: default package and case insensitive filesystem */
public final class C1219cx<K, V> extends LinkedHashMap<K, V> {
    private static final C1219cx a;
    private boolean b = true;

    static {
        C1219cx cxVar = new C1219cx();
        a = cxVar;
        cxVar.b = false;
    }

    private C1219cx() {
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C0209Gw.a((byte[]) obj);
        }
        if (!(obj instanceof C0206Fw)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> C1219cx<K, V> k() {
        return a;
    }

    private final void m() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(C1219cx<K, V> cxVar) {
        m();
        if (!cxVar.isEmpty()) {
            putAll(cxVar);
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

    public final C1219cx<K, V> l() {
        return isEmpty() ? new C1219cx<>() : new C1219cx<>(this);
    }

    public final V put(K k, V v) {
        m();
        C0209Gw.a(k);
        C0209Gw.a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (Object next : map.keySet()) {
            C0209Gw.a(next);
            C0209Gw.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private C1219cx(Map<K, V> map) {
        super(map);
    }
}
