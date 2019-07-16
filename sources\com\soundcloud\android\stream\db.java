package com.soundcloud.android.stream;

/* compiled from: StreamPresenter.kt */
final class db extends C7540vYa implements PXa<APa<d<? extends C6973nJa, ? extends sb>>> {
    final /* synthetic */ APa a;
    final /* synthetic */ ib b;

    db(APa aPa, ib ibVar) {
        this.a = aPa;
        this.b = ibVar;
        super(0);
    }

    public final APa<d<C6973nJa, sb>> d() {
        APa<d<C6973nJa, sb>> h = this.a.h(new cb(this));
        C7471uYa.a((Object) h, "it.map { AsyncLoader.Pag…ccess(it, nextPage(it)) }");
        return h;
    }
}
