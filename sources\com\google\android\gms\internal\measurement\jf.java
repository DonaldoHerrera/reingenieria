package com.google.android.gms.internal.measurement;

public final class jf implements Ka<C0974hf> {
    private static jf a = new jf();
    private final Ka<C0974hf> b;

    private jf(Ka<C0974hf> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0974hf) a.get()).b();
    }

    public static boolean b() {
        return ((C0974hf) a.get()).c();
    }

    public static boolean c() {
        return ((C0974hf) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C0974hf) this.b.get();
    }

    public jf() {
        this(Ja.a(new lf()));
    }
}
