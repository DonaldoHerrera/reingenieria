package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.dc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4074dc<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Vb a;

    C4074dc(Vb vb) {
        this.a = vb;
    }

    /* renamed from: a */
    public final IPa<C3508cda> apply(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        return this.a.a(cda).c((C6776kQa<? super T>) new C4062bc<Object>(this)).a((C6776kQa<? super Throwable>) new C4068cc<Object>(this, cda));
    }
}
