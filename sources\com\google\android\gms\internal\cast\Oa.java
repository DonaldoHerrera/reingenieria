package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.a;
import androidx.mediarouter.media.h.g;
import com.google.android.gms.common.internal.Preconditions;

public final class Oa extends a {
    private static final C0710ia a = new C0710ia("MediaRouterCallback");
    private final Ma b;

    public Oa(Ma ma) {
        Preconditions.checkNotNull(ma);
        this.b = ma;
    }

    public final void a(h hVar, g gVar, int i) {
        try {
            this.b.a(gVar.h(), gVar.f(), i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteUnselected", Ma.class.getSimpleName());
        }
    }

    public final void b(h hVar, g gVar) {
        try {
            this.b.c(gVar.h(), gVar.f());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteChanged", Ma.class.getSimpleName());
        }
    }

    public final void d(h hVar, g gVar) {
        try {
            this.b.b(gVar.h(), gVar.f());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteRemoved", Ma.class.getSimpleName());
        }
    }

    public final void e(h hVar, g gVar) {
        try {
            this.b.a(gVar.h(), gVar.f());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteSelected", Ma.class.getSimpleName());
        }
    }

    public final void a(h hVar, g gVar) {
        try {
            this.b.d(gVar.h(), gVar.f());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteAdded", Ma.class.getSimpleName());
        }
    }
}
