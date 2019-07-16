package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

class Id extends C1125ic implements C1135kc {
    protected final Kd b;

    Id(Kd kd) {
        super(kd.q());
        Preconditions.checkNotNull(kd);
        this.b = kd;
    }

    public Rd m() {
        return this.b.g();
    }

    public ae n() {
        return this.b.h();
    }

    public he o() {
        return this.b.i();
    }

    public Hb p() {
        return this.b.j();
    }
}
