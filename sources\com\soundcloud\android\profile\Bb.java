package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: UserFollowersPresenter.kt */
public final class Bb extends C5768cc {
    private final Lc n;

    public Bb(Lc lc, Zca zca, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(lc, "operations");
        C7471uYa.b(zca, "screenData");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(zca, bVar, ava, hPa);
        this.n = lc;
    }

    public IPa<C2189NP<C4954HFa>> a(String str) {
        C7471uYa.b(str, "nextPageLink");
        return this.n.a(str);
    }

    public IPa<C2189NP<C4954HFa>> b(C5803jc jcVar) {
        C7471uYa.b(jcVar, "userParams");
        return this.n.a(jcVar.a());
    }
}
