package com.soundcloud.android.comments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: CommentsPresenter.kt */
final class V<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ W a;
    final /* synthetic */ C b;

    V(W w, C c) {
        this.a = w;
        this.b = c;
    }

    /* renamed from: a */
    public final APa<T> apply(C3508cda cda) {
        C7471uYa.b(cda, "loggedInUser");
        List<C3791ida> a2 = this.b.a();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C3791ida b2 : a2) {
            arrayList.add(b2.b());
        }
        return APa.a((EPa<? extends T1>) this.a.b.a((Iterable<C3508cda>) C7676xWa.a((Collection) arrayList, (Object) cda)), (EPa<? extends T2>) this.a.a(), (C6504gQa<? super T1, ? super T2, ? extends R>) new U<Object,Object,Object>(this, cda));
    }
}
