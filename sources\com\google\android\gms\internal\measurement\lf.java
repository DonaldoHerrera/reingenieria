package com.google.android.gms.internal.measurement;

public final class lf implements C0974hf {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;
    private static final C1047ua<Long> d;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.service.sessions.remove_disabled_session_number", false);
        b = ba.a("measurement.service.sessions.session_number_enabled", false);
        c = ba.a("measurement.service.sessions.session_number_backfill_enabled", false);
        d = ba.a("measurement.id.session_number", 0);
    }

    public final boolean a() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) b.a()).booleanValue();
    }
}
