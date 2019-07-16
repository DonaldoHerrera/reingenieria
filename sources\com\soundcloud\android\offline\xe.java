package com.soundcloud.android.offline;

/* compiled from: StrictSSLHttpClientFactory_Factory */
public final class xe implements C4961HMa<we> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<Qb> b;

    public xe(C7054oVa<C7440tyb> ova, C7054oVa<Qb> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static xe a(C7054oVa<C7440tyb> ova, C7054oVa<Qb> ova2) {
        return new xe(ova, ova2);
    }

    public we get() {
        return new we(C4930GMa.a(this.a), (Qb) this.b.get());
    }
}
