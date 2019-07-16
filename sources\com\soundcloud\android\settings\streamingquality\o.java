package com.soundcloud.android.settings.streamingquality;

import com.soundcloud.android.foundation.events.J;

/* compiled from: StreamingQualitySettingsPresenter.kt */
final class o extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ i a;

    o(i iVar) {
        this.a = iVar;
        super(0);
    }

    public final void d() {
        i iVar = this.a;
        Waa C = Waa.C();
        C7471uYa.a((Object) C, "UpgradeFunnelEvent.forHighQualityStreamingClick()");
        iVar.a((J) C);
    }
}
