package com.soundcloud.android.settings;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: SettingsPresenter.kt */
final class N<T> implements C6776kQa<RVa> {
    final /* synthetic */ S a;

    N(S s) {
        this.a = s;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        if (this.a.c().b()) {
            C3700b b = this.a.b();
            Waa G = Waa.G();
            C7471uYa.a((Object) G, "UpgradeFunnelEvent.forOfflineSyncSettingsClick()");
            b.a((J) G);
            C4655rja d = this.a.d();
            C4621nja a2 = C4621nja.a(C3920yea.OFFLINE);
            C7471uYa.a((Object) a2, "NavigationTarget.forUpgrade(UpsellContext.OFFLINE)");
            d.a(a2);
            return;
        }
        C4655rja d2 = this.a.d();
        C4621nja a3 = C4621nja.a(true);
        C7471uYa.a((Object) a3, "NavigationTarget.forOfflineSettings(true)");
        d2.a(a3);
    }
}
