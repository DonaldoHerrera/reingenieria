package com.google.android.gms.internal.measurement;

public final class Re implements Ka<Qe> {
    private static Re a = new Re();
    private final Ka<Qe> b;

    private Re(Ka<Qe> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Qe) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Qe) this.b.get();
    }

    public Re() {
        this(Ja.a(new Te()));
    }
}
