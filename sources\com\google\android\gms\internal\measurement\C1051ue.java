package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ue reason: case insensitive filesystem */
public final class C1051ue implements C1033re {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.collection.efficient_engagement_reporting_enabled", false);
        b = ba.a("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
