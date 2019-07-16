package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: btb reason: default package and case insensitive filesystem */
/* compiled from: AbstractTypeConstructor.kt */
final class C5671btb extends C7540vYa implements _Xa<a, RVa> {
    final /* synthetic */ Vsb a;

    C5671btb(Vsb vsb) {
        this.a = vsb;
        super(1);
    }

    public final void a(a aVar) {
        C7471uYa.b(aVar, "supertypes");
        C4843Ddb g = this.a.g();
        Vsb vsb = this.a;
        Collection a2 = aVar.a();
        g.a(vsb, a2, new _sb(this), new C5603atb(this));
        List list = null;
        if (a2.isEmpty()) {
            C7706xtb f = this.a.f();
            Collection a3 = f != null ? C6850lWa.a(f) : null;
            if (a3 == null) {
                a3 = C6918mWa.a();
            }
            a2 = a3;
        }
        this.a.g().a(this.a, a2, new Ysb(this), new Zsb(this));
        if (a2 instanceof List) {
            list = a2;
        }
        List list2 = list;
        if (list2 == null) {
            list2 = C7676xWa.q(a2);
        }
        aVar.a(list2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((a) obj);
        return RVa.a;
    }
}
