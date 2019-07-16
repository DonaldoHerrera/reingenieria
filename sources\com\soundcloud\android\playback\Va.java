package com.soundcloud.android.playback;

import android.content.res.Resources;

/* compiled from: PlayPublisher_Factory */
public final class Va implements C4961HMa<Pa> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<C3856qea> b;
    private final C7054oVa<C5694cGa> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<efa> e;

    public Va(C7054oVa<Resources> ova, C7054oVa<C3856qea> ova2, C7054oVa<C5694cGa> ova3, C7054oVa<HPa> ova4, C7054oVa<efa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Va a(C7054oVa<Resources> ova, C7054oVa<C3856qea> ova2, C7054oVa<C5694cGa> ova3, C7054oVa<HPa> ova4, C7054oVa<efa> ova5) {
        Va va = new Va(ova, ova2, ova3, ova4, ova5);
        return va;
    }

    public Pa get() {
        Pa pa = new Pa((Resources) this.a.get(), (C3856qea) this.b.get(), (C5694cGa) this.c.get(), (HPa) this.d.get(), (efa) this.e.get());
        return pa;
    }
}
