package com.soundcloud.android.sync;

/* renamed from: com.soundcloud.android.sync.w reason: case insensitive filesystem */
/* compiled from: MultiJobRequestFactory_Factory */
public final class C6139w implements C4961HMa<C6138v> {
    private final C7054oVa<C5327TLa> a;

    public C6139w(C7054oVa<C5327TLa> ova) {
        this.a = ova;
    }

    public static C6139w a(C7054oVa<C5327TLa> ova) {
        return new C6139w(ova);
    }

    public C6138v get() {
        return new C6138v(this.a);
    }
}
