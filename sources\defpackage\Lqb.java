package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Lqb reason: default package */
/* compiled from: TypeIntersectionScope.kt */
public final class Lqb extends C7493uqb {
    public static final a a = new a(null);
    private final C7562vqb b;

    /* renamed from: Lqb$a */
    /* compiled from: TypeIntersectionScope.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Eqb a(String str, Collection<? extends C7706xtb> collection) {
            C7471uYa.b(str, "message");
            C7471uYa.b(collection, "types");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
            for (C7706xtb ha : collection) {
                arrayList.add(ha.ha());
            }
            C7562vqb vqb = new C7562vqb(str, arrayList);
            if (collection.size() <= 1) {
                return vqb;
            }
            return new Lqb(vqb, null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    private Lqb(C7562vqb vqb) {
        this.b = vqb;
    }

    @NXa
    public static final Eqb a(String str, Collection<? extends C7706xtb> collection) {
        return a.a(str, collection);
    }

    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return C7836zpb.a(super.a(xnb, dfb), Nqb.a);
    }

    /* access modifiers changed from: protected */
    public C7562vqb c() {
        return this.b;
    }

    public /* synthetic */ Lqb(C7562vqb vqb, C7264rYa rya) {
        this(vqb);
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        Collection a2 = super.a(xqb, _xa);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : a2) {
            if (((C5272Rcb) next) instanceof C4904Fcb) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        HVa hVa = new HVa(arrayList, arrayList2);
        List list = (List) hVa.a();
        List list2 = (List) hVa.b();
        if (list != null) {
            return C7676xWa.c(C7836zpb.a(list, Mqb.a), (Iterable) list2);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return C7836zpb.a(super.c(xnb, dfb), Oqb.a);
    }
}
