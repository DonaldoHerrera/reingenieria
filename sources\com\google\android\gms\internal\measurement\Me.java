package com.google.android.gms.internal.measurement;

public final class Me implements Ka<Pe> {
    private static Me a = new Me();
    private final Ka<Pe> b;

    private Me(Ka<Pe> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Pe) a.get()).b();
    }

    public static double b() {
        return ((Pe) a.get()).a();
    }

    public static long c() {
        return ((Pe) a.get()).e();
    }

    public static long d() {
        return ((Pe) a.get()).d();
    }

    public static String e() {
        return ((Pe) a.get()).c();
    }

    public final /* synthetic */ Object get() {
        return (Pe) this.b.get();
    }

    public Me() {
        this(Ja.a(new Oe()));
    }
}
