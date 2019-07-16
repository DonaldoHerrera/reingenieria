package com.soundcloud.android.ads;

import android.content.res.Resources;

/* compiled from: VideoAdItemRenderer_Factory */
public final class jd implements C4961HMa<id> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<Ga> c;
    private final C7054oVa<C5694cGa> d;

    public static id a(Resources resources, C5327TLa tLa, Object obj, C5694cGa cga) {
        return new id(resources, tLa, (Ga) obj, cga);
    }

    public id get() {
        return new id((Resources) this.a.get(), (C5327TLa) this.b.get(), (Ga) this.c.get(), (C5694cGa) this.d.get());
    }
}
