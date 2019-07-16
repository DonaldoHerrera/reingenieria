package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: PlayerUpsellImpressionController */
class Tb {
    private q a;
    private final C3700b b;

    Tb(C3700b bVar) {
        this.b = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(q qVar) {
        if (!qVar.equals(this.a)) {
            this.a = qVar;
            this.b.a((J) Waa.b(qVar.c()));
        }
    }
}
