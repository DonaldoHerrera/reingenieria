package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vqb reason: default package and case insensitive filesystem */
/* compiled from: ChainedMemberScope.kt */
public final class C7562vqb implements Eqb {
    public static final a a = new a(null);
    private final String b;
    private final List<Eqb> c;

    /* renamed from: vqb$a */
    /* compiled from: ChainedMemberScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7562vqb(String str, List<? extends Eqb> list) {
        C7471uYa.b(str, "debugName");
        C7471uYa.b(list, "scopes");
        this.b = str;
        this.c = list;
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        List<Eqb> list = this.c;
        if (list.isEmpty()) {
            return SWa.a();
        }
        Collection collection = null;
        for (Eqb a2 : list) {
            collection = C7020nvb.a(collection, a2.a(xnb, dfb));
        }
        if (collection != null) {
            return collection;
        }
        return SWa.a();
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        C5122Mcb mcb = null;
        for (Eqb b2 : this.c) {
            C5122Mcb b3 = b2.b(xnb, dfb);
            if (b3 != null) {
                if (!(b3 instanceof C5152Ncb) || !((C5152Ncb) b3).p()) {
                    return b3;
                }
                if (mcb == null) {
                    mcb = b3;
                }
            }
        }
        return mcb;
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        List<Eqb> list = this.c;
        if (list.isEmpty()) {
            return SWa.a();
        }
        Collection collection = null;
        for (Eqb c2 : list) {
            collection = C7020nvb.a(collection, c2.c(xnb, dfb));
        }
        if (collection != null) {
            return collection;
        }
        return SWa.a();
    }

    public String toString() {
        return this.b;
    }

    public Set<C7694xnb> b() {
        List<Eqb> list = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Eqb b2 : list) {
            C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) b2.b());
        }
        return linkedHashSet;
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        List<Eqb> list = this.c;
        if (list.isEmpty()) {
            return SWa.a();
        }
        Collection collection = null;
        for (Eqb a2 : list) {
            collection = C7020nvb.a(collection, a2.a(xqb, _xa));
        }
        if (collection != null) {
            return collection;
        }
        return SWa.a();
    }

    public Set<C7694xnb> a() {
        List<Eqb> list = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Eqb a2 : list) {
            C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) a2.a());
        }
        return linkedHashSet;
    }
}
