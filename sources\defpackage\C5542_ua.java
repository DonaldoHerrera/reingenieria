package defpackage;

/* renamed from: _ua reason: default package and case insensitive filesystem */
/* compiled from: ObserverFactory.kt */
public final class C5542_ua extends TUa<T> {
    final /* synthetic */ C5606ava c;
    final /* synthetic */ _Xa d;
    final /* synthetic */ C3466UY e;

    C5542_ua(C5606ava ava, _Xa _xa, C3466UY uy) {
        this.c = ava;
        this.d = _xa;
        this.e = uy;
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        this.c.b().a(th, this.e);
    }

    public void onSuccess(T t) {
        this.d.invoke(t);
    }
}
