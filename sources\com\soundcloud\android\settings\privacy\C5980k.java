package com.soundcloud.android.settings.privacy;

import android.content.Context;

/* renamed from: com.soundcloud.android.settings.privacy.k reason: case insensitive filesystem */
/* compiled from: AdvertisingSettingsPresenter_Factory */
public final class C5980k implements C4961HMa<C5979j> {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<Context> b;
    private final C7054oVa<C3129mM> c;

    public C5980k(C7054oVa<C4655rja> ova, C7054oVa<Context> ova2, C7054oVa<C3129mM> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5980k a(C7054oVa<C4655rja> ova, C7054oVa<Context> ova2, C7054oVa<C3129mM> ova3) {
        return new C5980k(ova, ova2, ova3);
    }

    public C5979j get() {
        return new C5979j((C4655rja) this.a.get(), (Context) this.b.get(), (C3129mM) this.c.get());
    }
}
