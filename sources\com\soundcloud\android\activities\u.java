package com.soundcloud.android.activities;

/* compiled from: ActivitiesPresenter_Factory */
public final class u implements C4961HMa<t> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<l> b;

    public u(C7054oVa<HPa> ova, C7054oVa<l> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static u a(C7054oVa<HPa> ova, C7054oVa<l> ova2) {
        return new u(ova, ova2);
    }

    public t get() {
        return new t((HPa) this.a.get(), (l) this.b.get());
    }
}
