package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.se reason: case insensitive filesystem */
public final class C1039se implements Ka<C1033re> {
    private static C1039se a = new C1039se();
    private final Ka<C1033re> b;

    private C1039se(Ka<C1033re> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C1033re) a.get()).b();
    }

    public static boolean b() {
        return ((C1033re) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C1033re) this.b.get();
    }

    public C1039se() {
        this(Ja.a(new C1051ue()));
    }
}
