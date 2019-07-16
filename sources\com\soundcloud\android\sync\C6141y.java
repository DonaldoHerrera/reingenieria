package com.soundcloud.android.sync;

import com.soundcloud.android.offline.Cd;

/* renamed from: com.soundcloud.android.sync.y reason: case insensitive filesystem */
/* compiled from: OneShotJobsRegistry_Factory */
public final class C6141y implements C4961HMa<C6140x> {
    private final C7054oVa<C2472bS<C3117lU>> a;
    private final C7054oVa<C2472bS<Cd>> b;

    public C6141y(C7054oVa<C2472bS<C3117lU>> ova, C7054oVa<C2472bS<Cd>> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6141y a(C7054oVa<C2472bS<C3117lU>> ova, C7054oVa<C2472bS<Cd>> ova2) {
        return new C6141y(ova, ova2);
    }

    public C6140x get() {
        return new C6140x((C2472bS) this.a.get(), (C2472bS) this.b.get());
    }
}
