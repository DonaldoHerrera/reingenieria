package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3678e;

/* compiled from: VideoSurfaceProvider_Factory */
public final class le implements C4961HMa<ke> {
    private final C7054oVa<a> a;
    private final C7054oVa<C3678e> b;

    public le(C7054oVa<a> ova, C7054oVa<C3678e> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static le a(C7054oVa<a> ova, C7054oVa<C3678e> ova2) {
        return new le(ova, ova2);
    }

    public ke get() {
        return new ke((a) this.a.get(), (C3678e) this.b.get());
    }
}
