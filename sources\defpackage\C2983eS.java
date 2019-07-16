package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: eS reason: default package and case insensitive filesystem */
/* compiled from: SoftValuesCache */
class C2983eS<K, V> extends C2964dS<K, V> {
    private final C3002fS<K, SoftReference<V>> a;

    C2983eS(int i) {
        this.a = new C3002fS<>(i);
    }

    public C2964dS<K, V> a(K k, V v) {
        this.a.a(k, new SoftReference(v));
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public V a(K k) {
        SoftReference softReference = (SoftReference) this.a.a(k);
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public V a(K k, a<K, V> aVar) {
        V a2 = a(k);
        if (a2 != null) {
            return a2;
        }
        try {
            V v = aVar.get(k);
            a(k, v);
            return v;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
