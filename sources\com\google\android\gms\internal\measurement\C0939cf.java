package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cf reason: case insensitive filesystem */
public final class C0939cf implements Ka<C0932bf> {
    private static C0939cf a = new C0939cf();
    private final Ka<C0932bf> b;

    private C0939cf(Ka<C0932bf> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0932bf) a.get()).b();
    }

    public static boolean b() {
        return ((C0932bf) a.get()).c();
    }

    public static boolean c() {
        return ((C0932bf) a.get()).d();
    }

    public static boolean d() {
        return ((C0932bf) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C0932bf) this.b.get();
    }

    public C0939cf() {
        this(Ja.a(new C0953ef()));
    }
}
