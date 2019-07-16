package com.google.android.gms.internal.measurement;

public final class Wd implements Td {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Long> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.app_launch.event_ordering_fix", false);
        b = ba.a("measurement.id.app_launch.event_ordering_fix", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }
}
