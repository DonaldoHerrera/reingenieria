package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ef reason: case insensitive filesystem */
public final class C0953ef implements C0932bf {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;
    private static final C1047ua<Boolean> d;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.service.audience.scoped_filters_v27", false);
        b = ba.a("measurement.service.audience.session_scoped_user_engagement", false);
        c = ba.a("measurement.service.audience.session_scoped_event_aggregates", false);
        d = ba.a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.a()).booleanValue();
    }
}
