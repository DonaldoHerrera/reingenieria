package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.bd reason: case insensitive filesystem */
/* compiled from: PlaylistExploderProxy_Factory */
public final class C4288bd implements C4961HMa<C4283ad> {
    private final C7054oVa<r> a;
    private final C7054oVa<Yc> b;

    public C4288bd(C7054oVa<r> ova, C7054oVa<Yc> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4288bd a(C7054oVa<r> ova, C7054oVa<Yc> ova2) {
        return new C4288bd(ova, ova2);
    }

    public C4283ad get() {
        return new C4283ad((r) this.a.get(), C4930GMa.a(this.b));
    }
}
