package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: VideoAdPlaybackTrackingBridge_Factory */
public final class ge implements C4961HMa<ee> {
    private final C7054oVa<C3678e> a;
    private final C7054oVa<ke> b;
    private final C7054oVa<C3700b> c;

    public ge(C7054oVa<C3678e> ova, C7054oVa<ke> ova2, C7054oVa<C3700b> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static ge a(C7054oVa<C3678e> ova, C7054oVa<ke> ova2, C7054oVa<C3700b> ova3) {
        return new ge(ova, ova2, ova3);
    }

    public ee get() {
        return new ee((C3678e) this.a.get(), (ke) this.b.get(), (C3700b) this.c.get());
    }
}
