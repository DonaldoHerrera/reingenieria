package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.playqueue.k;

/* renamed from: com.soundcloud.android.ads.jb reason: case insensitive filesystem */
/* compiled from: AdsTimerController.kt */
public class C2587jb {
    private VPa a = C4881Eua.b();
    private final HPa b;
    /* access modifiers changed from: private */
    public final Ia c;
    /* access modifiers changed from: private */
    public final C4806CMa<Yb> d;

    public C2587jb(HPa hPa, Ia ia, C4806CMa<Yb> cMa) {
        C7471uYa.b(hPa, "ioScheduler");
        C7471uYa.b(ia, "adTimerHelper");
        C7471uYa.b(cMa, "playerAdsController");
        this.b = hPa;
        this.c = ia;
        this.d = cMa;
    }

    public void a(k kVar) {
        C7471uYa.b(kVar, "queueItemEvent");
        kVar.b().a().a((C7733yKa<? super T>) new C2583ib<Object>(this));
    }

    public void a() {
        if (!this.c.a()) {
            this.a.dispose();
            VPa d2 = this.c.a(this.b).d((C6776kQa<? super T>) new C2579hb<Object>(this));
            C7471uYa.a((Object) d2, "adTimerHelper.startTimer…Finished()\n            })");
            this.a = d2;
        }
    }
}
