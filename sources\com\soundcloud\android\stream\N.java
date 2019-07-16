package com.soundcloud.android.stream;

import com.soundcloud.android.sync.na;
import java.util.Date;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class N<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ Date b;

    N(Z z, Date date) {
        this.a = z;
        this.b = date;
    }

    /* renamed from: a */
    public final IPa<List<C3919yda>> apply(List<C3919yda> list) {
        C7471uYa.b(list, "it");
        if (list.isEmpty()) {
            IPa<List<C3919yda>> a2 = this.a.b.b(na.SOUNDSTREAM, "com.soundcloud.android.sync.action.APPEND").a((C7118pQa<? super T, ? extends MPa<? extends R>>) new M<Object,Object>(this));
            C7471uYa.a((Object) a2, "syncOperations.sync(Sync…                        }");
            return a2;
        }
        IPa<List<C3919yda>> a3 = IPa.a(list);
        C7471uYa.a((Object) a3, "Single.just(it)");
        return a3;
    }
}
