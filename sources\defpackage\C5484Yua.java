package defpackage;

/* renamed from: Yua reason: default package and case insensitive filesystem */
/* compiled from: ObserverFactory.kt */
public final class C5484Yua extends SUa<T> {
    final /* synthetic */ C5606ava c;
    final /* synthetic */ C3466UY d;
    final /* synthetic */ _Xa e;

    C5484Yua(C5606ava ava, C3466UY uy, _Xa _xa) {
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

    public void a(T t) {
        this.e.invoke(t);
    }
}
