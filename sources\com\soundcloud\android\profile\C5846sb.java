package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.F;

/* renamed from: com.soundcloud.android.profile.sb reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter_Factory */
public final class C5846sb implements C4961HMa<C5841rb> {
    private final C7054oVa<Lc> a;
    private final C7054oVa<C4655rja> b;
    private final C7054oVa<F> c;
    private final C7054oVa<HPa> d;

    public C5846sb(C7054oVa<Lc> ova, C7054oVa<C4655rja> ova2, C7054oVa<F> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C5846sb a(C7054oVa<Lc> ova, C7054oVa<C4655rja> ova2, C7054oVa<F> ova3, C7054oVa<HPa> ova4) {
        return new C5846sb(ova, ova2, ova3, ova4);
    }

    public C5841rb get() {
        return new C5841rb((Lc) this.a.get(), (C4655rja) this.b.get(), (F) this.c.get(), (HPa) this.d.get());
    }
}
