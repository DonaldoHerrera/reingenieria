package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: AWa reason: default package */
/* compiled from: Maps.kt */
final class AWa implements Map, Serializable, MYa {
    public static final AWa a = new AWa();

    private AWa() {
    }

    private final Object readResolve() {
        return a;
    }

    public Set<Entry> a() {
        return BWa.a;
    }

    public boolean a(Void voidR) {
        C7471uYa.b(voidR, "value");
        return false;
    }

    public Set<Object> b() {
        return BWa.a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public int e() {
        return 0;
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Collection f() {
        return C7814zWa.a;
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return b();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
