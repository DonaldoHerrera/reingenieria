package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4412qb;

/* compiled from: AdPlayerController_Factory */
public final class Da implements C4961HMa<Ca> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<Na> b;
    private final C7054oVa<C4412qb> c;
    private final C7054oVa<r> d;

    public Da(C7054oVa<C5327TLa> ova, C7054oVa<Na> ova2, C7054oVa<C4412qb> ova3, C7054oVa<r> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Da a(C7054oVa<C5327TLa> ova, C7054oVa<Na> ova2, C7054oVa<C4412qb> ova3, C7054oVa<r> ova4) {
        return new Da(ova, ova2, ova3, ova4);
    }

    public Ca get() {
        return new Ca((C5327TLa) this.a.get(), (Na) this.b.get(), (C4412qb) this.c.get(), (r) this.d.get());
    }
}
