package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: KL reason: default package and case insensitive filesystem */
/* compiled from: DefaultAnalytics_Factory */
public final class C2128KL implements C4961HMa<C2031FL> {
    private final C7054oVa<C2350WH<J>> a;
    private final C7054oVa<C2168MN> b;
    private final C7054oVa<C3315vM> c;

    public C2128KL(C7054oVa<C2350WH<J>> ova, C7054oVa<C2168MN> ova2, C7054oVa<C3315vM> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2128KL a(C7054oVa<C2350WH<J>> ova, C7054oVa<C2168MN> ova2, C7054oVa<C3315vM> ova3) {
        return new C2128KL(ova, ova2, ova3);
    }

    public C2031FL get() {
        return new C2031FL((C2350WH) this.a.get(), (C2168MN) this.b.get(), (C3315vM) this.c.get());
    }
}
