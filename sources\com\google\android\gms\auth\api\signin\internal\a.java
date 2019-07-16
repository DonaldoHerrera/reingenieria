package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

public class a {
    @VisibleForTesting
    private static int a = 31;
    private int b = 1;

    @KeepForSdk
    public a a(Object obj) {
        this.b = (a * this.b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final a a(boolean z) {
        this.b = (a * this.b) + (z ? 1 : 0);
        return this;
    }

    @KeepForSdk
    public int a() {
        return this.b;
    }
}
