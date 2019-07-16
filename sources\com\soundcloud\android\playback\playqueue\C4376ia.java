package com.soundcloud.android.playback.playqueue;

import android.content.res.Resources;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.playback.playqueue.ia reason: case insensitive filesystem */
/* compiled from: BlurringPlayQueueArtworkLoader_Factory */
public final class C4376ia implements C4961HMa<C4374ha> {
    private final C7054oVa<N> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<HPa> c;

    public C4374ha get() {
        return new C4374ha((N) this.a.get(), (Resources) this.b.get(), (HPa) this.c.get());
    }
}
