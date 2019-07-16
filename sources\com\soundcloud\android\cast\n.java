package com.soundcloud.android.cast;

import android.content.Context;

/* compiled from: CastModule_ProvideCastContextFactory */
public final class n implements C4961HMa<C2733g> {
    private final C7054oVa<C7730yHa> a;
    private final C7054oVa<Context> b;

    public n(C7054oVa<C7730yHa> ova, C7054oVa<Context> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static n a(C7054oVa<C7730yHa> ova, C7054oVa<Context> ova2) {
        return new n(ova, ova2);
    }

    public static C2733g a(C7730yHa yha, Context context) {
        C2733g a2 = l.a(yha, context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2733g get() {
        return a((C7730yHa) this.a.get(), (Context) this.b.get());
    }
}
