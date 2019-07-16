package com.google.android.gms.internal.measurement;

public final class kf implements Ka<nf> {
    private static kf a = new kf();
    private final Ka<nf> b;

    private kf(Ka<nf> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((nf) a.get()).a();
    }

    public static boolean b() {
        return ((nf) a.get()).b();
    }

    public static boolean c() {
        return ((nf) a.get()).c();
    }

    public static boolean d() {
        return ((nf) a.get()).d();
    }

    public final /* synthetic */ Object get() {
        return (nf) this.b.get();
    }

    public kf() {
        this(Ja.a(new mf()));
    }
}
