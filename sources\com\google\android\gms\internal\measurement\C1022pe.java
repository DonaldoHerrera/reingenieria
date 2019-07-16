package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pe reason: case insensitive filesystem */
public final class C1022pe implements C1028qe {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Long> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.fetch_config_with_admob_app_id", true);
        b = ba.a("measurement.id.fetch_config_with_admob_app_id", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }
}
