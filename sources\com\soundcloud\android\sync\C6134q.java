package com.soundcloud.android.sync;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: com.soundcloud.android.sync.q reason: case insensitive filesystem */
/* compiled from: BackgroundSyncerFactory_Factory */
public final class C6134q implements C4961HMa<C6133p> {
    private final C7054oVa<C2526g> a;
    private final C7054oVa<la> b;
    private final C7054oVa<oa> c;
    private final C7054oVa<K> d;

    public C6134q(C7054oVa<C2526g> ova, C7054oVa<la> ova2, C7054oVa<oa> ova3, C7054oVa<K> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C6134q a(C7054oVa<C2526g> ova, C7054oVa<la> ova2, C7054oVa<oa> ova3, C7054oVa<K> ova4) {
        return new C6134q(ova, ova2, ova3, ova4);
    }

    public C6133p get() {
        return new C6133p(this.a, this.b, this.c, C5055KMa.a(this.d));
    }
}
