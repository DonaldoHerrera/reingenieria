package com.soundcloud.android.ads.data;

import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.ads.C3691s.b;
import com.soundcloud.android.foundation.ads.aa.a;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoAdStorage.kt */
final class s implements C6368eQa {
    final /* synthetic */ t a;
    final /* synthetic */ C3686m b;
    final /* synthetic */ long c;

    s(t tVar, C3686m mVar, long j) {
        this.a = tVar;
        this.b = mVar;
        this.c = j;
    }

    public final void run() {
        Integer num;
        a q = this.b.q();
        if (q != null) {
            num = Integer.valueOf(q.i());
        } else {
            b m = this.b.m();
            num = m != null ? m.b() : null;
        }
        if (num != null) {
            int intValue = num.intValue();
            v d = this.a.b;
            h hVar = new h(this.b.q(), this.b.m(), this.c + TimeUnit.MINUTES.toMillis((long) intValue), this.a.a.b());
            d.b(hVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No expiryInMins provided for an ad ");
        sb.append(this.b);
        throw new C2557a(sb.toString());
    }
}
