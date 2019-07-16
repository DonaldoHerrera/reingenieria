package defpackage;

/* renamed from: rJa reason: default package and case insensitive filesystem */
/* compiled from: LegacySimplePresenter.kt */
final class C7249rJa<T, R> implements C7118pQa<Throwable, EPa<? extends d<? extends C6973nJa, ? extends ViewModel>>> {
    public static final C7249rJa a = new C7249rJa();

    C7249rJa() {
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
