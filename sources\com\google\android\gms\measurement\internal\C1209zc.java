package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.zc reason: case insensitive filesystem */
final class C1209zc implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ C1174sc b;

    C1209zc(C1174sc scVar, Bundle bundle) {
        this.b = scVar;
        this.a = bundle;
    }

    public final void run() {
        this.b.c(this.a);
    }
}
