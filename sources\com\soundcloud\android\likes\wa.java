package com.soundcloud.android.likes;

import java.util.Collection;
import java.util.List;

/* compiled from: Observables.kt */
public final class wa<T1, T2, T3, R> implements C6844lQa<T1, T2, T3, R> {
    final /* synthetic */ ma a;
    final /* synthetic */ T b;

    public wa(ma maVar, T t) {
        this.a = maVar;
        this.b = t;
    }

    public final R a(T1 t1, T2 t2, T3 t3) {
        C3823mda mda = (C3823mda) t3;
        boolean booleanValue = ((Boolean) t2).booleanValue();
        List list = (List) t1;
        S s = new S(this.b.b(), false, this.a.o.l(), booleanValue, mda, this.a.o.b(), false, this.a.b(mda), this.a.a(mda), 66, null);
        List a2 = C6850lWa.a(s);
        C7471uYa.a((Object) list, "trackLikeItems");
        return C7676xWa.c((Collection) a2, (Iterable) list);
    }
}
