package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: _hb reason: default package */
/* compiled from: LazyJavaScope.kt */
final class _hb extends C7540vYa implements _Xa<C7694xnb, List<? extends C7684xdb>> {
    final /* synthetic */ Vhb a;

    _hb(Vhb vhb) {
        this.a = vhb;
        super(1);
    }

    /* renamed from: a */
    public final List<C7684xdb> invoke(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Uib uib : ((C7205qhb) this.a.e().d()).a(xnb)) {
            Rgb a2 = this.a.a(uib);
            if (this.a.a(a2)) {
                this.a.d().a().g().a(uib, (C7684xdb) a2);
                linkedHashSet.add(a2);
            }
        }
        C7836zpb.a(linkedHashSet);
        this.a.a((Collection<C7684xdb>) linkedHashSet, xnb);
        return C7676xWa.q(this.a.d().a().o().a(this.a.d(), (Collection<? extends D>) linkedHashSet));
    }
}
