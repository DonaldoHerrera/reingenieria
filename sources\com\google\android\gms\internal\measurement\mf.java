package com.google.android.gms.internal.measurement;

public final class mf implements nf {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;
    private static final C1047ua<Boolean> d;
    private static final C1047ua<Boolean> e;
    private static final C1047ua<Long> f;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.client.sessions.background_sessions_enabled", true);
        b = ba.a("measurement.client.sessions.immediate_start_enabled_foreground", false);
        c = ba.a("measurement.client.sessions.immediate_start_enabled", false);
        d = ba.a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e = ba.a("measurement.client.sessions.session_id_enabled", true);
        f = ba.a("measurement.id.sessionization_client", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) d.a()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) e.a()).booleanValue();
    }
}
