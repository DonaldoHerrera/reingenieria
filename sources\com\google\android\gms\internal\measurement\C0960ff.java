package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ff reason: case insensitive filesystem */
public final class C0960ff implements C0967gf {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Long> c;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.audience.sequence_filters", false);
        b = ba.a("measurement.audience.sequence_filters_bundle_timestamp", false);
        c = ba.a("measurement.id.audience.sequence_filters", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }
}
