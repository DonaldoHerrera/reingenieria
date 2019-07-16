package com.soundcloud.android.playback;

import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.stations.ic;

/* renamed from: com.soundcloud.android.playback.gb reason: case insensitive filesystem */
/* compiled from: PlayQueueExtender_Factory */
public final class C4311gb implements C4961HMa<Ya> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C4281ab> b;
    private final C7054oVa<ic> c;
    private final C7054oVa<C2732f> d;

    public C4311gb(C7054oVa<C3814lca> ova, C7054oVa<C4281ab> ova2, C7054oVa<ic> ova3, C7054oVa<C2732f> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4311gb a(C7054oVa<C3814lca> ova, C7054oVa<C4281ab> ova2, C7054oVa<ic> ova3, C7054oVa<C2732f> ova4) {
        return new C4311gb(ova, ova2, ova3, ova4);
    }

    public Ya get() {
        return new Ya((C3814lca) this.a.get(), (C4281ab) this.b.get(), (ic) this.c.get(), (C2732f) this.d.get());
    }
}
