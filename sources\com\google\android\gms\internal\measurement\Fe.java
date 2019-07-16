package com.google.android.gms.internal.measurement;

public final class Fe implements Ka<Je> {
    private static Fe a = new Fe();
    private final Ka<Je> b;

    private Fe(Ka<Je> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Je) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Je) this.b.get();
    }

    public Fe() {
        this(Ja.a(new He()));
    }
}
