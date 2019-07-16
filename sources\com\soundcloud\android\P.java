package com.soundcloud.android;

import com.soundcloud.android.playback.Ab;
import com.soundcloud.android.playback.C4302ec;
import com.soundcloud.android.playback.C4352oc;
import com.soundcloud.android.playback.C4413qc;
import com.soundcloud.android.playback.C4432uc;
import com.soundcloud.android.playback.Xb;
import com.soundcloud.android.playback.players.r;

/* compiled from: ApplicationModule_ProvideSoundCloudPlayerFactory */
public final class P implements C4961HMa<r> {
    private final C7054oVa<C4432uc> a;
    private final C7054oVa<Xb> b;
    private final C7054oVa<C4413qc> c;
    private final C7054oVa<C4302ec> d;
    private final C7054oVa<Ab> e;
    private final C7054oVa<C4352oc> f;
    private final C7054oVa<C3381yS> g;

    public P(C7054oVa<C4432uc> ova, C7054oVa<Xb> ova2, C7054oVa<C4413qc> ova3, C7054oVa<C4302ec> ova4, C7054oVa<Ab> ova5, C7054oVa<C4352oc> ova6, C7054oVa<C3381yS> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static P a(C7054oVa<C4432uc> ova, C7054oVa<Xb> ova2, C7054oVa<C4413qc> ova3, C7054oVa<C4302ec> ova4, C7054oVa<Ab> ova5, C7054oVa<C4352oc> ova6, C7054oVa<C3381yS> ova7) {
        P p = new P(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return p;
    }

    public static r a(C4432uc ucVar, Xb xb, C4413qc qcVar, C4302ec ecVar, Ab ab, C4352oc ocVar, C3381yS ySVar) {
        r a2 = C2933l.a(ucVar, xb, qcVar, ecVar, ab, ocVar, ySVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public r get() {
        return a((C4432uc) this.a.get(), (Xb) this.b.get(), (C4413qc) this.c.get(), (C4302ec) this.d.get(), (Ab) this.e.get(), (C4352oc) this.f.get(), (C3381yS) this.g.get());
    }
}
