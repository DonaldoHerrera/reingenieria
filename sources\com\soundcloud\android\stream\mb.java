package com.soundcloud.android.stream;

/* compiled from: StreamStorage_Factory */
public final class mb implements C4961HMa<lb> {
    private final C7054oVa<C5500ZKa> a;

    public mb(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static mb a(C7054oVa<C5500ZKa> ova) {
        return new mb(ova);
    }

    public lb get() {
        return new lb((C5500ZKa) this.a.get());
    }
}
