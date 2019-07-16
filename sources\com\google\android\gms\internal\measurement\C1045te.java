package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.te reason: case insensitive filesystem */
public final class C1045te implements Ka<C1063we> {
    private static C1045te a = new C1045te();
    private final Ka<C1063we> b;

    private C1045te(Ka<C1063we> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C1063we) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C1063we) this.b.get();
    }

    public C1045te() {
        this(Ja.a(new C1057ve()));
    }
}
