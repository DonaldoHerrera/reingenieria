package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.yc reason: case insensitive filesystem */
final class C1204yc implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ C1174sc b;

    C1204yc(C1174sc scVar, Bundle bundle) {
        this.b = scVar;
        this.a = bundle;
    }

    public final void run() {
        this.b.d(this.a);
    }
}
