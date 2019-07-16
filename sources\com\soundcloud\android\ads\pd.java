package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: WhyAdsDialogPresenter_Factory */
public final class pd implements C4961HMa<od> {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<C2436_U> b;
    private final C7054oVa<C3700b> c;

    public pd(C7054oVa<C4655rja> ova, C7054oVa<C2436_U> ova2, C7054oVa<C3700b> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static pd a(C7054oVa<C4655rja> ova, C7054oVa<C2436_U> ova2, C7054oVa<C3700b> ova3) {
        return new pd(ova, ova2, ova3);
    }

    public od get() {
        return new od((C4655rja) this.a.get(), (C2436_U) this.b.get(), (C3700b) this.c.get());
    }
}
