package com.soundcloud.android.cast;

import android.content.Context;

/* compiled from: CastModule_ProvideCastConnectionHelperFactory */
public final class m implements C4961HMa<C2732f> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C2733g> b;
    private final C7054oVa<C7730yHa> c;

    public m(C7054oVa<Context> ova, C7054oVa<C2733g> ova2, C7054oVa<C7730yHa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static m a(C7054oVa<Context> ova, C7054oVa<C2733g> ova2, C7054oVa<C7730yHa> ova3) {
        return new m(ova, ova2, ova3);
    }

    public static C2732f a(Context context, C4806CMa<C2733g> cMa, C7730yHa yha) {
        C2732f a2 = l.a(context, cMa, yha);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2732f get() {
        return a((Context) this.a.get(), C4930GMa.a(this.b), (C7730yHa) this.c.get());
    }
}
