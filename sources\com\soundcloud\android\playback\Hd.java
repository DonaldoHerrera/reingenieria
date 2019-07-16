package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.C2526g;

/* compiled from: StreamUrlBuilder_Factory */
public final class Hd implements C4961HMa<Gd> {
    private final C7054oVa<C2526g> a;
    private final C7054oVa<C2961dP> b;

    public Hd(C7054oVa<C2526g> ova, C7054oVa<C2961dP> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Hd a(C7054oVa<C2526g> ova, C7054oVa<C2961dP> ova2) {
        return new Hd(ova, ova2);
    }

    public static Gd a(C2526g gVar, C2961dP dPVar) {
        return new Gd(gVar, dPVar);
    }

    public Gd get() {
        return new Gd((C2526g) this.a.get(), (C2961dP) this.b.get());
    }
}
