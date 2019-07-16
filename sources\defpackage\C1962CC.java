package defpackage;

import com.google.common.base.Equivalence;

/* 'enum' access flag removed */
/* renamed from: CC reason: default package and case insensitive filesystem */
/* compiled from: LocalCache */
class C1962CC extends r {
    C1962CC(String str, int i) {
        super(str, i, null);
    }

    /* access modifiers changed from: 0000 */
    public <K, V> y<K, V> a(p<K, V> pVar, C2138LC<K, V> lc, V v, int i) {
        return i == 1 ? new q(pVar.i, v, lc) : new F(pVar.i, v, lc, i);
    }

    /* access modifiers changed from: 0000 */
    public Equivalence<Object> a() {
        return Equivalence.identity();
    }
}
