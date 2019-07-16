package com.google.android.gms.internal.measurement;

public final class Xe implements Ka<We> {
    private static Xe a = new Xe();
    private final Ka<We> b;

    private Xe(Ka<We> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((We) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (We) this.b.get();
    }

    public Xe() {
        this(Ja.a(new Ze()));
    }
}
