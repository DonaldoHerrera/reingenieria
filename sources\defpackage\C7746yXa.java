package defpackage;

/* renamed from: yXa reason: default package and case insensitive filesystem */
/* compiled from: JDK7PlatformImplementations.kt */
public class C7746yXa extends C7539vXa {
    public void a(Throwable th, Throwable th2) {
        C7471uYa.b(th, "cause");
        C7471uYa.b(th2, "exception");
        th.addSuppressed(th2);
    }
}
