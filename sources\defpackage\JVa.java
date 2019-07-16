package defpackage;

/* renamed from: JVa reason: default package */
/* compiled from: Result.kt */
public final class JVa {
    public static final Object a(Throwable th) {
        C7471uYa.b(th, "exception");
        return new b(th);
    }

    public static final void a(Object obj) {
        if (obj instanceof b) {
            throw ((b) obj).a;
        }
    }
}
