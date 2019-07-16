package com.google.android.gms.internal.measurement;

public final class Ze implements We {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Long> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.reset_analytics.persist_time", false);
        b = ba.a("measurement.id.reset_analytics.persist_time", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }
}
