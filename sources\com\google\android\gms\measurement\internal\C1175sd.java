package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.sd reason: case insensitive filesystem */
final class C1175sd implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ C1166qd b;

    C1175sd(C1166qd qdVar, ComponentName componentName) {
        this.b = qdVar;
        this.a = componentName;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
