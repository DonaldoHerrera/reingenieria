package com.soundcloud.android.sync;

/* compiled from: SyncController_Factory */
public final class S implements C4961HMa<K> {
    private final C7054oVa<ga> a;
    private final C7054oVa<la> b;
    private final C7054oVa<C3218qP> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<HPa> e;

    public S(C7054oVa<ga> ova, C7054oVa<la> ova2, C7054oVa<C3218qP> ova3, C7054oVa<HPa> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static S a(C7054oVa<ga> ova, C7054oVa<la> ova2, C7054oVa<C3218qP> ova3, C7054oVa<HPa> ova4, C7054oVa<HPa> ova5) {
        S s = new S(ova, ova2, ova3, ova4, ova5);
        return s;
    }

    public K get() {
        K k = new K((ga) this.a.get(), C4930GMa.a(this.b), (C3218qP) this.c.get(), (HPa) this.d.get(), (HPa) this.e.get());
        return k;
    }
}
