package com.soundcloud.android.features.library.artists;

/* compiled from: ArtistsPresenter.kt */
final class n extends C7540vYa implements PXa<APa<d<? extends C6973nJa, ? extends C2189NP<C4954HFa>>>> {
    final /* synthetic */ String a;
    final /* synthetic */ o b;

    n(String str, o oVar) {
        this.a = str;
        this.b = oVar;
        super(0);
    }

    public final APa<d<C6973nJa, C2189NP<C4954HFa>>> d() {
        o oVar = this.b;
        String str = this.a;
        C7471uYa.a((Object) str, "it");
        APa j = oVar.a(str).j();
        C7471uYa.a((Object) j, "nextPageFunction(it).toObservable()");
        return C7594wJa.a(j, new m(this));
    }
}
