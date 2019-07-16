package defpackage;

/* renamed from: Wua reason: default package and case insensitive filesystem */
/* compiled from: ObserverFactory.kt */
public final class C5426Wua extends RUa<T> {
    final /* synthetic */ C5606ava c;
    final /* synthetic */ C3466UY d;
    final /* synthetic */ _Xa e;

    C5426Wua(C5606ava ava, C3466UY uy, _Xa _xa) {
        this.c = ava;
        this.d = uy;
        this.e = _xa;
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        this.c.b().a(th, this.d);
    }

    public void onComplete() {
    }

    public void onSuccess(T t) {
        this.e.invoke(t);
    }
}
