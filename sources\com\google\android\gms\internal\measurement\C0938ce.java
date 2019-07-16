package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ce reason: case insensitive filesystem */
public final class C0938ce implements C0945de {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Long> b;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.upload_dsid_enabled", false);
        b = ba.a("measurement.id.upload_dsid_enabled", 0);
    }

    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }
}
