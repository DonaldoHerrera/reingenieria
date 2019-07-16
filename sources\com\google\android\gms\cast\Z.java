package com.google.android.gms.cast;

import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.a;
import androidx.mediarouter.media.h.g;

final class Z extends a {
    private final /* synthetic */ CastRemoteDisplayLocalService a;

    Z(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.a = castRemoteDisplayLocalService;
    }

    public final void f(h hVar, g gVar) {
        this.a.a("onRouteUnselected");
        if (this.a.j == null) {
            this.a.a("onRouteUnselected, no device was selected");
        } else if (!CastDevice.a(gVar.f()).i().equals(this.a.j.i())) {
            this.a.a("onRouteUnselected, device does not match");
        } else {
            CastRemoteDisplayLocalService.b();
        }
    }
}
