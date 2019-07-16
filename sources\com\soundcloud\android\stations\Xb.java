package com.soundcloud.android.stations;

import java.util.Set;

/* compiled from: StationsCleanupHelper.kt */
public final class Xb extends Xda {
    private final String a = "Stations";
    private final B b;

    public Xb(B b2) {
        C7471uYa.b(b2, "stationStorage");
        this.b = b2;
    }

    public Set<C3508cda> c() {
        return this.b.e();
    }

    public String getKey() {
        return this.a;
    }
}
