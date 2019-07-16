package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread.UncaughtExceptionHandler;

final class Ib implements UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ Gb b;

    public Ib(Gb gb, String str) {
        this.b = gb;
        Preconditions.checkNotNull(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.e().s().a(this.a, th);
    }
}
