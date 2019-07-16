package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.PlaybackItem;

/* compiled from: PlaybackItemOperations.kt */
final class Rb<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ Qb a;
    final /* synthetic */ long b;
    final /* synthetic */ C3508cda c;

    Rb(Qb qb, long j, C3508cda cda) {
        this.a = qb;
        this.b = j;
        this.c = cda;
    }

    /* renamed from: a */
    public final C7531vPa<? extends PlaybackItem> apply(Pda<C3509cea> pda) {
        Ka ka;
        C7471uYa.b(pda, "response");
        if (pda instanceof b) {
            return this.a.b((C3509cea) ((b) pda).a(), this.b);
        }
        if (pda instanceof a) {
            return this.a.b((C3509cea) ((a) pda).a(), this.b);
        }
        if (pda instanceof c) {
            c cVar = (c) pda;
            if (cVar.a() != null) {
                C3508cda cda = this.c;
                Kda a2 = cVar.a();
                if (a2 != null) {
                    ka = new Ka(cda, a2);
                } else {
                    throw new OVa("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                }
            } else {
                ka = new Ka(this.c);
            }
            C7531vPa<? extends PlaybackItem> a3 = C7531vPa.a((Throwable) ka);
            C7471uYa.a((Object) a3, "Maybe.error(exception)");
            return a3;
        }
        throw new FVa();
    }
}
