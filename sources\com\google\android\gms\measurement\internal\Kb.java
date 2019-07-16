package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class Kb<V> extends FutureTask<V> implements Comparable<Kb> {
    private final long a = Gb.c.getAndIncrement();
    final boolean b;
    private final String c;
    private final /* synthetic */ Gb d;

    Kb(Gb gb, Callable<V> callable, boolean z, String str) {
        this.d = gb;
        super(callable);
        Preconditions.checkNotNull(str);
        this.c = str;
        this.b = z;
        if (this.a == Long.MAX_VALUE) {
            gb.e().s().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        Kb kb = (Kb) obj;
        boolean z = this.b;
        if (z != kb.b) {
            return z ? -1 : 1;
        }
        long j = this.a;
        long j2 = kb.a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.e().t().a("Two tasks share the same index. index", Long.valueOf(this.a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.d.e().s().a(this.c, th);
        super.setException(th);
    }

    Kb(Gb gb, Runnable runnable, boolean z, String str) {
        this.d = gb;
        super(runnable, null);
        Preconditions.checkNotNull(str);
        this.c = str;
        this.b = false;
        if (this.a == Long.MAX_VALUE) {
            gb.e().s().a("Tasks index overflow");
        }
    }
}
