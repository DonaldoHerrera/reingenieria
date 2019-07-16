package com.google.android.gms.internal.measurement;

public final class Od implements Ka<Nd> {
    private static Od a = new Od();
    private final Ka<Nd> b;

    private Od(Ka<Nd> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Nd) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Nd) this.b.get();
    }

    public Od() {
        this(Ja.a(new Qd()));
    }
}
