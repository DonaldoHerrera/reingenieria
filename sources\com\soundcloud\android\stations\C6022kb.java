package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.q;

/* renamed from: com.soundcloud.android.stations.kb reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C6022kb<T1, T2, R> implements C6504gQa<T1, T2, R> {
    final /* synthetic */ C6034ob a;

    public C6022kb(C6034ob obVar) {
        this.a = obVar;
    }

    public final R apply(T1 t1, T2 t2) {
        q qVar = (q) t2;
        Pb pb = (Pb) t1;
        C6054vb d = this.a.m;
        C7471uYa.a((Object) pb, "domainModel2");
        return d.a(pb, qVar);
    }
}
