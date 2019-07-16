package com.soundcloud.android.collection;

import android.content.res.Resources;
import com.soundcloud.android.image.N;

/* compiled from: CollectionPreviewRenderer_Factory */
public final class xa implements C4961HMa<wa> {
    private final C7054oVa<C4581ija> a;
    private final C7054oVa<C4655rja> b;
    private final C7054oVa<Resources> c;
    private final C7054oVa<N> d;
    private final C7054oVa<C2014EO> e;

    public static wa a(C4581ija ija, C4655rja rja, Resources resources, N n, C2014EO eo) {
        wa waVar = new wa(ija, rja, resources, n, eo);
        return waVar;
    }

    public wa get() {
        wa waVar = new wa((C4581ija) this.a.get(), (C4655rja) this.b.get(), (Resources) this.c.get(), (N) this.d.get(), (C2014EO) this.e.get());
        return waVar;
    }
}
