package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.cast.C0710ia;

@ShowFirstParty
public final class E {
    private static final C0710ia a = new C0710ia("DiscoveryManager");
    private final S b;

    E(S s) {
        this.b = s;
    }

    public final Dr a() {
        try {
            return this.b.i();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", S.class.getSimpleName());
            return null;
        }
    }
}
