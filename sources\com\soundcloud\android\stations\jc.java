package com.soundcloud.android.stations;

import com.soundcloud.android.tracks.Ca;

/* compiled from: StationsOperations_Factory */
public final class jc implements C4961HMa<ic> {
    private final C7054oVa<Vda> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<Ca> d;

    public jc(C7054oVa<Vda> ova, C7054oVa<HPa> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<Ca> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static jc a(C7054oVa<Vda> ova, C7054oVa<HPa> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<Ca> ova4) {
        return new jc(ova, ova2, ova3, ova4);
    }

    public ic get() {
        return new ic((Vda) this.a.get(), (HPa) this.b.get(), (C5327TLa) this.c.get(), (Ca) this.d.get());
    }
}
