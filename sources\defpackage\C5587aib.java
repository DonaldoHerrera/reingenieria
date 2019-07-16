package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: aib reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaScope.kt */
final class C5587aib extends C7540vYa implements _Xa<C7694xnb, List<? extends C7408tdb>> {
    final /* synthetic */ Vhb a;

    C5587aib(Vhb vhb) {
        this.a = vhb;
        super(1);
    }

    /* renamed from: a */
    public final List<C7408tdb> invoke(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        ArrayList arrayList = new ArrayList();
        Rib b = ((C7205qhb) this.a.e().d()).b(xnb);
        if (b != null && !b.w()) {
            arrayList.add(this.a.d(b));
        }
        this.a.a(xnb, (Collection<C7408tdb>) arrayList);
        if (C6531gpb.g(this.a.g())) {
            return C7676xWa.q(arrayList);
        }
        return C7676xWa.q(this.a.d().a().o().a(this.a.d(), (Collection<? extends D>) arrayList));
    }
}
