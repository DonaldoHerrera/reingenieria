package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3676c;

/* renamed from: com.soundcloud.android.ads.ab reason: case insensitive filesystem */
/* compiled from: AdsOperations.kt */
final class C2545ab<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    public static final C2545ab a = new C2545ab();

    C2545ab() {
    }

    /* renamed from: a */
    public final C7531vPa<C3676c> apply(C2615qb qbVar) {
        C7471uYa.b(qbVar, "apiPrestitial");
        C4928GKa l = qbVar.l();
        C7471uYa.a((Object) l, "adData");
        return l.c() ? C7531vPa.c(l.b()) : C7531vPa.c();
    }
}
