package com.soundcloud.android.stations;

import android.content.res.Resources;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ta;

/* compiled from: StationInfoHeaderRenderer_Factory */
public final class Ya implements C4961HMa<Xa> {
    private final C7054oVa<ta> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<N> c;

    public static Xa a(ta taVar, Resources resources, N n) {
        return new Xa(taVar, resources, n);
    }

    public Xa get() {
        return new Xa((ta) this.a.get(), (Resources) this.b.get(), (N) this.c.get());
    }
}
