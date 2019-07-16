package com.soundcloud.android.fcm;

import android.content.Context;
import com.soundcloud.android.properties.a;

/* compiled from: RemoteFeaturesRefreshListener_Factory */
public final class C implements C4961HMa<z> {
    private final C7054oVa<C5052KJa> a;
    private final C7054oVa<Context> b;
    private final C7054oVa<C4581ija> c;
    private final C7054oVa<a> d;

    public C(C7054oVa<C5052KJa> ova, C7054oVa<Context> ova2, C7054oVa<C4581ija> ova3, C7054oVa<a> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C a(C7054oVa<C5052KJa> ova, C7054oVa<Context> ova2, C7054oVa<C4581ija> ova3, C7054oVa<a> ova4) {
        return new C(ova, ova2, ova3, ova4);
    }

    public z get() {
        return new z((C5052KJa) this.a.get(), (Context) this.b.get(), (C4581ija) this.c.get(), (a) this.d.get());
    }
}
