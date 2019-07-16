package com.soundcloud.android.settings.offline;

import com.soundcloud.android.foundation.events.J;

/* compiled from: OfflineSettingsPresenter.kt */
final class u extends C7540vYa implements _Xa<Boolean, RVa> {
    final /* synthetic */ n a;

    u(n nVar) {
        this.a = nVar;
        super(1);
    }

    public final void a(Boolean bool) {
        n nVar = this.a;
        C3924zaa f = C3924zaa.f(Yca.SETTINGS_OFFLINE.a());
        C7471uYa.a((Object) f, "OfflineInteractionEvent.…n.SETTINGS_OFFLINE.get())");
        nVar.a((J) f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Boolean) obj);
        return RVa.a;
    }
}
