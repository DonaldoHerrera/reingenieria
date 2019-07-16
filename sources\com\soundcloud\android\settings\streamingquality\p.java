package com.soundcloud.android.settings.streamingquality;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: StreamingQualitySettingsPresenter_Factory */
public final class p implements C4961HMa<i> {
    private final C7054oVa<Context> a;
    private final C7054oVa<e> b;
    private final C7054oVa<C2436_U> c;
    private final C7054oVa<C3469VY> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<C5327TLa> f;
    private final C7054oVa<C3700b> g;
    private final C7054oVa<C5606ava> h;
    private final C7054oVa<HPa> i;

    public p(C7054oVa<Context> ova, C7054oVa<e> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C3469VY> ova4, C7054oVa<C4655rja> ova5, C7054oVa<C5327TLa> ova6, C7054oVa<C3700b> ova7, C7054oVa<C5606ava> ova8, C7054oVa<HPa> ova9) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
    }

    public static p a(C7054oVa<Context> ova, C7054oVa<e> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C3469VY> ova4, C7054oVa<C4655rja> ova5, C7054oVa<C5327TLa> ova6, C7054oVa<C3700b> ova7, C7054oVa<C5606ava> ova8, C7054oVa<HPa> ova9) {
        p pVar = new p(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return pVar;
    }

    public i get() {
        i iVar = new i((Context) this.a.get(), (e) this.b.get(), (C2436_U) this.c.get(), (C3469VY) this.d.get(), (C4655rja) this.e.get(), (C5327TLa) this.f.get(), (C3700b) this.g.get(), (C5606ava) this.h.get(), (HPa) this.i.get());
        return iVar;
    }
}
