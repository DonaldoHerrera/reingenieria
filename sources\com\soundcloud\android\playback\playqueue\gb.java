package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6188na;

/* compiled from: TrackPlayQueueItemRenderer_Factory */
public final class gb implements C4961HMa<fb> {
    private final C7054oVa<N> a;
    private final C7054oVa<C6188na> b;

    public static fb a(N n, C6188na naVar) {
        return new fb(n, naVar);
    }

    public fb get() {
        return new fb((N) this.a.get(), (C6188na) this.b.get());
    }
}
