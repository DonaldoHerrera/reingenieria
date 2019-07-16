package com.soundcloud.android.playback.widget;

import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.likes.C3989m;

/* compiled from: PlayerWidgetControllerProxy_Factory */
public final class t implements C4961HMa<s> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3989m> b;
    private final C7054oVa<l> c;
    private final C7054oVa<r> d;

    public t(C7054oVa<C5327TLa> ova, C7054oVa<C3989m> ova2, C7054oVa<l> ova3, C7054oVa<r> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static t a(C7054oVa<C5327TLa> ova, C7054oVa<C3989m> ova2, C7054oVa<l> ova3, C7054oVa<r> ova4) {
        return new t(ova, ova2, ova3, ova4);
    }

    public s get() {
        return new s((C5327TLa) this.a.get(), (C3989m) this.b.get(), C4930GMa.a(this.c), (r) this.d.get());
    }
}
