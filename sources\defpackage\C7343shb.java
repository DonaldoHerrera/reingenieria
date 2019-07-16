package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: shb reason: default package and case insensitive filesystem */
/* compiled from: JvmPackageScope.kt */
final class C7343shb extends C7540vYa implements PXa<List<? extends Eqb>> {
    final /* synthetic */ C7412thb a;

    C7343shb(C7412thb thb) {
        this.a = thb;
        super(0);
    }

    public final List<Eqb> d() {
        Collection<Dkb> values = this.a.e.ta().values();
        ArrayList arrayList = new ArrayList();
        for (Dkb a2 : values) {
            Eqb a3 = this.a.d.a().b().a((C6790kdb) this.a.e, a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return C7676xWa.q(arrayList);
    }
}
