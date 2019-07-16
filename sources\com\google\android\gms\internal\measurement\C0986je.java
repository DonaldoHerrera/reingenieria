package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.je reason: case insensitive filesystem */
public final class C0986je implements C0992ke {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Boolean> b;
    private static final C1047ua<Boolean> c;
    private static final C1047ua<Boolean> d;
    private static final C1047ua<Long> e;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        b = ba.a("measurement.collection.init_params_control_enabled", true);
        c = ba.a("measurement.sdk.dynamite.use_dynamite", false);
        d = ba.a("measurement.sdk.dynamite.use_dynamite2", false);
        e = ba.a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) c.a()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) b.a()).booleanValue();
    }
}
