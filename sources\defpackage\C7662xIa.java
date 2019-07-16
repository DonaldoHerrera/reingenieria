package defpackage;

/* renamed from: xIa reason: default package and case insensitive filesystem */
/* compiled from: RxExtensions.kt */
public final class C7662xIa {
    public static final <T> APa<T> a(APa<T> aPa) {
        C7471uYa.b(aPa, "$this$doNotComplete");
        APa<T> b = aPa.b((EPa<? extends T>) APa.l());
        C7471uYa.a((Object) b, "mergeWith(Observable.never())");
        return b;
    }

    public static final <T> APa<T> a(IPa<T> iPa) {
        C7471uYa.b(iPa, "$this$toEndlessObservable");
        APa j = iPa.j();
        C7471uYa.a((Object) j, "toObservable()");
        return a(j);
    }

    public static final <T> IPa<T> a(IPa<T> iPa, T t) {
        C7471uYa.b(iPa, "$this$onSafeErrorReturnItem");
        IPa<T> f = iPa.f(new C7455uIa(t));
        C7471uYa.a((Object) f, "onErrorResumeNext { thro…else Single.just(value) }");
        return f;
    }

    public static final <T> APa<T> a(APa<T> aPa, T t) {
        C7471uYa.b(aPa, "$this$onSafeErrorReturnItem");
        APa<T> i = aPa.i(new C7524vIa(t));
        C7471uYa.a((Object) i, "onErrorResumeNext { thro… Observable.just(value) }");
        return i;
    }
}
