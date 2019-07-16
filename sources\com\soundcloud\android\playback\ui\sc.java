package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.ui.Ab.a;
import com.soundcloud.android.settings.C5956m;

/* compiled from: VideoAdPresenter_Factory */
public final class sc implements C4961HMa<rc> {
    private final C7054oVa<N> a;
    private final C7054oVa<Aa> b;
    private final C7054oVa<a> c;
    private final C7054oVa<C6699jHa> d;
    private final C7054oVa<Resources> e;
    private final C7054oVa<C5956m> f;

    public static rc a(N n, Aa aa, a aVar, C6699jHa jha, Resources resources, C5956m mVar) {
        rc rcVar = new rc(n, aa, aVar, jha, resources, mVar);
        return rcVar;
    }

    public rc get() {
        rc rcVar = new rc((N) this.a.get(), (Aa) this.b.get(), (a) this.c.get(), (C6699jHa) this.d.get(), (Resources) this.e.get(), (C5956m) this.f.get());
        return rcVar;
    }
}
