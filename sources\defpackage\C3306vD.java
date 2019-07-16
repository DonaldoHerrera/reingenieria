package defpackage;

import java.io.Serializable;

/* renamed from: vD reason: default package and case insensitive filesystem */
/* compiled from: ImmutableEntry */
class C3306vD<K, V> extends C2476cD<K, V> implements Serializable {
    final K a;
    final V b;

    C3306vD(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public final K getKey() {
        return this.a;
    }

    public final V getValue() {
        return this.b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
