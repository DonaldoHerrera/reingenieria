package defpackage;

/* renamed from: vQa reason: default package and case insensitive filesystem */
/* compiled from: EmptyDisposable */
public enum C7532vQa implements IQa<Object> {
    INSTANCE,
    NEVER;

    public int a(int i) {
        return i & 2;
    }

    public boolean a() {
        return this == INSTANCE;
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public static void a(GPa<?> gPa) {
        gPa.a((VPa) INSTANCE);
        gPa.onComplete();
    }

    public static void a(C7600wPa<?> wpa) {
        wpa.a((VPa) INSTANCE);
        wpa.onComplete();
    }

    public static void a(Throwable th, GPa<?> gPa) {
        gPa.a((VPa) INSTANCE);
        gPa.a(th);
    }

    public static void a(C7117pPa ppa) {
        ppa.a((VPa) INSTANCE);
        ppa.onComplete();
    }

    public static void a(Throwable th, C7117pPa ppa) {
        ppa.a((VPa) INSTANCE);
        ppa.a(th);
    }

    public static void a(Throwable th, KPa<?> kPa) {
        kPa.a((VPa) INSTANCE);
        kPa.a(th);
    }

    public static void a(Throwable th, C7600wPa<?> wpa) {
        wpa.a((VPa) INSTANCE);
        wpa.a(th);
    }
}
