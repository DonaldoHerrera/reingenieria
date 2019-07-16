package defpackage;

/* renamed from: ipa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6666ipa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C5662bpa a;
    final /* synthetic */ C3508cda b;

    C6666ipa(C5662bpa bpa, C3508cda cda) {
        this.a = bpa;
        this.b = cda;
    }

    /* renamed from: a */
    public final APa<c> apply(C4928GKa<Exception> gKa) {
        C7471uYa.b(gKa, "syncException");
        return APa.b((EPa<? extends T>) APa.c(RVa.a), (EPa<? extends T>) this.a.d(this.b)).k(new C6598hpa(this, gKa));
    }
}
