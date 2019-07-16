package com.soundcloud.android.settings.offline;

import com.soundcloud.android.foundation.events.J;

/* compiled from: OfflineSettingsPresenter.kt */
final class A extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ n a;
    final /* synthetic */ H b;

    A(n nVar, H h) {
        this.a = nVar;
        this.b = h;
        super(1);
    }

    public final void a(RVa rVa) {
        if (this.a.f.j()) {
            this.b.qb();
            return;
        }
        this.a.f.e().a((KPa<? super T>) C5606ava.b(this.a.h, null, 1, null));
        n nVar = this.a;
        C3924zaa c = C3924zaa.c(Yca.SETTINGS_OFFLINE.a());
        C7471uYa.a((Object) c, "OfflineInteractionEvent.…n.SETTINGS_OFFLINE.get())");
        nVar.a((J) c);
        this.a.c();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
