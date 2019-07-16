package defpackage;

/* renamed from: pJa reason: default package and case insensitive filesystem */
/* compiled from: LegacySimplePresenter.kt */
final class C7111pJa<T, R> implements C7118pQa<Throwable, EPa<? extends d<? extends C6973nJa, ? extends ViewModel>>> {
    public static final C7111pJa a = new C7111pJa();

    C7111pJa() {
    }

    /* renamed from: a */
    public final EPa<? extends d<C6973nJa, ViewModel>> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        if (th instanceof Exception) {
            return APa.c(new a(C6973nJa.b.a().invoke(th)));
        }
        return APa.b(th);
    }
}
