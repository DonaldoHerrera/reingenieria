package com.google.android.gms.internal.measurement;

public final class Se implements Ka<Ve> {
    private static Se a = new Se();
    private final Ka<Ve> b;

    private Se(Ka<Ve> ka) {
        this.b = Ja.a(ka);
    }

    public static boolean a() {
        return ((Ve) a.get()).a();
    }

    public final /* synthetic */ Object get() {
        return (Ve) this.b.get();
    }

    public Se() {
        this(Ja.a(new Ue()));
    }
}
