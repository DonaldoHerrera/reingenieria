package com.soundcloud.android.search.suggestions.searchsuggestions;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.G.c;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* compiled from: SearchSuggestionsUniflowPresenter.kt */
final class h<T> implements C6776kQa<T> {
    final /* synthetic */ j a;
    final /* synthetic */ l b;

    h(j jVar, l lVar) {
        this.a = jVar;
        this.b = lVar;
    }

    /* renamed from: a */
    public final void accept(C7849zwa zwa) {
        this.b.Pa();
        C7366swa b2 = zwa.b();
        Yca yca = Yca.SEARCH_SUGGESTIONS;
        C3700b a2 = this.a.o;
        c cVar = G.a;
        C3508cda a3 = b2.a();
        String g = b2.g();
        String str = "suggestionItem.userQuery()";
        C7471uYa.a((Object) g, str);
        a2.a((J) cVar.a(yca, a3, g, zwa.a()));
        a b3 = this.a.n;
        C3508cda cda = C3508cda.a;
        String g2 = b2.g();
        C7471uYa.a((Object) g2, str);
        SearchQuerySourceInfo searchQuerySourceInfo = new SearchQuerySourceInfo(cda, g2, 0, null, null, 28, null);
        b3.a(yca, searchQuerySourceInfo).a((Wca) b2);
    }
}
