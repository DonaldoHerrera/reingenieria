package com.soundcloud.android.playlist.view;

import android.content.Context;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.playback.ui.C4454gb;

/* compiled from: PlaylistEngagementsRenderer_Factory */
public final class Z implements C4961HMa<Y> {
    private final C7054oVa<Context> a;
    private final C7054oVa<a> b;
    private final C7054oVa<C4454gb> c;
    private final C7054oVa<Iea> d;
    private final C7054oVa<C4070ce> e;
    private final C7054oVa<C6834lGa> f;

    public Z(C7054oVa<Context> ova, C7054oVa<a> ova2, C7054oVa<C4454gb> ova3, C7054oVa<Iea> ova4, C7054oVa<C4070ce> ova5, C7054oVa<C6834lGa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Z a(C7054oVa<Context> ova, C7054oVa<a> ova2, C7054oVa<C4454gb> ova3, C7054oVa<Iea> ova4, C7054oVa<C4070ce> ova5, C7054oVa<C6834lGa> ova6) {
        Z z = new Z(ova, ova2, ova3, ova4, ova5, ova6);
        return z;
    }

    public Y get() {
        Y y = new Y((Context) this.a.get(), (a) this.b.get(), (C4454gb) this.c.get(), (Iea) this.d.get(), (C4070ce) this.e.get(), (C6834lGa) this.f.get());
        return y;
    }
}
