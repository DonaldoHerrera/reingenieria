package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: thb reason: default package and case insensitive filesystem */
/* compiled from: JvmPackageScope.kt */
public final class C7412thb implements Eqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7412thb.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    private final Shb b;
    private final Psb c = this.d.e().a((PXa<? extends T>) new C7343shb<Object>(this));
    /* access modifiers changed from: private */
    public final C6590hhb d;
    /* access modifiers changed from: private */
    public final Rhb e;

    public C7412thb(C6590hhb hhb, Xib xib, Rhb rhb) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(xib, "jPackage");
        C7471uYa.b(rhb, "packageFragment");
        this.d = hhb;
        this.e = rhb;
        this.b = new Shb(this.d, xib, this.e);
    }

    private final List<Eqb> d() {
        return (List) Rsb.a(this.c, (Object) this, a[0]);
    }

    public final Shb c() {
        return this.b;
    }

    public void d(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        Bfb.a(this.d.a().i(), dfb, (C6790kdb) this.e, xnb);
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        Shb shb = this.b;
        List<Eqb> d2 = d();
        Collection<C7684xdb> a2 = shb.a(xnb, dfb);
        for (Eqb a3 : d2) {
            a2 = C7020nvb.a(a2, a3.a(xnb, dfb));
        }
        return a2 != null ? a2 : SWa.a();
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C5122Mcb b2;
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        C5029Jcb b3 = this.b.b(xnb, dfb);
        if (b3 != null) {
            return b3;
        }
        C5122Mcb mcb = null;
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b2 = ((Eqb) it.next()).b(xnb, dfb);
            if (b2 != null) {
                if (!(b2 instanceof C5152Ncb) || !((C5152Ncb) b2).p()) {
                    mcb = b2;
                } else if (mcb == null) {
                    mcb = b2;
                }
            }
        }
        mcb = b2;
        return mcb;
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        d(xnb, dfb);
        Shb shb = this.b;
        List<Eqb> d2 = d();
        Collection<C7408tdb> c2 = shb.c(xnb, dfb);
        for (Eqb c3 : d2) {
            c2 = C7020nvb.a(c2, c3.c(xnb, dfb));
        }
        return c2 != null ? c2 : SWa.a();
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        Shb shb = this.b;
        List<Eqb> d2 = d();
        Collection<C5272Rcb> a2 = shb.a(xqb, _xa);
        for (Eqb a3 : d2) {
            a2 = C7020nvb.a(a2, a3.a(xqb, _xa));
        }
        return a2 != null ? a2 : SWa.a();
    }

    public Set<C7694xnb> b() {
        List<Eqb> d2 = d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Eqb b2 : d2) {
            C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) b2.b());
        }
        linkedHashSet.addAll(this.b.b());
        return linkedHashSet;
    }

    public Set<C7694xnb> a() {
        List<Eqb> d2 = d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Eqb a2 : d2) {
            C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) a2.a());
        }
        linkedHashSet.addAll(this.b.a());
        return linkedHashSet;
    }
}
