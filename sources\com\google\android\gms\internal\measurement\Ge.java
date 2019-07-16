package com.google.android.gms.internal.measurement;

public final class Ge implements De {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.personalized_ads_signals_collection_enabled", true);
        b = ba.a("measurement.personalized_ads_property_translation_enabled", true);
    }

    public final boolean a() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
