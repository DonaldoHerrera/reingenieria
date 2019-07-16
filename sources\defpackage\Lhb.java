package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: Lhb reason: default package */
/* compiled from: LazyJavaClassMemberScope.kt */
final class Lhb extends C7540vYa implements _Xa<C7694xnb, Meb> {
    final /* synthetic */ Mhb a;
    final /* synthetic */ C6590hhb b;

    Lhb(Mhb mhb, C6590hhb hhb) {
        this.a = mhb;
        this.b = hhb;
        super(1);
    }

    /* renamed from: a */
    public final Meb invoke(C7694xnb xnb) {
        C7694xnb xnb2 = xnb;
        C7471uYa.b(xnb2, "name");
        if (!((Set) this.a.k.d()).contains(xnb2)) {
            Rib rib = (Rib) ((Map) this.a.l.d()).get(xnb2);
            if (rib == null) {
                return null;
            }
            Psb a2 = this.b.e().a((PXa<? extends T>) new Khb<Object>(this));
            return Xeb.a(this.b.e(), this.a.g(), xnb, a2, C6386ehb.a(this.b, rib), this.b.a().q().a(rib));
        }
        _fb d = this.b.a().d();
        C7280rnb a3 = C7148pqb.a((C5122Mcb) this.a.g());
        if (a3 != null) {
            C7280rnb a4 = a3.a(xnb2);
            C7471uYa.a((Object) a4, "ownerDescriptor.classId!…createNestedClassId(name)");
            a aVar = new a(a4, null, this.a.o, 2, null);
            Kib a5 = d.a(aVar);
            if (a5 == null) {
                return null;
            }
            C7757yhb yhb = new C7757yhb(this.b, this.a.g(), a5, null, 8, null);
            this.b.a().e().a(yhb);
            return yhb;
        }
        C7471uYa.a();
        throw null;
    }
}
