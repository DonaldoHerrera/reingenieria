package com.google.android.gms.internal.measurement;

public final class Rd implements Sd {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.log_installs_enabled", false);
        b = ba.a("measurement.log_third_party_store_events_enabled", false);
        c = ba.a("measurement.log_upgrades_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) a.a()).booleanValue();
    }
}
