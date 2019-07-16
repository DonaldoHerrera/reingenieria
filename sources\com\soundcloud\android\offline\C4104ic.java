package com.soundcloud.android.offline;

import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.offline.ic reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4104ic<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4110jc a;
    final /* synthetic */ C3508cda b;

    C4104ic(C4110jc jcVar, C3508cda cda) {
        this.a = jcVar;
        this.b = cda;
    }

    /* renamed from: a */
    public final IPa<C3508cda> apply(Long l) {
        C7471uYa.b(l, "it");
        return this.a.a.k.a((Iterable<C3508cda>) C6850lWa.a(this.b)).b((Callable<? extends T>) new C4098hc<Object>(this));
    }
}
