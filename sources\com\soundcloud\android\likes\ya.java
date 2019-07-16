package com.soundcloud.android.likes;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.Db.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class ya<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ ma a;

    ya(ma maVar) {
        this.a = maVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(HVa<Integer, ? extends List<V>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        int intValue = ((Number) hVa.a()).intValue();
        List<V> list = (List) hVa.b();
        Db d = this.a.s;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (V a2 : list) {
            arrayList.add(this.a.a(a2));
        }
        return d.a(new a(arrayList, intValue - 1, new PlaySessionSource(Yca.LIKES)));
    }
}
