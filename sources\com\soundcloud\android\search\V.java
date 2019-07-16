package com.soundcloud.android.search;

/* compiled from: SearchResultsPresenter.kt */
final class V extends C7540vYa implements C6376eYa<SearchFragmentArgs, I, Boolean, RVa> {
    final /* synthetic */ C5903ha a;

    V(C5903ha haVar) {
        this.a = haVar;
        super(3);
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        a((SearchFragmentArgs) obj, (I) obj2, ((Boolean) obj3).booleanValue());
        return RVa.a;
    }

    public final void a(SearchFragmentArgs searchFragmentArgs, I i, boolean z) {
        C7471uYa.b(searchFragmentArgs, "pageParams");
        C7471uYa.b(i, "result");
        this.a.m.a(searchFragmentArgs.e(), i.d());
        if (z) {
            this.a.m.b(searchFragmentArgs.e());
        }
    }
}
