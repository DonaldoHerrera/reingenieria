package com.soundcloud.android.ads;

import com.krux.androidsdk.aggregator.b;

/* renamed from: com.soundcloud.android.ads.zb reason: case insensitive filesystem */
/* compiled from: KruxSegmentProvider.kt */
final class C2650zb implements b {
    final /* synthetic */ Ab a;

    C2650zb(Ab ab) {
        this.a = ab;
    }

    public final void a(String str) {
        C4928GKa gKa;
        Ab ab = this.a;
        if (str == null || str.length() == 0) {
            gKa = C4928GKa.a();
        } else {
            gKa = C4928GKa.c(str);
        }
        ab.b = gKa;
    }
}
