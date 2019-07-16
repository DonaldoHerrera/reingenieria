package com.soundcloud.android.stream;

/* compiled from: StreamCleanupHelper_Factory */
public final class D implements C4961HMa<C> {
    private final C7054oVa<C5500ZKa> a;

    public D(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static D a(C7054oVa<C5500ZKa> ova) {
        return new D(ova);
    }

    public C get() {
        return new C((C5500ZKa) this.a.get());
    }
}
