package com.soundcloud.android.fcm;

import com.soundcloud.android.properties.a;
import com.soundcloud.android.sync.T;

/* compiled from: EntityUpdateMessageListener_Factory */
public final class l implements C4961HMa<k> {
    private final C7054oVa<Nea> a;
    private final C7054oVa<T> b;
    private final C7054oVa<a> c;
    private final C7054oVa<C3469VY> d;

    public l(C7054oVa<Nea> ova, C7054oVa<T> ova2, C7054oVa<a> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static l a(C7054oVa<Nea> ova, C7054oVa<T> ova2, C7054oVa<a> ova3, C7054oVa<C3469VY> ova4) {
        return new l(ova, ova2, ova3, ova4);
    }

    public k get() {
        return new k((Nea) this.a.get(), (T) this.b.get(), (a) this.c.get(), (C3469VY) this.d.get());
    }
}
