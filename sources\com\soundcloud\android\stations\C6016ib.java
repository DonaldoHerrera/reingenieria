package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.stations._a.c;

/* renamed from: com.soundcloud.android.stations.ib reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C6016ib<T> implements C6776kQa<T> {
    final /* synthetic */ C6034ob a;
    final /* synthetic */ C6051ub b;

    C6016ib(C6034ob obVar, C6051ub ubVar) {
        this.a = obVar;
        this.b = ubVar;
    }

    /* renamed from: a */
    public final void accept(c cVar) {
        this.a.p.a((J) K.a.g());
        this.a.l.a(cVar.b()).a((C7256rQa<? super T>) C6007fb.a).d((C7118pQa<? super T, ? extends MPa<? extends R>>) new C6010gb<Object,Object>(this, cVar)).d((C6776kQa<? super T>) new C6031nb<Object>(new C6013hb(this.b)));
    }
}
