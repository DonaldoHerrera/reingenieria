package com.soundcloud.android.payments;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: com.soundcloud.android.payments.ta reason: case insensitive filesystem */
/* compiled from: ProductChoicePresenter_Factory */
public final class C4266ta implements C4961HMa<C4264sa> {
    private final C7054oVa<_a> a;
    private final C7054oVa<C4655rja> b;
    private final C7054oVa<C2526g> c;
    private final C7054oVa<C4259pa> d;
    private final C7054oVa<C4274xa> e;
    private final C7054oVa<Ba> f;
    private final C7054oVa<C3700b> g;

    public static C4264sa a(_a _aVar, C4655rja rja, C2526g gVar, C4806CMa<C4259pa> cMa, C4806CMa<C4274xa> cMa2, Ba ba, C3700b bVar) {
        C4264sa saVar = new C4264sa(_aVar, rja, gVar, cMa, cMa2, ba, bVar);
        return saVar;
    }

    public C4264sa get() {
        C4264sa saVar = new C4264sa((_a) this.a.get(), (C4655rja) this.b.get(), (C2526g) this.c.get(), C4930GMa.a(this.d), C4930GMa.a(this.e), (Ba) this.f.get(), (C3700b) this.g.get());
        return saVar;
    }
}
