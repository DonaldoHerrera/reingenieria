package com.soundcloud.android.settings.offline;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.settings.C5988u;
import com.soundcloud.android.settings.streamingquality.e;

/* compiled from: OfflineSettingsPresenter_Factory */
public final class G implements C4961HMa<n> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C5988u> b;
    private final C7054oVa<C4088fe> c;
    private final C7054oVa<C4197yd> d;
    private final C7054oVa<C3815lda> e;
    private final C7054oVa<C5606ava> f;
    private final C7054oVa<C2436_U> g;
    private final C7054oVa<C3469VY> h;
    private final C7054oVa<j> i;
    private final C7054oVa<C3700b> j;
    private final C7054oVa<C4655rja> k;
    private final C7054oVa<e> l;
    private final C7054oVa<HPa> m;

    public G(C7054oVa<Context> ova, C7054oVa<C5988u> ova2, C7054oVa<C4088fe> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C3815lda> ova5, C7054oVa<C5606ava> ova6, C7054oVa<C2436_U> ova7, C7054oVa<C3469VY> ova8, C7054oVa<j> ova9, C7054oVa<C3700b> ova10, C7054oVa<C4655rja> ova11, C7054oVa<e> ova12, C7054oVa<HPa> ova13) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
        this.l = ova12;
        this.m = ova13;
    }

    public static G a(C7054oVa<Context> ova, C7054oVa<C5988u> ova2, C7054oVa<C4088fe> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C3815lda> ova5, C7054oVa<C5606ava> ova6, C7054oVa<C2436_U> ova7, C7054oVa<C3469VY> ova8, C7054oVa<j> ova9, C7054oVa<C3700b> ova10, C7054oVa<C4655rja> ova11, C7054oVa<e> ova12, C7054oVa<HPa> ova13) {
        G g2 = new G(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13);
        return g2;
    }

    public n get() {
        n nVar = new n((Context) this.a.get(), (C5988u) this.b.get(), (C4088fe) this.c.get(), (C4197yd) this.d.get(), (C3815lda) this.e.get(), (C5606ava) this.f.get(), (C2436_U) this.g.get(), (C3469VY) this.h.get(), (j) this.i.get(), (C3700b) this.j.get(), (C4655rja) this.k.get(), (e) this.l.get(), (HPa) this.m.get());
        return nVar;
    }
}
