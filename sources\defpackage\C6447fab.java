package defpackage;

/* renamed from: fab reason: default package and case insensitive filesystem */
/* compiled from: KPackageImpl.kt */
final class C6447fab extends C7540vYa implements PXa<MVa<? extends C6800knb, ? extends Ilb, ? extends C6732jnb>> {
    final /* synthetic */ a a;

    C6447fab(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final MVa<C6800knb, Ilb, C6732jnb> d() {
        C7751ybb a2 = this.a.f();
        if (a2 == null) {
            return null;
        }
        Rkb a3 = a2.a();
        if (a3 == null) {
            return null;
        }
        String[] a4 = a3.a();
        String[] g = a3.g();
        if (a4 == null || g == null) {
            return null;
        }
        HVa c = C6936mnb.c(a4, g);
        return new MVa((C6800knb) c.a(), (Ilb) c.b(), a3.d());
    }
}
