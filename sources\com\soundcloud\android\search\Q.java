package com.soundcloud.android.search;

/* compiled from: SearchResultsPresenter.kt */
final class Q extends C7540vYa implements _Xa<I, RVa> {
    final /* synthetic */ C5903ha a;
    final /* synthetic */ SearchFragmentArgs b;

    Q(C5903ha haVar, SearchFragmentArgs searchFragmentArgs) {
        this.a = haVar;
        this.b = searchFragmentArgs;
        super(1);
    }

    public final void a(I i) {
        C5903ha haVar = this.a;
        SearchFragmentArgs searchFragmentArgs = this.b;
        C7471uYa.a((Object) i, "it");
        haVar.a(searchFragmentArgs, i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((I) obj);
        return RVa.a;
    }
}
