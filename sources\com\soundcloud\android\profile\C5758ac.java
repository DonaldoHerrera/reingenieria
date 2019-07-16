package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.ac reason: case insensitive filesystem */
/* compiled from: UserListPresenter.kt */
final class C5758ac extends C7540vYa implements PXa<APa<d<? extends C6973nJa, ? extends C2189NP<C4954HFa>>>> {
    final /* synthetic */ String a;
    final /* synthetic */ C5768cc b;

    C5758ac(String str, C5768cc ccVar) {
        this.a = str;
        this.b = ccVar;
        super(0);
    }

    public final APa<d<C6973nJa, C2189NP<C4954HFa>>> d() {
        C5768cc ccVar = this.b;
        String str = this.a;
        C7471uYa.a((Object) str, "it");
        APa j = ccVar.a(str).j();
        C7471uYa.a((Object) j, "nextPageFunction(it).toObservable()");
        return ccVar.a(j);
    }
}
