package defpackage;

/* 'enum' access flag removed */
/* renamed from: xC reason: default package and case insensitive filesystem */
/* compiled from: LocalCache */
class C3345xC extends C3161d {
    C3345xC(String str, int i) {
        super(str, i, null);
    }

    /* access modifiers changed from: 0000 */
    public <K, V> C2138LC<K, V> a(p<K, V> pVar, K k, int i, C2138LC<K, V> lc) {
        return new E(pVar.h, k, i, lc);
    }

    /* access modifiers changed from: 0000 */
    public <K, V> C2138LC<K, V> a(p<K, V> pVar, C2138LC<K, V> lc, C2138LC<K, V> lc2) {
        C2138LC<K, V> a = super.a(pVar, lc, lc2);
        b(lc, a);
        return a;
    }
}
