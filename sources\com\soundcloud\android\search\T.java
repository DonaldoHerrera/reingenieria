package com.soundcloud.android.search;

/* compiled from: SearchResultsPresenter.kt */
final class T extends C7540vYa implements _Xa<I, PXa<? extends APa<d<? extends C6973nJa, ? extends I>>>> {
    final /* synthetic */ C5903ha a;
    final /* synthetic */ SearchFragmentArgs b;

    T(C5903ha haVar, SearchFragmentArgs searchFragmentArgs) {
        this.a = haVar;
        this.b = searchFragmentArgs;
        super(1);
    }

    /* renamed from: a */
    public final PXa<APa<d<C6973nJa, I>>> invoke(I i) {
        C7471uYa.b(i, "it");
        Oca b2 = i.b();
        if (b2 != null) {
            return new S(b2, this);
        }
        return null;
    }
}
