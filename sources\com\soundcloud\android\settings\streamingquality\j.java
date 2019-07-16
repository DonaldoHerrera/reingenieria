package com.soundcloud.android.settings.streamingquality;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: StreamingQualitySettingsPresenter.kt */
final class j extends C7540vYa implements _Xa<RVa, RVa> {
    final /* synthetic */ i a;
    final /* synthetic */ q b;

    j(i iVar, q qVar) {
        this.a = iVar;
        this.b = qVar;
        super(1);
    }

    public final void a(RVa rVa) {
        C3700b a2 = this.a.l;
        Zca zca = new Zca(this.b.Ta(), null, null, null, null, 30, null);
        a2.a(zca);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RVa) obj);
        return RVa.a;
    }
}
