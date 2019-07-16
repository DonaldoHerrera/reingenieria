package com.soundcloud.android.playlist.view;

import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.playlist.view.q reason: case insensitive filesystem */
/* compiled from: PlaylistCoverRenderer_Factory */
public final class C5746q implements C4961HMa<C5745p> {
    private final C7054oVa<N> a;

    public C5746q(C7054oVa<N> ova) {
        this.a = ova;
    }

    public static C5746q a(C7054oVa<N> ova) {
        return new C5746q(ova);
    }

    public C5745p get() {
        return new C5745p((N) this.a.get());
    }
}
