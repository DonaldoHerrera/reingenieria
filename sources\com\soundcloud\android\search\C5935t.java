package com.soundcloud.android.search;

import com.soundcloud.android.tracks.Ca;

/* renamed from: com.soundcloud.android.search.t reason: case insensitive filesystem */
/* compiled from: SearchOperations_Factory */
public final class C5935t implements C4961HMa<C5933s> {
    private final C7054oVa<C5927oa> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<C4785Bra> c;
    private final C7054oVa<C5141NFa> d;

    public C5935t(C7054oVa<C5927oa> ova, C7054oVa<Ca> ova2, C7054oVa<C4785Bra> ova3, C7054oVa<C5141NFa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C5935t a(C7054oVa<C5927oa> ova, C7054oVa<Ca> ova2, C7054oVa<C4785Bra> ova3, C7054oVa<C5141NFa> ova4) {
        return new C5935t(ova, ova2, ova3, ova4);
    }

    public C5933s get() {
        return new C5933s((C5927oa) this.a.get(), (Ca) this.b.get(), (C4785Bra) this.c.get(), (C5141NFa) this.d.get());
    }
}
