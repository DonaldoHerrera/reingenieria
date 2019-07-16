package com.soundcloud.android;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.properties.j;

/* compiled from: ApplicationModule_ProvideFeatureOperationsFactory */
public final class D implements C4961HMa<C2436_U> {
    private final C2933l a;
    private final C7054oVa<C2380XU> b;
    private final C7054oVa<C1960BU> c;
    private final C7054oVa<j> d;
    private final C7054oVa<C3700b> e;

    public D(C2933l lVar, C7054oVa<C2380XU> ova, C7054oVa<C1960BU> ova2, C7054oVa<j> ova3, C7054oVa<C3700b> ova4) {
        this.a = lVar;
        this.b = ova;
        this.c = ova2;
        this.d = ova3;
        this.e = ova4;
    }

    public static D a(C2933l lVar, C7054oVa<C2380XU> ova, C7054oVa<C1960BU> ova2, C7054oVa<j> ova3, C7054oVa<C3700b> ova4) {
        D d2 = new D(lVar, ova, ova2, ova3, ova4);
        return d2;
    }

    public static C2436_U a(C2933l lVar, C2380XU xu, C1960BU bu, j jVar, C3700b bVar) {
        C2436_U a2 = lVar.a(xu, bu, jVar, bVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2436_U get() {
        return a(this.a, (C2380XU) this.b.get(), (C1960BU) this.c.get(), (j) this.d.get(), (C3700b) this.e.get());
    }
}
