package com.soundcloud.android.payments;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.view.Y;

/* compiled from: WebCheckoutPresenter_Factory */
public final class Ua implements C4961HMa<Ta> {
    private final C7054oVa<Va> a;
    private final C7054oVa<Y> b;
    private final C7054oVa<C2526g> c;
    private final C7054oVa<C5018JHa> d;
    private final C7054oVa<_a> e;
    private final C7054oVa<C3184oU> f;
    private final C7054oVa<C4581ija> g;
    private final C7054oVa<C3700b> h;
    private final C7054oVa<C7181qKa> i;

    public static Ta a(Va va, Y y, C2526g gVar, C5018JHa jHa, C4806CMa<_a> cMa, C3184oU oUVar, C4581ija ija, C3700b bVar, C7181qKa qka) {
        Ta ta = new Ta(va, y, gVar, jHa, cMa, oUVar, ija, bVar, qka);
        return ta;
    }

    public Ta get() {
        Ta ta = new Ta((Va) this.a.get(), (Y) this.b.get(), (C2526g) this.c.get(), (C5018JHa) this.d.get(), C4930GMa.a(this.e), (C3184oU) this.f.get(), (C4581ija) this.g.get(), (C3700b) this.h.get(), (C7181qKa) this.i.get());
        return ta;
    }
}
