package defpackage;

import android.content.Context;

/* renamed from: YM reason: default package and case insensitive filesystem */
/* compiled from: AppboyAnalyticsProvider_Factory */
public final class C2391YM implements C4961HMa<C2373XM> {
    private final C7054oVa<C1956BQ> a;
    private final C7054oVa<C2448aN> b;
    private final C7054oVa<Ica> c;
    private final C7054oVa<Context> d;

    public C2391YM(C7054oVa<C1956BQ> ova, C7054oVa<C2448aN> ova2, C7054oVa<Ica> ova3, C7054oVa<Context> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C2391YM a(C7054oVa<C1956BQ> ova, C7054oVa<C2448aN> ova2, C7054oVa<Ica> ova3, C7054oVa<Context> ova4) {
        return new C2391YM(ova, ova2, ova3, ova4);
    }

    public C2373XM get() {
        return new C2373XM((C1956BQ) this.a.get(), (C2448aN) this.b.get(), (Ica) this.c.get(), (Context) this.d.get());
    }
}
