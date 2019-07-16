package defpackage;

/* renamed from: rvb reason: default package and case insensitive filesystem */
/* compiled from: exceptionUtils.kt */
public final class C7296rvb {
    public static final boolean a(Throwable th) {
        C7471uYa.b(th, "$this$isProcessCanceledException");
        Class cls = th.getClass();
        while (!C7471uYa.a((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th) {
        C7471uYa.b(th, "e");
        throw th;
    }
}
