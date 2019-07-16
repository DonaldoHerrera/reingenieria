package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.K;
import com.soundcloud.android.playback.C4431ub;
import java.util.List;

/* renamed from: com.soundcloud.android.ads.ac reason: case insensitive filesystem */
/* compiled from: PlayerAdsController.kt */
final class C2546ac<T> implements C6776kQa<T> {
    final /* synthetic */ Yb a;
    final /* synthetic */ C4431ub b;

    C2546ac(Yb yb, C4431ub ubVar) {
        this.a = yb;
        this.b = ubVar;
    }

    /* renamed from: a */
    public final void accept(Long l) {
        SDb.a("ScAds").d("Skipping ad after waiting 6 seconds for it to load.", new Object[0]);
        this.a.n.a(this.a.b(this.b));
        C2586ja a2 = this.a.B;
        C0090b bVar = C0090b.LINEAR_TIMEOUT;
        C3676c a3 = this.a.p.a();
        List list = null;
        if (!(a3 instanceof K)) {
            a3 = null;
        }
        K k = (K) a3;
        if (k != null) {
            list = k.d();
        }
        a2.a(bVar, list);
        this.a.o();
        this.a.s.c();
    }
}
