package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3677d;

/* renamed from: com.soundcloud.android.ads.ib reason: case insensitive filesystem */
/* compiled from: AdsTimerController.kt */
final class C2583ib<T> implements C7733yKa<C3676c> {
    final /* synthetic */ C2587jb a;

    C2583ib(C2587jb jbVar) {
        this.a = jbVar;
    }

    /* renamed from: a */
    public final void accept(C3676c cVar) {
        if (!(cVar instanceof C3677d)) {
            cVar = null;
        }
        C3677d dVar = (C3677d) cVar;
        if (dVar != null) {
            Long a2 = dVar.a();
            if (a2 != null) {
                this.a.c.a(a2.longValue());
            }
        }
    }
}
