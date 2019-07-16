package defpackage;

/* renamed from: gEa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoader.kt */
final class C6492gEa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C5289SDa a;

    C6492gEa(C5289SDa sDa) {
        this.a = sDa;
    }

    /* renamed from: a */
    public final APa<APa<e>> apply(APa<d<ErrorType, PageData>> aPa) {
        C7471uYa.b(aPa, "refreshObservable");
        return APa.a((CPa<T>) new C6424fEa<T>(this, aPa.n()));
    }
}
