package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class Q<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ia c;

    Q(Z z, boolean z2, ia iaVar) {
        this.a = z;
        this.b = z2;
        this.c = iaVar;
    }

    /* renamed from: a */
    public final APa<sb> apply(List<C3919yda> list) {
        APa aPa;
        C7471uYa.b(list, "streamEntities");
        _Ua _ua = _Ua.a;
        APa b2 = this.a.b(list);
        if (!this.c.g() || this.b) {
            aPa = APa.c(Integer.valueOf(0));
            C7471uYa.a((Object) aPa, "Observable.just(0)");
        } else {
            aPa = this.a.e(list);
        }
        return APa.a((EPa<? extends T1>) b2, (EPa<? extends T2>) aPa, (C6504gQa<? super T1, ? super T2, ? extends R>) new P<Object,Object,Object>());
    }
}
