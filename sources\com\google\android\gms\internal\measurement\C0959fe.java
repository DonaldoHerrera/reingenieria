package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fe reason: case insensitive filesystem */
public final class C0959fe implements Ka<C0952ee> {
    private static C0959fe a = new C0959fe();
    private final Ka<C0952ee> b;

    private C0959fe(Ka<C0952ee> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((C0952ee) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (C0952ee) this.b.get();
    }

    public C0959fe() {
        this(Ja.a(new C0980ie()));
    }
}
