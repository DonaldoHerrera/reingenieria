package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.Db.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikesSearchPresenter.kt */
final class G<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ K a;

    G(K k) {
        this.a = k;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(HVa<Integer, ? extends List<x>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        int intValue = ((Number) hVa.a()).intValue();
        List<x> list = (List) hVa.b();
        Db c = this.a.m;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (x b : list) {
            arrayList.add(this.a.a(b.b()));
        }
        return c.a(new a(arrayList, intValue, new PlaySessionSource(Yca.LIKES_SEARCH)));
    }
}
