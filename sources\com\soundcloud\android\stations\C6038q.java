package com.soundcloud.android.stations;

import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.stations.q reason: case insensitive filesystem */
/* compiled from: ApiStation */
class C6038q implements Function<Yda, Tda> {
    final /* synthetic */ r a;

    C6038q(r rVar) {
        this.a = rVar;
    }

    /* renamed from: a */
    public Tda apply(Yda yda) {
        return new Tda(yda.w(), this.a.d);
    }
}
