package com.soundcloud.android.settings.offline;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.offline.OfflineContentService;

/* compiled from: OfflineSettingsPresenter.kt */
final class C extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ n a;

    C(n nVar) {
        this.a = nVar;
        super(1);
    }

    public final void a(RVa rVa) {
        boolean l = this.a.e.l();
        this.a.e.b(!l);
        n nVar = this.a;
        C3924zaa a2 = C3924zaa.a(!l);
        C7471uYa.a((Object) a2, "OfflineInteractionEvent.…oggle(!isWifiOnlyEnabled)");
        nVar.a((J) a2);
        if (!l) {
            OfflineContentService.a(this.a.c);
        }
        this.a.c();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
