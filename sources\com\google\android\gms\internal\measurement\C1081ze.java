package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ze reason: case insensitive filesystem */
public final class C1081ze implements Ka<Ce> {
    private static C1081ze a = new C1081ze();
    private final Ka<Ce> b;

    private C1081ze(Ka<Ce> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Ce) a.get()).c();
    }

    public static boolean b() {
        return ((Ce) a.get()).b();
    }

    public static boolean c() {
        return ((Ce) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Ce) this.b.get();
    }

    public C1081ze() {
        this(Ja.a(new Be()));
    }
}
