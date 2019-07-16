package defpackage;

/* renamed from: opa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C7076opa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C5662bpa a;
    final /* synthetic */ C3508cda b;

    C7076opa(C5662bpa bpa, C3508cda cda) {
        this.a = bpa;
        this.b = cda;
    }

    /* renamed from: a */
    public final APa<C6464fqa> apply(C3508cda cda) {
        C7471uYa.b(cda, "loggedInUser");
        return this.a.d.a(this.b, (_Xa<? super Eda, Boolean>) new C6870lpa<Object,Boolean>(cda)).g().f(new C6938mpa(this)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C7007npa<Object,Object>(this, cda));
    }
}
