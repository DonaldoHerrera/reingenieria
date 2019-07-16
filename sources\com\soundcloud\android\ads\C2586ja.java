package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: com.soundcloud.android.ads.ja reason: case insensitive filesystem */
/* compiled from: AdErrorTrackingManager.kt */
public class C2586ja {
    private final Na a;
    private final C3700b b;
    private final Yaa c;

    public C2586ja(Na na, C3700b bVar, Yaa yaa) {
        C7471uYa.b(na, "adsOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        this.a = na;
        this.b = bVar;
        this.c = yaa;
    }

    public C3700b a() {
        return this.b;
    }

    public Yaa b() {
        return this.c;
    }

    public void a(C0090b bVar, List<Y> list) {
        C7471uYa.b(bVar, "errorCode");
        if (!(list == null || list.isEmpty())) {
            a().a((J) new C3413CZ(b().a(list, bVar)));
        }
    }
}
