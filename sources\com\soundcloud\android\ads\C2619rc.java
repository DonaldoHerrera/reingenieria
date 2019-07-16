package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.playqueue.k;

/* renamed from: com.soundcloud.android.ads.rc reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C2619rc<T1, T2, T3, T4, T5, R> implements C6980nQa<T1, T2, T3, T4, T5, R> {
    final /* synthetic */ C2568ec a;

    public C2619rc(C2568ec ecVar) {
        this.a = ecVar;
    }

    public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        C3508cda cda = (C3508cda) t5;
        Boolean bool = (Boolean) t4;
        Iaa iaa = (Iaa) t3;
        k kVar = (k) t2;
        C3699a aVar = (C3699a) t1;
        C2568ec ecVar = this.a;
        C7471uYa.a((Object) kVar, "currentItemEvent");
        C7471uYa.a((Object) aVar, "event");
        C7471uYa.a((Object) iaa, "playerUIEvent");
        C7471uYa.a((Object) bool, "isCommentsVisible");
        return ecVar.a(cda, kVar, aVar, iaa, bool.booleanValue());
    }
}
