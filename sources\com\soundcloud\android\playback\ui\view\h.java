package com.soundcloud.android.playback.ui.view;

import com.soundcloud.android.playback.C4416rb;

/* compiled from: PlaybackFeedbackHelper_Factory */
public final class h implements C4961HMa<g> {
    private final C7054oVa<C4416rb> a;
    private final C7054oVa<C5052KJa> b;

    public h(C7054oVa<C4416rb> ova, C7054oVa<C5052KJa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static h a(C7054oVa<C4416rb> ova, C7054oVa<C5052KJa> ova2) {
        return new h(ova, ova2);
    }

    public g get() {
        return new g((C4416rb) this.a.get(), (C5052KJa) this.b.get());
    }
}
