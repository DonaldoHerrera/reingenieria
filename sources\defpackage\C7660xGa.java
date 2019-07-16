package defpackage;

/* renamed from: xGa reason: default package and case insensitive filesystem */
/* compiled from: ErrorUtils.kt */
public final class C7660xGa {
    public static final C7660xGa a = new C7660xGa();

    private C7660xGa() {
    }

    @NXa
    public static final boolean a(Throwable th) {
        C7471uYa.b(th, "t");
        return (th instanceof RuntimeException) && !(th instanceof C7729yGa);
    }
}
