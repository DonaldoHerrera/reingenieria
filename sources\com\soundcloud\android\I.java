package com.soundcloud.android;

import com.soundcloud.android.tracks.Ca;

/* compiled from: ApplicationModule_ProvideLiveEntitiesFactory */
public final class I implements C4961HMa<C5604aua> {
    private final C7054oVa<Ca> a;
    private final C7054oVa<C4785Bra> b;
    private final C7054oVa<C5141NFa> c;
    private final C7054oVa<Vda> d;

    public I(C7054oVa<Ca> ova, C7054oVa<C4785Bra> ova2, C7054oVa<C5141NFa> ova3, C7054oVa<Vda> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static I a(C7054oVa<Ca> ova, C7054oVa<C4785Bra> ova2, C7054oVa<C5141NFa> ova3, C7054oVa<Vda> ova4) {
        return new I(ova, ova2, ova3, ova4);
    }

    public static C5604aua a(Ca ca, C4785Bra bra, C5141NFa nFa, Vda vda) {
        C5604aua a2 = C2933l.a(ca, bra, nFa, vda);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5604aua get() {
        return a((Ca) this.a.get(), (C4785Bra) this.b.get(), (C5141NFa) this.c.get(), (Vda) this.d.get());
    }
}
