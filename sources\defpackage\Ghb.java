package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Ghb reason: default package */
/* compiled from: LazyJavaClassMemberScope.kt */
final class Ghb extends C7540vYa implements PXa<List<? extends C4997Icb>> {
    final /* synthetic */ Mhb a;
    final /* synthetic */ C6590hhb b;

    Ghb(Mhb mhb, C6590hhb hhb) {
        this.a = mhb;
        this.b = hhb;
        super(0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final List<C4997Icb> d() {
        Collection<Oib> i = this.a.o.i();
        ArrayList arrayList = new ArrayList(i.size());
        for (Oib a2 : i) {
            arrayList.add(this.a.a(a2));
        }
        Rjb o = this.b.a().o();
        C6590hhb hhb = this.b;
        if (arrayList.isEmpty()) {
            arrayList = C6918mWa.b((Object) this.a.j());
        }
        return C7676xWa.q(o.a(hhb, (Collection<? extends D>) arrayList));
    }
}
