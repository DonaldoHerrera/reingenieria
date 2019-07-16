package com.soundcloud.android.playback.ui;

import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.h;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.Ic;
import com.soundcloud.android.playback.playqueue.Ua;

/* compiled from: TrackPageListener */
class dc extends C4469lb {
    private final C3814lca e;
    private final C3983h f;
    private final C2390YL g;
    private final C4655rja h;

    dc(C4412qb qbVar, C3814lca lca, C5327TLa tLa, C3983h hVar, C2390YL yl, Ic ic, C4655rja rja, C3700b bVar) {
        super(qbVar, tLa, ic, bVar);
        this.e = lca;
        this.f = hVar;
        this.g = yl;
        this.h = rja;
    }

    private C3710l b(C3508cda cda) {
        return C3710l.a(cda, Yca.PLAYER_MAIN.a(), this.e.l(), false);
    }

    private C3710l g() {
        return C3710l.a("new");
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, C3508cda cda, h hVar) {
        this.f.b(cda, z);
        this.g.a(cda, z, b(cda), this.e.a(cda), hVar);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.c(C3876taa.e, Ua.a());
        this.d.a((J) K.i());
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda) {
        this.h.a(C4621nja.a(C3920yea.PREMIUM_CONTENT));
        this.d.a((J) Waa.a(cda));
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda, Long l, C4928GKa<String> gKa) {
        this.h.a(C4621nja.a(new Y(cda, l.longValue(), (String) gKa.d()), g()));
    }
}
