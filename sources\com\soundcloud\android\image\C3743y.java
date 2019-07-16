package com.soundcloud.android.image;

import com.squareup.picasso.E;

/* renamed from: com.soundcloud.android.image.y reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvidePicassoImageLoaderFactory */
public final class C3743y implements C4961HMa<oa> {
    private final C7054oVa<C3737s> a;
    private final C7054oVa<E> b;
    private final C7054oVa<qa> c;
    private final C7054oVa<C3724e> d;
    private final C7054oVa<C3469VY> e;

    public C3743y(C7054oVa<C3737s> ova, C7054oVa<E> ova2, C7054oVa<qa> ova3, C7054oVa<C3724e> ova4, C7054oVa<C3469VY> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C3743y a(C7054oVa<C3737s> ova, C7054oVa<E> ova2, C7054oVa<qa> ova3, C7054oVa<C3724e> ova4, C7054oVa<C3469VY> ova5) {
        C3743y yVar = new C3743y(ova, ova2, ova3, ova4, ova5);
        return yVar;
    }

    public static oa a(C3737s sVar, E e2, qa qaVar, C3724e eVar, C3469VY vy) {
        oa a2 = C3738t.a(sVar, e2, qaVar, eVar, vy);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public oa get() {
        return a((C3737s) this.a.get(), (E) this.b.get(), (qa) this.c.get(), (C3724e) this.d.get(), (C3469VY) this.e.get());
    }
}
