package com.soundcloud.android.settings.offline;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.offline.OfflineContentService;

/* compiled from: OfflineSettingsPresenter.kt */
final class v extends C7540vYa implements _Xa<J, RVa> {
    final /* synthetic */ n a;
    final /* synthetic */ H b;

    v(n nVar, H h) {
        this.a = nVar;
        this.b = h;
        super(1);
    }

    public final void a(J j) {
        if (j.b()) {
            this.b.Db();
            n nVar = this.a;
            C3924zaa o = C3924zaa.o();
            C7471uYa.a((Object) o, "OfflineInteractionEvent.…ageBelowLimitImpression()");
            nVar.a((J) o);
        }
        if (j.a() == Long.MAX_VALUE) {
            this.a.e.o();
        } else {
            this.a.e.a(j.a());
        }
        OfflineContentService.a(this.a.c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((J) obj);
        return RVa.a;
    }
}
