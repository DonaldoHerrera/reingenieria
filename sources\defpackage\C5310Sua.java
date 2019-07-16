package defpackage;

/* renamed from: Sua reason: default package and case insensitive filesystem */
/* compiled from: ObserverFactory.kt */
public final class C5310Sua extends QUa {
    final /* synthetic */ C5606ava c;
    final /* synthetic */ C3466UY d;
    final /* synthetic */ PXa e;

    C5310Sua(C5606ava ava, C3466UY uy, PXa pXa) {
        this.c = ava;
        this.d = uy;
        this.e = pXa;
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        this.c.b().a(th, this.d);
    }

    public void onComplete() {
        this.e.d();
    }
}
