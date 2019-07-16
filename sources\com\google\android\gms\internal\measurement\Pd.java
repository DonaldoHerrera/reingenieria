package com.google.android.gms.internal.measurement;

public final class Pd implements Ka<Sd> {
    private static Pd a = new Pd();
    private final Ka<Sd> b;

    private Pd(Ka<Sd> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Sd) a.get()).c();
    }

    public static boolean b() {
        return ((Sd) a.get()).a();
    }

    public static boolean c() {
        return ((Sd) a.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (Sd) this.b.get();
    }

    public Pd() {
        this(Ja.a(new Rd()));
    }
}
