package com.soundcloud.android.main;

import com.soundcloud.android.ads.C2633va;
import com.soundcloud.android.ads.Ca;
import com.soundcloud.android.playback.ui.ac;

/* compiled from: PlayerController_Factory */
public final class aa implements C4961HMa<PlayerController> {
    private final C7054oVa<ac> a;
    private final C7054oVa<Ca> b;
    private final C7054oVa<C2633va> c;
    private final C7054oVa<C5052KJa> d;

    public PlayerController get() {
        return new PlayerController((ac) this.a.get(), (Ca) this.b.get(), (C2633va) this.c.get(), (C5052KJa) this.d.get());
    }
}
