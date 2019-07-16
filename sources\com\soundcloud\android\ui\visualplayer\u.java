package com.soundcloud.android.ui.visualplayer;

import com.soundcloud.android.tracks.Ca;

/* compiled from: VisualPlayerPresenter_Factory */
public final class u implements C4961HMa<t> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<C3814lca> b;
    private final C7054oVa<Ca> c;

    public u(C7054oVa<HPa> ova, C7054oVa<C3814lca> ova2, C7054oVa<Ca> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static u a(C7054oVa<HPa> ova, C7054oVa<C3814lca> ova2, C7054oVa<Ca> ova3) {
        return new u(ova, ova2, ova3);
    }

    public t get() {
        return new t((HPa) this.a.get(), (C3814lca) this.b.get(), (Ca) this.c.get());
    }
}
