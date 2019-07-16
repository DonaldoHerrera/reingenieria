package defpackage;

/* renamed from: wB reason: default package and case insensitive filesystem */
final class C1804wB extends C1684sB {
    private final /* synthetic */ C1654rB b;

    C1804wB(C1654rB rBVar) {
        this.b = rBVar;
    }

    public final void a() {
        if (this.b.l != null) {
            this.b.c.a("Unbind from service.", new Object[0]);
            this.b.b.unbindService(this.b.k);
            this.b.f = false;
            this.b.l = null;
            this.b.k = null;
        }
    }
}
