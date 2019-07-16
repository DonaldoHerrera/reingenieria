package defpackage;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: FI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionManager_Factory */
public final class C2028FI implements C4961HMa<C1988DI> {
    private final C7054oVa<C3193pJ> a;
    private final C7054oVa<C2068HI> b;
    private final C7054oVa<C3469VY> c;
    private final C7054oVa<C3700b> d;
    private final C7054oVa<HPa> e;
    private final C7054oVa<HPa> f;

    public C2028FI(C7054oVa<C3193pJ> ova, C7054oVa<C2068HI> ova2, C7054oVa<C3469VY> ova3, C7054oVa<C3700b> ova4, C7054oVa<HPa> ova5, C7054oVa<HPa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C2028FI a(C7054oVa<C3193pJ> ova, C7054oVa<C2068HI> ova2, C7054oVa<C3469VY> ova3, C7054oVa<C3700b> ova4, C7054oVa<HPa> ova5, C7054oVa<HPa> ova6) {
        C2028FI fi = new C2028FI(ova, ova2, ova3, ova4, ova5, ova6);
        return fi;
    }

    public C1988DI get() {
        C1988DI di = new C1988DI((C3193pJ) this.a.get(), (C2068HI) this.b.get(), (C3469VY) this.c.get(), (C3700b) this.d.get(), (HPa) this.e.get(), (HPa) this.f.get());
        return di;
    }
}
