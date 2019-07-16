package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: com.soundcloud.android.profile.dc reason: case insensitive filesystem */
/* compiled from: UserListPresenterFactory.kt */
public final class C5773dc {
    private final Lc a;
    private final C3700b b;
    private final C5606ava c;
    private final HPa d;

    public C5773dc(Lc lc, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = lc;
        this.b = bVar;
        this.c = ava;
        this.d = hPa;
    }

    public final Bb a(Zca zca) {
        C7471uYa.b(zca, "screenData");
        Bb bb = new Bb(this.a, zca, this.b, this.c, this.d);
        return bb;
    }

    public final Fb b(Zca zca) {
        C7471uYa.b(zca, "screenData");
        Fb fb = new Fb(this.a, zca, this.b, this.c, this.d);
        return fb;
    }
}
