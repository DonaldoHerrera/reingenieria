package com.google.android.gms.internal.measurement;

public final class Jd implements Ka<Md> {
    private static Jd a = new Jd();
    private final Ka<Md> b;

    private Jd(Ka<Md> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Md) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Md) this.b.get();
    }

    public Jd() {
        this(Ja.a(new Ld()));
    }
}
