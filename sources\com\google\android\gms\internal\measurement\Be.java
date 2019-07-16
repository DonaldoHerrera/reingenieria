package com.google.android.gms.internal.measurement;

public final class Be implements Ce {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.sdk.collection.last_deep_link_referrer", false);
        b = ba.a("measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        c = ba.a("measurement.sdk.collection.last_gclid_from_referrer", false);
    }

    public final boolean a() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) a.a()).booleanValue();
    }
}
