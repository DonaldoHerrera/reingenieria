package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Qhb reason: default package */
/* compiled from: LazyJavaPackageFragment.kt */
final class Qhb extends C7540vYa implements PXa<List<? extends C7349snb>> {
    final /* synthetic */ Rhb a;

    Qhb(Rhb rhb) {
        this.a = rhb;
        super(0);
    }

    public final List<C7349snb> d() {
        Collection<Xib> F = this.a.m.F();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) F, 10));
        for (Xib q : F) {
            arrayList.add(q.q());
        }
        return arrayList;
    }
}
