package com.soundcloud.android.search;

/* compiled from: SearchResultsPresenter.kt */
final class S extends C7540vYa implements PXa<APa<d<? extends C6973nJa, ? extends I>>> {
    final /* synthetic */ Oca a;
    final /* synthetic */ T b;

    S(Oca oca, T t) {
        this.a = oca;
        this.b = t;
        super(0);
    }

    public final APa<d<C6973nJa, I>> d() {
        APa j = this.b.a.l.a(this.b.b.e(), this.a, this.b.b.a()).j();
        C7471uYa.a((Object) j, "searchOperations.nextPag….apiQuery).toObservable()");
        T t = this.b;
        return C7594wJa.a(j, t.a.c(t.b));
    }
}
