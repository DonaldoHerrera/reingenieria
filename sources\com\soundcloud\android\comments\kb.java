package com.soundcloud.android.comments;

/* compiled from: TrackCommentOperations.kt */
final class kb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ gb a;
    final /* synthetic */ C3509cea b;

    kb(gb gbVar, C3509cea cea) {
        this.a = gbVar;
        this.b = cea;
    }

    /* renamed from: a */
    public final IPa<Db> apply(Pca<C2873b> pca) {
        C7471uYa.b(pca, "threads");
        return this.a.e.a(this.a.b(pca)).e(new jb(this, pca));
    }
}
