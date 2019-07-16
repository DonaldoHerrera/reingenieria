package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: Kqb reason: default package */
/* compiled from: SubstitutingScope.kt */
public final class Kqb implements Eqb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Kqb.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};
    private final _tb b;
    private Map<C5272Rcb, C5272Rcb> c;
    private final C7744yVa d = BVa.a(new Jqb(this));
    /* access modifiers changed from: private */
    public final Eqb e;

    public Kqb(Eqb eqb, _tb _tb) {
        C7471uYa.b(eqb, "workerScope");
        C7471uYa.b(_tb, "givenSubstitutor");
        this.e = eqb;
        Wtb a2 = _tb.a();
        C7471uYa.a((Object) a2, "givenSubstitutor.substitution");
        this.b = Gpb.a(a2, false, 1, null).c();
    }

    private final Collection<C5272Rcb> c() {
        C7744yVa yva = this.d;
        DZa dZa = a[0];
        return (Collection) yva.getValue();
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        C5122Mcb b2 = this.e.b(xnb, dfb);
        if (b2 != null) {
            return (C5122Mcb) a((D) b2);
        }
        return null;
    }

    public Collection<? extends C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return a(this.e.c(xnb, dfb));
    }

    public Set<C7694xnb> b() {
        return this.e.b();
    }

    private final <D extends C5272Rcb> D a(D d2) {
        if (this.b.b()) {
            return d2;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        Map<C5272Rcb, C5272Rcb> map = this.c;
        if (map != null) {
            D d3 = map.get(d2);
            if (d3 == null) {
                if (d2 instanceof C4812Cdb) {
                    d3 = ((C4812Cdb) d2).a(this.b);
                    if (d3 != null) {
                        map.put(d2, d3);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, ");
                        sb.append("but ");
                        sb.append(d2);
                        sb.append(" substitution fails");
                        throw new AssertionError(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown descriptor in scope: ");
                    sb2.append(d2);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            D d4 = (C5272Rcb) d3;
            if (d4 != null) {
                return d4;
            }
            throw new OVa("null cannot be cast to non-null type D");
        }
        C7471uYa.a();
        throw null;
    }

    /* access modifiers changed from: private */
    public final <D extends C5272Rcb> Collection<D> a(Collection<? extends D> collection) {
        if (this.b.b() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet c2 = C7089ovb.c(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2.add(a((D) (C5272Rcb) it.next()));
        }
        return c2;
    }

    public Collection<? extends C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return a(this.e.a(xnb, dfb));
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return c();
    }

    public Set<C7694xnb> a() {
        return this.e.a();
    }
}
