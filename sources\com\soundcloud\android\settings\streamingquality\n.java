package com.soundcloud.android.settings.streamingquality;

import com.soundcloud.android.foundation.events.J;

/* compiled from: StreamingQualitySettingsPresenter.kt */
final class n extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ i a;

    n(i iVar) {
        this.a = iVar;
        super(0);
    }

    public final void d() {
        i iVar = this.a;
        Waa m = Waa.m();
        C7471uYa.a((Object) m, "UpgradeFunnelEvent.forAutoQualityStreamingClick()");
        iVar.a((J) m);
    }
}
