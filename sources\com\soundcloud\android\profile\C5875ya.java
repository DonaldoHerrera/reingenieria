package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.image.N;
import com.soundcloud.android.stations.Ga;

/* renamed from: com.soundcloud.android.profile.ya reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
public class C5875ya {
    private final N a;
    private final C5408WFa b;
    private final C3240rR c;
    private final C2390YL d;
    private final Ga e;
    private final F f;
    private final Aa g;
    private final C6614hxa h;
    private final C3700b i;
    private final C5606ava j;

    public C5875ya(N n, C5408WFa wFa, C3240rR rRVar, C2390YL yl, Ga ga, F f2, Aa aa, C6614hxa hxa, C3700b bVar, C5606ava ava) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(wFa, "numberFormatter");
        C7471uYa.b(rRVar, "followingOperations");
        C7471uYa.b(yl, "engagementsTracking");
        C7471uYa.b(ga, "stationHandler");
        C7471uYa.b(f2, "screenProvider");
        C7471uYa.b(aa, "profileImageHelper");
        C7471uYa.b(hxa, "shareOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        this.a = n;
        this.b = wFa;
        this.c = rRVar;
        this.d = yl;
        this.e = ga;
        this.f = f2;
        this.g = aa;
        this.h = hxa;
        this.i = bVar;
        this.j = ava;
    }

    public C5850ta a() {
        C5850ta taVar = new C5850ta(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        return taVar;
    }
}
