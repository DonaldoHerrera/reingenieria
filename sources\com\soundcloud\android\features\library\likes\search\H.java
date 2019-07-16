package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.G.a;
import com.soundcloud.android.foundation.events.G.c;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.List;

/* compiled from: TrackLikesSearchPresenter.kt */
final class H<T1, T2, R> implements C6504gQa<String, HVa<? extends Integer, ? extends List<? extends x>>, G> {
    public static final H a = new H();

    H() {
    }

    /* renamed from: a */
    public final G apply(String str, HVa<Integer, ? extends List<x>> hVa) {
        C7471uYa.b(str, "query");
        C7471uYa.b(hVa, "pair");
        C3508cda a2 = ((x) ((List) hVa.d()).get(((Number) hVa.c()).intValue())).c().a();
        C7471uYa.a((Object) a2, "pair.second[pair.first].trackItem.urn");
        c cVar = G.a;
        Yca yca = Yca.LIKES_SEARCH;
        SearchQuerySourceInfo searchQuerySourceInfo = new SearchQuerySourceInfo(null, str, 0, a2, null, 21, null);
        return c.a(cVar, yca, searchQuerySourceInfo, a.ITEM_NAVIGATION, null, 8, null);
    }
}
