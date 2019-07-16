package com.soundcloud.android.offline;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.tracks.Pa;

/* renamed from: com.soundcloud.android.offline.xc reason: case insensitive filesystem */
/* compiled from: LoadTracksWithStalePolicies_Factory */
public final class C4191xc implements C4961HMa<C4186wc> {
    private final C7054oVa<K> a;
    private final C7054oVa<Pa> b;
    private final C7054oVa<C5421Wpa> c;
    private final C7054oVa<Gd> d;

    public C4191xc(C7054oVa<K> ova, C7054oVa<Pa> ova2, C7054oVa<C5421Wpa> ova3, C7054oVa<Gd> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4191xc a(C7054oVa<K> ova, C7054oVa<Pa> ova2, C7054oVa<C5421Wpa> ova3, C7054oVa<Gd> ova4) {
        return new C4191xc(ova, ova2, ova3, ova4);
    }

    public static C4186wc a(K k, Pa pa, C5421Wpa wpa, Gd gd) {
        return new C4186wc(k, pa, wpa, gd);
    }

    public C4186wc get() {
        return new C4186wc((K) this.a.get(), (Pa) this.b.get(), (C5421Wpa) this.c.get(), (Gd) this.d.get());
    }
}
