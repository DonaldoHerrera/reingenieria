package com.google.android.gms.internal.measurement;

public final class Ee implements Ka<De> {
    private static Ee a = new Ee();
    private final Ka<De> b;

    private Ee(Ka<De> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((De) a.get()).b();
    }

    public static boolean b() {
        return ((De) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (De) this.b.get();
    }

    public Ee() {
        this(Ja.a(new Ge()));
    }
}
