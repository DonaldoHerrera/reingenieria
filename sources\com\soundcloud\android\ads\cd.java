package com.soundcloud.android.ads;

import android.content.res.Resources;
import com.soundcloud.android.image.N;

/* compiled from: SponsoredSessionCardView_Factory */
public final class cd implements C4961HMa<bd> {
    private final C7054oVa<N> a;
    private final C7054oVa<Resources> b;

    public cd(C7054oVa<N> ova, C7054oVa<Resources> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static cd a(C7054oVa<N> ova, C7054oVa<Resources> ova2) {
        return new cd(ova, ova2);
    }

    public bd get() {
        return new bd((N) this.a.get(), (Resources) this.b.get());
    }
}
