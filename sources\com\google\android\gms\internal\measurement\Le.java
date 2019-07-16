package com.google.android.gms.internal.measurement;

public final class Le implements Ka<Ke> {
    private static Le a = new Le();
    private final Ka<Ke> b;

    private Le(Ka<Ke> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Ke) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Ke) this.b.get();
    }

    public Le() {
        this(Ja.a(new Ne()));
    }
}
