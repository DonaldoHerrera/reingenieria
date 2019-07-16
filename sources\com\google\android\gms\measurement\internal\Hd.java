package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class Hd {
    private final Clock a;
    private long b;

    public Hd(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.a = clock;
    }

    public final void a() {
        this.b = 0;
    }

    public final void b() {
        this.b = this.a.elapsedRealtime();
    }

    public final boolean a(long j) {
        if (this.b != 0 && this.a.elapsedRealtime() - this.b < 3600000) {
            return false;
        }
        return true;
    }
}
