package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

final class zacl implements Py<Boolean, Void> {
    zacl() {
    }

    public final /* synthetic */ Object then(Wy wy) throws Exception {
        if (((Boolean) wy.b()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
