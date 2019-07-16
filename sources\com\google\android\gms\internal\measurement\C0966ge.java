package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ge reason: case insensitive filesystem */
public final class C0966ge implements Ka<C0992ke> {
    private static C0966ge a = new C0966ge();
    private final Ka<C0992ke> b;

    private C0966ge(Ka<C0992ke> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0992ke) a.get()).a();
    }

    public static boolean b() {
        return ((C0992ke) a.get()).c();
    }

    public static boolean c() {
        return ((C0992ke) a.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (C0992ke) this.b.get();
    }

    public C0966ge() {
        this(Ja.a(new C0986je()));
    }
}
