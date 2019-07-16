package com.soundcloud.android.ads;

import android.content.Context;

/* renamed from: com.soundcloud.android.ads.mb reason: case insensitive filesystem */
/* compiled from: AdvertisingIdClientWrapper_Factory */
public final class C2599mb implements C4961HMa<C2595lb> {
    private final C7054oVa<Context> a;

    public C2599mb(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2599mb a(C7054oVa<Context> ova) {
        return new C2599mb(ova);
    }

    public C2595lb get() {
        return new C2595lb((Context) this.a.get());
    }
}
