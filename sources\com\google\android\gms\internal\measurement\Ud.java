package com.google.android.gms.internal.measurement;

public final class Ud implements Ka<Td> {
    private static Ud a = new Ud();
    private final Ka<Td> b;

    private Ud(Ka<Td> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Td) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Td) this.b.get();
    }

    public Ud() {
        this(Ja.a(new Wd()));
    }
}
