package defpackage;

/* renamed from: fS reason: default package and case insensitive filesystem */
/* compiled from: StrongValuesCache */
class C3002fS<K, V> extends C2964dS<K, V> {
    private final Z<K, V> a;

    C3002fS(int i) {
        this.a = new Z<>(i);
    }

    public C2964dS<K, V> a(K k, V v) {
        this.a.put(k, v);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public V a(K k) {
        return this.a.get(k);
    }

    public V a(K k, a<K, V> aVar) {
        V v = this.a.get(k);
        if (v != null) {
            return v;
        }
        try {
            V v2 = aVar.get(k);
            a(k, v2);
            return v2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
