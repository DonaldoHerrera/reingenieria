package com.soundcloud.android.accounts;

/* compiled from: MeStorage_Factory */
public final class I implements C4961HMa<H> {
    private final C7054oVa<C3800jea> a;

    public I(C7054oVa<C3800jea> ova) {
        this.a = ova;
    }

    public static I a(C7054oVa<C3800jea> ova) {
        return new I(ova);
    }

    public H get() {
        return new H((C3800jea) this.a.get());
    }
}
