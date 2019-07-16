package com.soundcloud.android.ads;

import android.content.res.Resources;
import com.soundcloud.android.playback.ke;

/* compiled from: FullScreenVideoView_Factory */
public final class Kb implements C4961HMa<Jb> {
    private final C7054oVa<ke> a;
    private final C7054oVa<Resources> b;

    public static Jb a(ke keVar, Resources resources) {
        return new Jb(keVar, resources);
    }

    public Jb get() {
        return new Jb((ke) this.a.get(), (Resources) this.b.get());
    }
}
