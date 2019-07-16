package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ae reason: case insensitive filesystem */
public final class C0924ae implements Ka<C0945de> {
    private static C0924ae a = new C0924ae();
    private final Ka<C0945de> b;

    private C0924ae(Ka<C0945de> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0945de) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C0945de) this.b.get();
    }

    public C0924ae() {
        this(Ja.a(new C0938ce()));
    }
}
