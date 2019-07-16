package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaybackInitiator.kt */
final class Fb<T, R> implements C7118pQa<T, R> {
    public static final Fb a = new Fb();

    Fb() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<? extends u> list) {
        C7471uYa.b(list, "it");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (u b : list) {
            arrayList.add(b.b());
        }
        return arrayList;
    }
}
