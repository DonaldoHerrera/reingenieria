package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.me reason: case insensitive filesystem */
public final class C1004me implements Ka<C0998le> {
    private static C1004me a = new C1004me();
    private final Ka<C0998le> b;

    private C1004me(Ka<C0998le> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0998le) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C0998le) this.b.get();
    }

    public C1004me() {
        this(Ja.a(new C1016oe()));
    }
}
