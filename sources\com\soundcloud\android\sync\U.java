package com.soundcloud.android.sync;

import com.soundcloud.android.accounts.C2529j;

/* compiled from: SyncInitiator_Factory */
public final class U implements C4961HMa<T> {
    private final C7054oVa<C2529j> a;
    private final C7054oVa<K> b;
    private final C7054oVa<HPa> c;

    public U(C7054oVa<C2529j> ova, C7054oVa<K> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static U a(C7054oVa<C2529j> ova, C7054oVa<K> ova2, C7054oVa<HPa> ova3) {
        return new U(ova, ova2, ova3);
    }

    public T get() {
        return new T((C2529j) this.a.get(), C4930GMa.a(this.b), (HPa) this.c.get());
    }
}
