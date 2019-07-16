package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.Hc;

/* renamed from: com.google.android.gms.measurement.internal.b reason: case insensitive filesystem */
abstract class C1087b {
    private static volatile Handler a;
    private final C1135kc b;
    private final Runnable c;
    /* access modifiers changed from: private */
    public volatile long d;

    C1087b(C1135kc kcVar) {
        Preconditions.checkNotNull(kcVar);
        this.b = kcVar;
        this.c = new C1102e(this, kcVar);
    }

    private final Handler d() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (C1087b.class) {
            if (a == null) {
                a = new Hc(this.b.getContext().getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public final void a(long j) {
        a();
        if (j >= 0) {
            this.d = this.b.c().currentTimeMillis();
            if (!d().postDelayed(this.c, j)) {
                this.b.e().s().a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public abstract void b();

    public final boolean c() {
        return this.d != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }
}
