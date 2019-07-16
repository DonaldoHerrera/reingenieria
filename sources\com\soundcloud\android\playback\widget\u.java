package com.soundcloud.android.playback.widget;

import android.content.Context;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.tracks.Ca;

/* compiled from: PlayerWidgetController_Factory */
public final class u implements C4961HMa<l> {
    private final C7054oVa<Context> a;
    private final C7054oVa<w> b;
    private final C7054oVa<C4416rb> c;
    private final C7054oVa<C3814lca> d;
    private final C7054oVa<Ca> e;
    private final C7054oVa<C3983h> f;
    private final C7054oVa<C2390YL> g;

    public u(C7054oVa<Context> ova, C7054oVa<w> ova2, C7054oVa<C4416rb> ova3, C7054oVa<C3814lca> ova4, C7054oVa<Ca> ova5, C7054oVa<C3983h> ova6, C7054oVa<C2390YL> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static u a(C7054oVa<Context> ova, C7054oVa<w> ova2, C7054oVa<C4416rb> ova3, C7054oVa<C3814lca> ova4, C7054oVa<Ca> ova5, C7054oVa<C3983h> ova6, C7054oVa<C2390YL> ova7) {
        u uVar = new u(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return uVar;
    }

    public l get() {
        l lVar = new l((Context) this.a.get(), (w) this.b.get(), (C4416rb) this.c.get(), (C3814lca) this.d.get(), (Ca) this.e.get(), (C3983h) this.f.get(), (C2390YL) this.g.get());
        return lVar;
    }
}
