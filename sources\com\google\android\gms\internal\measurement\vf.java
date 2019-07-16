package com.google.android.gms.internal.measurement;

public final class vf implements Ka<uf> {
    private static vf a = new vf();
    private final Ka<uf> b;

    private vf(Ka<uf> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((uf) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (uf) this.b.get();
    }

    public vf() {
        this(Ja.a(new wf()));
    }
}
