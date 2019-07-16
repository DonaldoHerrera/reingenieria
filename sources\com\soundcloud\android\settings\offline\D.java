package com.soundcloud.android.settings.offline;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;
import com.soundcloud.android.settings.streamingquality.e.b.c;

/* compiled from: OfflineSettingsPresenter.kt */
final class D extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ n a;

    D(n nVar) {
        this.a = nVar;
        super(1);
    }

    public final void a(RVa rVa) {
        if (this.a.i.d()) {
            String str = "OfflineInteractionEvent.…n.SETTINGS_OFFLINE.get())";
            if (this.a.n.b() instanceof C0171b) {
                n nVar = this.a;
                C3924zaa b = C3924zaa.b(Yca.SETTINGS_OFFLINE.a());
                C7471uYa.a((Object) b, str);
                nVar.a((J) b);
                this.a.n.a(c.a);
                return;
            }
            n nVar2 = this.a;
            C3924zaa d = C3924zaa.d(Yca.SETTINGS_OFFLINE.a());
            C7471uYa.a((Object) d, str);
            nVar2.a((J) d);
            this.a.n.a(C0171b.a);
        } else if (this.a.i.t()) {
            n nVar3 = this.a;
            Waa A = Waa.A();
            C7471uYa.a((Object) A, "UpgradeFunnelEvent.forHi…QualityOfflineSyncClick()");
            nVar3.a((J) A);
            C4655rja e = this.a.m;
            C4621nja a2 = C4621nja.a(C3920yea.HIGH_QUALITY_STREAMING);
            C7471uYa.a((Object) a2, "NavigationTarget.forUpgr…t.HIGH_QUALITY_STREAMING)");
            e.a(a2);
        } else {
            SDb.b("User selected Download HQ setting but are they don't have access to the feature nor can receive the upsell!", new Object[0]);
            a.a(this.a.j, new a(), null, 2, null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
