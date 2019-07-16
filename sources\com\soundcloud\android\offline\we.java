package com.soundcloud.android.offline;

import com.soundcloud.android.offline.ve.a;

/* compiled from: StrictSSLHttpClient.kt */
public final class we {
    private final C4806CMa<C7440tyb> a;
    private final Qb b;

    public we(@ye C4806CMa<C7440tyb> cMa, Qb qb) {
        C7471uYa.b(cMa, "noRedirectsHttpClient");
        C7471uYa.b(qb, "downloadLogger");
        this.a = cMa;
        this.b = qb;
    }

    public final ve a(a aVar) {
        C7471uYa.b(aVar, "requestHelper");
        return new ve(this.a, aVar, this.b);
    }
}
