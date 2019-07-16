package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.I;

/* renamed from: com.soundcloud.android.ads.pc reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C2612pc<T1, T2, T3, T4, R> implements C6912mQa<T1, T2, T3, T4, R> {
    public final R a(T1 t1, T2 t2, T3 t3, T4 t4) {
        Boolean bool = (Boolean) t4;
        C3422FZ fz = (C3422FZ) t3;
        Iaa iaa = (Iaa) t2;
        C3699a aVar = (C3699a) t1;
        C7471uYa.a((Object) fz, "adOverlayEvent");
        boolean z = fz.c() == 0;
        C7471uYa.a((Object) aVar, "event");
        boolean z2 = aVar.a() == 0;
        C7471uYa.a((Object) iaa, "playerUiEvent");
        boolean z3 = iaa.c() == 0;
        C3508cda b = fz.b();
        ca a = fz.a();
        I d = fz.d();
        C7471uYa.a((Object) bool, "isCommentsVisible");
        C2641xa xaVar = new C2641xa(z, z2, z3, b, a, d, bool.booleanValue());
        return xaVar;
    }
}
