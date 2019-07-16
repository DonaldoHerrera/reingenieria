package com.soundcloud.android.payments;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: com.soundcloud.android.payments.ea reason: case insensitive filesystem */
/* compiled from: PaymentErrorPresenter_Factory */
public final class C4237ea implements C4961HMa<C4235da> {
    private final C7054oVa<C4239fa> a;
    private final C7054oVa<C3700b> b;

    public static C4235da a(Object obj, C3700b bVar) {
        return new C4235da((C4239fa) obj, bVar);
    }

    public C4235da get() {
        return new C4235da((C4239fa) this.a.get(), (C3700b) this.b.get());
    }
}
