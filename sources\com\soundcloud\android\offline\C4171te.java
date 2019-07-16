package com.soundcloud.android.offline;

import android.content.Context;

/* renamed from: com.soundcloud.android.offline.te reason: case insensitive filesystem */
/* compiled from: SecureFileStorage_Factory */
public final class C4171te implements C4961HMa<C4165se> {
    private final C7054oVa<C3284tV> a;
    private final C7054oVa<C4088fe> b;
    private final C7054oVa<Context> c;
    private final C7054oVa<C3469VY> d;

    public C4171te(C7054oVa<C3284tV> ova, C7054oVa<C4088fe> ova2, C7054oVa<Context> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4171te a(C7054oVa<C3284tV> ova, C7054oVa<C4088fe> ova2, C7054oVa<Context> ova3, C7054oVa<C3469VY> ova4) {
        return new C4171te(ova, ova2, ova3, ova4);
    }

    public C4165se get() {
        return new C4165se((C3284tV) this.a.get(), (C4088fe) this.b.get(), (Context) this.c.get(), (C3469VY) this.d.get());
    }
}
