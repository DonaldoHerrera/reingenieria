package defpackage;

/* renamed from: WPa reason: default package */
/* compiled from: Disposables */
public final class WPa {
    public static VPa a(Runnable runnable) {
        AQa.a(runnable, "run is null");
        return new YPa(runnable);
    }

    public static VPa b() {
        return a(C7808zQa.b);
    }

    public static VPa a(C6368eQa eqa) {
        AQa.a(eqa, "run is null");
        return new TPa(eqa);
    }

    public static VPa a() {
        return C7532vQa.INSTANCE;
    }
}
