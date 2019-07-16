package com.soundcloud.android.offline;

import android.content.Context;

/* compiled from: OfflineContentRetryJob_Factory */
public final class Dd implements C4961HMa<Cd> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C5694cGa> b;
    private final C7054oVa<Lb> c;

    public Dd(C7054oVa<Context> ova, C7054oVa<C5694cGa> ova2, C7054oVa<Lb> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Dd a(C7054oVa<Context> ova, C7054oVa<C5694cGa> ova2, C7054oVa<Lb> ova3) {
        return new Dd(ova, ova2, ova3);
    }

    public Cd get() {
        return new Cd((Context) this.a.get(), (C5694cGa) this.b.get(), (Lb) this.c.get());
    }
}
