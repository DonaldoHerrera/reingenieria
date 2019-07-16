package com.soundcloud.android.activities;

/* compiled from: ActivitiesStorage_Factory */
public final class x implements C4961HMa<w> {
    private final C7054oVa<C4898FLa> a;
    private final C7054oVa<C5500ZKa> b;

    public x(C7054oVa<C4898FLa> ova, C7054oVa<C5500ZKa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static x a(C7054oVa<C4898FLa> ova, C7054oVa<C5500ZKa> ova2) {
        return new x(ova, ova2);
    }

    public w get() {
        return new w((C4898FLa) this.a.get(), (C5500ZKa) this.b.get());
    }
}
