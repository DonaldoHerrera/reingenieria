package com.soundcloud.android.settings.privacy;

import android.content.Context;

/* compiled from: CommunicationsSettingsPresenter_Factory */
public final class K implements C4961HMa<J> {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<Context> b;
    private final C7054oVa<C3129mM> c;

    public K(C7054oVa<C4655rja> ova, C7054oVa<Context> ova2, C7054oVa<C3129mM> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static K a(C7054oVa<C4655rja> ova, C7054oVa<Context> ova2, C7054oVa<C3129mM> ova3) {
        return new K(ova, ova2, ova3);
    }

    public J get() {
        return new J((C4655rja) this.a.get(), (Context) this.b.get(), (C3129mM) this.c.get());
    }
}
