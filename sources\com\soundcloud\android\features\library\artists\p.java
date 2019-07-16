package com.soundcloud.android.features.library.artists;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.profile.Lc;

/* compiled from: ArtistsPresenter_Factory */
public final class p implements C4961HMa<o> {
    private final C7054oVa<Lc> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<C5606ava> c;
    private final C7054oVa<HPa> d;

    public p(C7054oVa<Lc> ova, C7054oVa<C3700b> ova2, C7054oVa<C5606ava> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static p a(C7054oVa<Lc> ova, C7054oVa<C3700b> ova2, C7054oVa<C5606ava> ova3, C7054oVa<HPa> ova4) {
        return new p(ova, ova2, ova3, ova4);
    }

    public o get() {
        return new o((Lc) this.a.get(), (C3700b) this.b.get(), (C5606ava) this.c.get(), (HPa) this.d.get());
    }
}
