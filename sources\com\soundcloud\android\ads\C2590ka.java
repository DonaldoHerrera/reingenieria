package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: com.soundcloud.android.ads.ka reason: case insensitive filesystem */
/* compiled from: AdErrorTrackingManager_Factory */
public final class C2590ka implements C4961HMa<C2586ja> {
    private final C7054oVa<Na> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<Yaa> c;

    public C2590ka(C7054oVa<Na> ova, C7054oVa<C3700b> ova2, C7054oVa<Yaa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2590ka a(C7054oVa<Na> ova, C7054oVa<C3700b> ova2, C7054oVa<Yaa> ova3) {
        return new C2590ka(ova, ova2, ova3);
    }

    public C2586ja get() {
        return new C2586ja((Na) this.a.get(), (C3700b) this.b.get(), (Yaa) this.c.get());
    }
}
