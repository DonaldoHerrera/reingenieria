package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ne reason: case insensitive filesystem */
public final class C1010ne implements Ka<C1028qe> {
    private static C1010ne a = new C1010ne();
    private final Ka<C1028qe> b;

    private C1010ne(Ka<C1028qe> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C1028qe) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C1028qe) this.b.get();
    }

    public C1010ne() {
        this(Ja.a(new C1022pe()));
    }
}
