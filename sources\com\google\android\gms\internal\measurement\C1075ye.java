package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ye reason: case insensitive filesystem */
public final class C1075ye implements Ka<C1069xe> {
    private static C1075ye a = new C1075ye();
    private final Ka<C1069xe> b;

    private C1075ye(Ka<C1069xe> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C1069xe) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C1069xe) this.b.get();
    }

    public C1075ye() {
        this(Ja.a(new Ae()));
    }
}
