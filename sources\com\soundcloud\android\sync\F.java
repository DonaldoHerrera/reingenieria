package com.soundcloud.android.sync;

import android.content.Context;

/* compiled from: SyncAdapter_Factory */
public final class F implements C4961HMa<D> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C6133p> b;
    private final C7054oVa<C6130m> c;

    public F(C7054oVa<Context> ova, C7054oVa<C6133p> ova2, C7054oVa<C6130m> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static F a(C7054oVa<Context> ova, C7054oVa<C6133p> ova2, C7054oVa<C6130m> ova3) {
        return new F(ova, ova2, ova3);
    }

    public D get() {
        return new D((Context) this.a.get(), (C6133p) this.b.get(), (C6130m) this.c.get());
    }
}
