package com.soundcloud.android.playback;

import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.playback.ui.view.g;

/* compiled from: ConcurrentPlaybackOperations */
public class K {
    private final C4298dd a;
    private final C4412qb b;
    private final C4416rb c;
    private final C2732f d;
    private final g e;

    K(C4298dd ddVar, C4412qb qbVar, C4416rb rbVar, C2732f fVar, g gVar) {
        this.a = ddVar;
        this.b = qbVar;
        this.c = rbVar;
        this.d = fVar;
        this.e = gVar;
    }

    public void a() {
        if (!this.d.e() && this.c.isPlaying()) {
            this.a.a();
            this.b.g();
            this.e.a();
        }
    }
}
