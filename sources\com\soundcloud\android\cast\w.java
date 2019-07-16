package com.soundcloud.android.cast;

/* compiled from: CastSessionController_Factory */
public final class w implements C4961HMa<v> {
    private final C7054oVa<C2733g> a;
    private final C7054oVa<C2732f> b;

    public w(C7054oVa<C2733g> ova, C7054oVa<C2732f> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static w a(C7054oVa<C2733g> ova, C7054oVa<C2732f> ova2) {
        return new w(ova, ova2);
    }

    public v get() {
        return new v((C2733g) this.a.get(), (C2732f) this.b.get());
    }
}
