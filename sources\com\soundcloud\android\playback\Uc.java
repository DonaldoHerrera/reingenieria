package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.ui.C4504xb;

/* compiled from: PlayerUIModule_ProvidePlayerArtworkLoaderFactory */
public final class Uc implements C4961HMa<C4504xb> {
    private final C7054oVa<N> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<C6699jHa> d;

    public Uc(C7054oVa<N> ova, C7054oVa<Resources> ova2, C7054oVa<HPa> ova3, C7054oVa<C6699jHa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Uc a(C7054oVa<N> ova, C7054oVa<Resources> ova2, C7054oVa<HPa> ova3, C7054oVa<C6699jHa> ova4) {
        return new Uc(ova, ova2, ova3, ova4);
    }

    public static C4504xb a(N n, Resources resources, HPa hPa, C6699jHa jha) {
        C4504xb a2 = Tc.a(n, resources, hPa, jha);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4504xb get() {
        return a((N) this.a.get(), (Resources) this.b.get(), (HPa) this.c.get(), (C6699jHa) this.d.get());
    }
}
