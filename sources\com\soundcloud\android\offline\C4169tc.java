package com.soundcloud.android.offline;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.tracks.Ya;

/* renamed from: com.soundcloud.android.offline.tc reason: case insensitive filesystem */
/* compiled from: LoadExpectedContentCommand_Factory */
public final class C4169tc implements C4961HMa<C4163sc> {
    private final C7054oVa<K> a;
    private final C7054oVa<Ya> b;
    private final C7054oVa<C5479Ypa> c;
    private final C7054oVa<C6332dsa> d;
    private final C7054oVa<Gd> e;
    private final C7054oVa<e> f;

    public C4169tc(C7054oVa<K> ova, C7054oVa<Ya> ova2, C7054oVa<C5479Ypa> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<Gd> ova5, C7054oVa<e> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C4169tc a(C7054oVa<K> ova, C7054oVa<Ya> ova2, C7054oVa<C5479Ypa> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<Gd> ova5, C7054oVa<e> ova6) {
        C4169tc tcVar = new C4169tc(ova, ova2, ova3, ova4, ova5, ova6);
        return tcVar;
    }

    public static C4163sc a(K k, Ya ya, C5479Ypa ypa, C6332dsa dsa, Gd gd, e eVar) {
        C4163sc scVar = new C4163sc(k, ya, ypa, dsa, gd, eVar);
        return scVar;
    }

    public C4163sc get() {
        C4163sc scVar = new C4163sc((K) this.a.get(), (Ya) this.b.get(), (C5479Ypa) this.c.get(), (C6332dsa) this.d.get(), (Gd) this.e.get(), (e) this.f.get());
        return scVar;
    }
}
