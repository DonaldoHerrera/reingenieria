package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.mb reason: case insensitive filesystem */
/* compiled from: PlayQueueFactory_Factory */
public final class C4341mb implements C4961HMa<C4336lb> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C6334dta> b;

    public C4341mb(C7054oVa<C3814lca> ova, C7054oVa<C6334dta> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4341mb a(C7054oVa<C3814lca> ova, C7054oVa<C6334dta> ova2) {
        return new C4341mb(ova, ova2);
    }

    public C4336lb get() {
        return new C4336lb((C3814lca) this.a.get(), (C6334dta) this.b.get());
    }
}
