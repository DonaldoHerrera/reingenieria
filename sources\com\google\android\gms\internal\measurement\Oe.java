package com.google.android.gms.internal.measurement;

public final class Oe implements Pe {
    private static final C1047ua<Boolean> a;
    private static final C1047ua<Double> b;
    private static final C1047ua<Long> c;
    private static final C1047ua<Long> d;
    private static final C1047ua<String> e;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.test.boolean_flag", false);
        b = ba.a("measurement.test.double_flag", -3.0d);
        c = ba.a("measurement.test.int_flag", -2);
        d = ba.a("measurement.test.long_flag", -1);
        e = ba.a("measurement.test.string_flag", "---");
    }

    public final double a() {
        return ((Double) b.a()).doubleValue();
    }

    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }

    public final String c() {
        return (String) e.a();
    }

    public final long d() {
        return ((Long) d.a()).longValue();
    }

    public final long e() {
        return ((Long) c.a()).longValue();
    }
}
