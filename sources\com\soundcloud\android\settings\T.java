package com.soundcloud.android.settings;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: SettingsPresenter_Factory */
public final class T implements C4961HMa<S> {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C2436_U> d;

    public T(C7054oVa<C4655rja> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static T a(C7054oVa<C4655rja> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4) {
        return new T(ova, ova2, ova3, ova4);
    }

    public S get() {
        return new S((C4655rja) this.a.get(), (C5327TLa) this.b.get(), (C3700b) this.c.get(), (C2436_U) this.d.get());
    }
}
