package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: AdSessionAnalyticsDispatcher_Factory */
public final class B implements C4961HMa<A> {
    private final C7054oVa<C3700b> a;
    private final C7054oVa<Yaa> b;
    private final C7054oVa<C4298dd> c;
    private final C7054oVa<C3678e> d;

    public B(C7054oVa<C3700b> ova, C7054oVa<Yaa> ova2, C7054oVa<C4298dd> ova3, C7054oVa<C3678e> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static B a(C7054oVa<C3700b> ova, C7054oVa<Yaa> ova2, C7054oVa<C4298dd> ova3, C7054oVa<C3678e> ova4) {
        return new B(ova, ova2, ova3, ova4);
    }

    public A get() {
        return new A((C3700b) this.a.get(), (Yaa) this.b.get(), (C4298dd) this.c.get(), (C3678e) this.d.get());
    }
}
