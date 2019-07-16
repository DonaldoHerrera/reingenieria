package com.soundcloud.android.playback.ui.view;

import java.util.Set;

/* compiled from: Observables.kt */
public final class p<T1, T2, T3, R> implements C6844lQa<T1, T2, T3, R> {
    final /* synthetic */ n a;

    public p(n nVar) {
        this.a = nVar;
    }

    public final R a(T1 t1, T2 t2, T3 t3) {
        Set set = (Set) t2;
        Nna nna = (Nna) t1;
        if (!((Boolean) t3).booleanValue()) {
            return Tl.b;
        }
        n nVar = this.a;
        C7471uYa.a((Object) set, "comments");
        C7471uYa.a((Object) nna, "playbackState");
        return nVar.a(set, nna);
    }
}
