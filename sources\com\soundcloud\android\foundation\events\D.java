package com.soundcloud.android.foundation.events;

import com.soundcloud.android.foundation.events.C.a;
import com.soundcloud.android.foundation.events.C.a.C0091a;
import com.soundcloud.android.foundation.events.C.a.b;

/* compiled from: RepostsStatusEvent.kt */
public final class D {
    public static final C a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        return new C(KWa.a(NVa.a(cda, new C0091a(cda, null, 2, null))));
    }

    public static final C b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        return new C(KWa.a(NVa.a(cda, new b(cda, null, 2, null))));
    }

    public static final C a(a aVar) {
        C7471uYa.b(aVar, "repost");
        return new C(KWa.a(NVa.a(aVar.b(), aVar)));
    }
}
