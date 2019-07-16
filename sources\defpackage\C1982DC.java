package defpackage;

import com.google.common.base.Equivalence;

/* 'enum' access flag removed */
/* renamed from: DC reason: default package and case insensitive filesystem */
/* compiled from: LocalCache */
class C1982DC extends r {
    C1982DC(String str, int i) {
        super(str, i, null);
    }

    /* access modifiers changed from: 0000 */
    public <K, V> y<K, V> a(p<K, V> pVar, C2138LC<K, V> lc, V v, int i) {
        return i == 1 ? new D(pVar.i, v, lc) : new H(pVar.i, v, lc, i);
    }

    /* access modifiers changed from: 0000 */
    public Equivalence<Object> a() {
        return Equivalence.identity();
    }
}
