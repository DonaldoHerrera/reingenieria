package com.soundcloud.android.search.suggestions.searchsuggestions;

/* compiled from: SearchSuggestionsUniflowPresenter.kt */
final class f<T> implements C6776kQa<T> {
    final /* synthetic */ l a;

    f(l lVar) {
        this.a = lVar;
    }

    /* renamed from: a */
    public final void accept(C7433tva tva) {
        a a2 = tva.a();
        l lVar = this.a;
        String g = a2.g();
        C7471uYa.a((Object) g, "autocompletionItem.userQuery()");
        String h = a2.h();
        C7471uYa.a((Object) h, "autocompletionItem.apiQuery()");
        C4928GKa j = a2.j();
        C7471uYa.a((Object) j, "autocompletionItem.queryUrn()");
        C4928GKa c = C4928GKa.c(Integer.valueOf(tva.b()));
        C7471uYa.a((Object) c, "Optional.of(it.position)");
        lVar.a(g, h, j, c);
    }
}
