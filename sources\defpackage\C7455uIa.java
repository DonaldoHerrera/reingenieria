package defpackage;

/* renamed from: uIa reason: default package and case insensitive filesystem */
/* compiled from: RxExtensions.kt */
final class C7455uIa<T, R> implements C7118pQa<Throwable, MPa<? extends T>> {
    final /* synthetic */ Object a;

    C7455uIa(Object obj) {
        this.a = obj;
    }

    /* renamed from: a */
    public final MPa<? extends T> apply(Throwable th) {
        C7471uYa.b(th, "throwable");
        return !C6972nIa.d(th) ? IPa.b(th) : IPa.a(this.a);
    }
}
