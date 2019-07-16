package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ba;

/* compiled from: VideoPlayerAd */
class tc extends C4489sb {
    private final aa j;

    tc(aa aaVar) {
        super(aaVar);
        this.j = aaVar;
    }

    /* access modifiers changed from: 0000 */
    public ba q() {
        return this.j.D();
    }

    /* access modifiers changed from: 0000 */
    public float r() {
        ba q = q();
        return ((float) q.g()) / ((float) q.b());
    }

    /* access modifiers changed from: 0000 */
    public boolean s() {
        return !this.j.M();
    }

    /* access modifiers changed from: 0000 */
    public boolean t() {
        return this.j.M();
    }
}
