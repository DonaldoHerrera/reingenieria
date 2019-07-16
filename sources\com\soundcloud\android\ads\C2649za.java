package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.playback.A;
import com.soundcloud.android.playback.Ba;
import com.soundcloud.android.playback.C4519wc;

/* renamed from: com.soundcloud.android.ads.za reason: case insensitive filesystem */
/* compiled from: AdPlayerAnalyticsController */
public class C2649za {
    private final A a;
    private C4928GKa<C4519wc> b = C4928GKa.a();
    private Ba c = Ba.a;

    C2649za(A a2) {
        this.a = a2;
    }

    /* access modifiers changed from: 0000 */
    public void a(Yca yca, boolean z, U u, Ba ba) {
        boolean z2 = !ba.s().equals(this.c.s());
        this.a.a(u, new I(yca.a(), z));
        if (ba.j()) {
            this.a.b(ba, z2);
        } else {
            this.a.a(ba, z2);
        }
        this.c = ba;
    }

    public void a(U u, C4519wc wcVar) {
        if (this.c.s().equals(u.f())) {
            if (wcVar.d() >= a()) {
                this.a.a(this.c, wcVar);
                this.b = C4928GKa.c(wcVar);
            }
            this.a.a(wcVar);
        }
    }

    private long a() {
        if (this.b.c()) {
            return ((C4519wc) this.b.b()).d() + A.a;
        }
        return A.a;
    }
}
