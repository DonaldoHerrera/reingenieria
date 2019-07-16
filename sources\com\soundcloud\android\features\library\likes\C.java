package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikesPresenter.kt */
final class C<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ z a;

    C(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(List<V> list) {
        C7471uYa.b(list, "itemList");
        Db d = this.a.u;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (V b : list) {
            arrayList.add(b.b().a());
        }
        return d.b((List<C3508cda>) arrayList, 0, new PlaySessionSource(Yca.LIKES));
    }
}
