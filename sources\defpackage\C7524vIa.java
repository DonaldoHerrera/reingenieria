package defpackage;

/* renamed from: vIa reason: default package and case insensitive filesystem */
/* compiled from: RxExtensions.kt */
final class C7524vIa<T, R> implements C7118pQa<Throwable, EPa<? extends T>> {
    final /* synthetic */ Object a;

    C7524vIa(Object obj) {
        this.a = obj;
    }

    /* renamed from: a */
    public final EPa<? extends T> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        return !C6972nIa.d(th) ? APa.b(th) : APa.c(this.a);
    }
}
