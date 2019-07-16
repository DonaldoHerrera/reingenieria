package com.soundcloud.android;

import android.content.Context;
import com.soundcloud.android.image.C3730k;
import com.soundcloud.android.image.C3737s;

/* compiled from: ImageConfigModule_ProvideImageLoaderConfigFactory */
public final class ha implements C4961HMa<C3737s> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C6699jHa> b;
    private final C7054oVa<C3730k> c;

    public ha(C7054oVa<Context> ova, C7054oVa<C6699jHa> ova2, C7054oVa<C3730k> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static ha a(C7054oVa<Context> ova, C7054oVa<C6699jHa> ova2, C7054oVa<C3730k> ova3) {
        return new ha(ova, ova2, ova3);
    }

    public static C3737s a(Context context, C6699jHa jha, C3730k kVar) {
        C3737s a2 = ga.a(context, jha, kVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3737s get() {
        return a((Context) this.a.get(), (C6699jHa) this.b.get(), (C3730k) this.c.get());
    }
}
