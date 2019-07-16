package com.soundcloud.android.offline;

import com.soundcloud.android.properties.a;

/* compiled from: OfflineAuditJob_Factory */
public final class Ac implements C4961HMa<C4201zc> {
    private final C7054oVa<Ec> a;
    private final C7054oVa<a> b;

    public Ac(C7054oVa<Ec> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ac a(C7054oVa<Ec> ova, C7054oVa<a> ova2) {
        return new Ac(ova, ova2);
    }

    public C4201zc get() {
        return new C4201zc((Ec) this.a.get(), (a) this.b.get());
    }
}
