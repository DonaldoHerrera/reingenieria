package defpackage;

/* renamed from: vJa reason: default package and case insensitive filesystem */
/* compiled from: LegacyUniflow.kt */
final class C7525vJa<T, R> implements C7118pQa<Throwable, EPa<? extends d<? extends C6973nJa, ? extends T>>> {
    public static final C7525vJa a = new C7525vJa();

    C7525vJa() {
    }

    /* renamed from: a */
    public final EPa<? extends d<C6973nJa, T>> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (C6972nIa.d(th)) {
            return APa.c(new a(C6973nJa.b.a().invoke((Exception) th)));
        }
        return APa.b(th);
    }
}
