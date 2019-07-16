package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.stations._a.b;

/* renamed from: com.soundcloud.android.stations.eb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C6004eb<T> implements C6776kQa<T> {
    final /* synthetic */ C6034ob a;
    final /* synthetic */ C6051ub b;

    C6004eb(C6034ob obVar, C6051ub ubVar) {
        this.a = obVar;
        this.b = ubVar;
    }

    /* renamed from: a */
    public final void accept(b bVar) {
        this.a.p.a((J) K.a.g());
        this.a.l.a(bVar.b()).a((C7256rQa<? super T>) C5995bb.a).d((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5998cb<Object,Object>(this, bVar)).d((C6776kQa<? super T>) new C6031nb<Object>(new C6001db(this.b)));
    }
}
