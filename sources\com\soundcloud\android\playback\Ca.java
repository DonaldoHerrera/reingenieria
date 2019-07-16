package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Ba.a;
import com.soundcloud.android.playback.Ba.b;

/* compiled from: LocalPlayStateFactory.kt */
public final class Ca {
    public static final Ca a = new Ca();

    private Ca() {
    }

    public final Ba a(Hla hla, boolean z, String str) {
        C7471uYa.b(hla, "playerStateChangeEvent");
        String str2 = str;
        C7471uYa.b(str2, "playId");
        a aVar = Ba.b;
        C3508cda a2 = Tma.a(hla.d());
        Kla e = hla.e();
        Jla c = hla.c();
        long g = hla.g();
        long a3 = hla.a();
        long a4 = hla.d().a();
        b bVar = new b(C4313gd.c(hla.h()), hla.f(), hla.h().b(), C4313gd.b(hla.h()), C4313gd.d(hla.h()), C4313gd.a(hla.h()));
        return aVar.a(a2, e, c, g, a3, a4, bVar, z, str2);
    }
}
