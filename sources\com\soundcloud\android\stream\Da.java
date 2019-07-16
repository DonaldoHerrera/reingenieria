package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.playqueue.u;
import java.util.Collection;
import java.util.List;

/* compiled from: Singles.kt */
public final class Da<T1, T2, R> implements C6504gQa<List<? extends u>, List<? extends u>, R> {
    public final R apply(List<? extends u> list, List<? extends u> list2) {
        List list3 = list2;
        List list4 = list;
        C7471uYa.a((Object) list4, "visibleList");
        C7471uYa.a((Object) list3, "extraInStorage");
        return C7676xWa.c((Collection) list4, (Iterable) list3);
    }
}
