package com.soundcloud.android.fcm;

/* compiled from: RemoteRefreshPolicies_Factory */
public final class F implements C4961HMa<D> {
    private final C7054oVa<C6334dta> a;

    public F(C7054oVa<C6334dta> ova) {
        this.a = ova;
    }

    public static F a(C7054oVa<C6334dta> ova) {
        return new F(ova);
    }

    public D get() {
        return new D((C6334dta) this.a.get());
    }
}
