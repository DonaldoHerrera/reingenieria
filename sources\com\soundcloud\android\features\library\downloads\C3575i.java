package com.soundcloud.android.features.library.downloads;

import java.util.List;

/* renamed from: com.soundcloud.android.features.library.downloads.i reason: case insensitive filesystem */
/* compiled from: DownloadsDataSource.kt */
final class C3575i<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3577k a;

    C3575i(C3577k kVar) {
        this.a = kVar;
    }

    /* renamed from: a */
    public final APa<List<s>> apply(List<C7843zta> list) {
        C7471uYa.b(list, "playlistPosts");
        C3577k kVar = this.a;
        APa d = _Ua.a.a(kVar.e(), this.a.c()).d().k(new C3574h(this, list)).d();
        C7471uYa.a((Object) d, "Observables.combineLates…  .distinctUntilChanged()");
        return kVar.a(d);
    }
}
