package com.google.android.gms.internal.measurement;

public final class Id implements Ka<Hd> {
    private static Id a = new Id();
    private final Ka<Hd> b;

    private Id(Ka<Hd> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Hd) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Hd) this.b.get();
    }

    public Id() {
        this(Ja.a(new Kd()));
    }
}
