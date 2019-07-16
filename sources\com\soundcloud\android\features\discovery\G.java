package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.Db;

/* compiled from: DiscoveryPresenter_Factory */
public final class G implements C4961HMa<C3551i> {
    private final C7054oVa<C3858rY> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<C3802kY> c;
    private final C7054oVa<Db> d;
    private final C7054oVa<C5327TLa> e;
    private final C7054oVa<HPa> f;

    public G(C7054oVa<C3858rY> ova, C7054oVa<C3700b> ova2, C7054oVa<C3802kY> ova3, C7054oVa<Db> ova4, C7054oVa<C5327TLa> ova5, C7054oVa<HPa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static G a(C7054oVa<C3858rY> ova, C7054oVa<C3700b> ova2, C7054oVa<C3802kY> ova3, C7054oVa<Db> ova4, C7054oVa<C5327TLa> ova5, C7054oVa<HPa> ova6) {
        G g = new G(ova, ova2, ova3, ova4, ova5, ova6);
        return g;
    }

    public C3551i get() {
        C3551i iVar = new C3551i((C3858rY) this.a.get(), (C3700b) this.b.get(), (C3802kY) this.c.get(), (Db) this.d.get(), (C5327TLa) this.e.get(), (HPa) this.f.get());
        return iVar;
    }
}
