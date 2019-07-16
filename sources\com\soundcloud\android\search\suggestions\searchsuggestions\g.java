package com.soundcloud.android.search.suggestions.searchsuggestions;

/* compiled from: SearchSuggestionsUniflowPresenter.kt */
final class g<T> implements C6776kQa<T> {
    final /* synthetic */ l a;

    g(l lVar) {
        this.a = lVar;
    }

    /* renamed from: a */
    public final void accept(C7433tva tva) {
        a a2 = tva.a();
        l lVar = this.a;
        String h = a2.h();
        C7471uYa.a((Object) h, "autocompletionItem.apiQuery()");
        String g = a2.g();
        C7471uYa.a((Object) g, "autocompletionItem.userQuery()");
        String i = a2.i();
        C7471uYa.a((Object) i, "autocompletionItem.output()");
        C4928GKa j = a2.j();
        C7471uYa.a((Object) j, "autocompletionItem.queryUrn()");
        lVar.a(h, g, i, j, tva.b());
    }
}
