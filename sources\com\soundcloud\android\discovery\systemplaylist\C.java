package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.playback.C4416rb;

/* compiled from: SystemPlaylistItemMapper_Factory */
public final class C implements C4961HMa<B> {
    private final C7054oVa<C4416rb> a;
    private final C7054oVa<C5604aua> b;

    public C(C7054oVa<C4416rb> ova, C7054oVa<C5604aua> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C a(C7054oVa<C4416rb> ova, C7054oVa<C5604aua> ova2) {
        return new C(ova, ova2);
    }

    public B get() {
        return new B((C4416rb) this.a.get(), (C5604aua) this.b.get());
    }
}
