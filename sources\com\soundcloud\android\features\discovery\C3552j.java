package com.soundcloud.android.features.discovery;

import java.util.List;

/* renamed from: com.soundcloud.android.features.discovery.j reason: case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C3552j<T1, T2, R> implements C6504gQa<T1, T2, R> {
    final /* synthetic */ C3551i a;

    public C3552j(C3551i iVar) {
        this.a = iVar;
    }

    public final R apply(T1 t1, T2 t2) {
        List list = (List) t2;
        RVa rVa = (RVa) t1;
        C3551i iVar = this.a;
        C7471uYa.a((Object) list, "second");
        return NVa.a(rVa, iVar.a(list));
    }
}
