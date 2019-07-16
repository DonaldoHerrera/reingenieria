package com.google.android.gms.cast;

import com.google.android.gms.cast.CastRemoteDisplayLocalService.a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.cast.p reason: case insensitive filesystem */
final class C0683p implements Ry<Void> {
    private final /* synthetic */ CastRemoteDisplayLocalService a;

    C0683p(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.a = castRemoteDisplayLocalService;
    }

    public final void onComplete(Wy<Void> wy) {
        if (!wy.e()) {
            this.a.a("Unable to stop the remote display, result unsuccessful");
            if (this.a.g.get() != null) {
                ((a) this.a.g.get()).a(new Status(2202));
            }
        } else {
            this.a.a("remote display stopped");
        }
        this.a.k = null;
    }
}
