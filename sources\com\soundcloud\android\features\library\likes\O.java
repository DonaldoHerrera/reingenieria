package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.S;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Observables.kt */
public final class O<T1, T2, R> implements C6504gQa<T1, T2, R> {
    final /* synthetic */ z a;
    final /* synthetic */ List b;

    public O(z zVar, List list) {
        this.a = zVar;
        this.b = list;
    }

    public final R apply(T1 t1, T2 t2) {
        C3823mda mda = (C3823mda) t2;
        boolean booleanValue = ((Boolean) t1).booleanValue();
        S s = new S(this.b.size(), false, this.a.o.l(), booleanValue, mda, this.a.o.b(), false, this.a.b(mda), this.a.a(mda), 66, null);
        List a2 = C6850lWa.a(s);
        List<C6185ma> list = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6185ma v : list) {
            arrayList.add(new V(v));
        }
        return C7676xWa.c((Collection) a2, (Iterable) arrayList);
    }
}
