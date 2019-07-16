package com.soundcloud.android.comments;

import java.util.List;

/* compiled from: TrackCommentOperations.kt */
final class jb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ kb a;
    final /* synthetic */ Pca b;

    jb(kb kbVar, Pca pca) {
        this.a = kbVar;
        this.b = pca;
    }

    /* renamed from: a */
    public final Db apply(Iterable<C3776gea> iterable) {
        C4928GKa gKa;
        C7471uYa.b(iterable, "it");
        kb kbVar = this.a;
        C3509cea cea = kbVar.b;
        gb gbVar = kbVar.a;
        Pca pca = this.b;
        String str = "threads";
        C7471uYa.a((Object) pca, str);
        List a2 = gbVar.a(pca);
        Pca pca2 = this.b;
        C7471uYa.a((Object) pca2, str);
        C4928GKa h = pca2.h();
        C7471uYa.a((Object) h, "threads.nextLink");
        if (h.c()) {
            Oca oca = (Oca) h.b();
            kb kbVar2 = this.a;
            gKa = C4928GKa.b(kbVar2.a.a(kbVar2.b, oca.a()));
            C7471uYa.a((Object) gKa, "Optional.fromNullable(mapper(get()))");
        } else {
            gKa = C4928GKa.a();
            C7471uYa.a((Object) gKa, "Optional.absent()");
        }
        return new Db(cea, a2, (IPa) gKa.d());
    }
}
