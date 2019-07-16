package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.df reason: case insensitive filesystem */
public final class C0946df implements Ka<C0967gf> {
    private static C0946df a = new C0946df();
    private final Ka<C0967gf> b;

    private C0946df(Ka<C0967gf> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0967gf) a.get()).a();
    }

    public static boolean b() {
        return ((C0967gf) a.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (C0967gf) this.b.get();
    }

    public C0946df() {
        this(Ja.a(new C0960ff()));
    }
}
