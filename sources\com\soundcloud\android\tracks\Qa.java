package com.soundcloud.android.tracks;

import java.util.Date;
import java.util.List;

/* compiled from: TrackPolicyStorage.kt */
final class Qa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Pa a;
    final /* synthetic */ Date b;

    Qa(Pa pa, Date date) {
        this.a = pa;
        this.b = date;
    }

    /* renamed from: a */
    public final IPa<C5631bLa> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.a.a(this.a.b(C7676xWa.t(list), this.b)).p();
    }
}
