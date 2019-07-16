package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.playqueue.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StreamPresenter.kt */
final class hb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ List a;

    hb(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final IPa<List<u>> apply(List<r> list) {
        C7471uYa.b(list, "storageStream");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            long a2 = ((r) it.next()).a();
            Long c = ((C6109va) C7676xWa.h(this.a)).c();
            if (c != null && a2 == c.longValue()) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= list.size()) {
            return IPa.a(C6918mWa.a());
        }
        List<r> subList = list.subList(i + 1, list.size());
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) subList, 10));
        for (r b : subList) {
            arrayList.add(b.b());
        }
        return IPa.a(arrayList);
    }
}
