package defpackage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: zpb reason: default package and case insensitive filesystem */
/* compiled from: overridingUtils.kt */
public final class C7836zpb {
    public static final <H> Collection<H> a(Collection<? extends H> collection, _Xa<? super H, ? extends C4904Fcb> _xa) {
        C7471uYa.b(collection, "$this$selectMostSpecificInEachOverridableGroup");
        C7471uYa.b(_xa, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Gvb a = Gvb.b.a();
        while (!linkedList.isEmpty()) {
            Object f = C7676xWa.f((List<? extends T>) linkedList);
            Gvb a2 = Gvb.b.a();
            Collection a3 = C7629wpb.a(f, (Collection<H>) linkedList, _xa, (_Xa<H, RVa>) new C7767ypb<H,RVa>(a2));
            C7471uYa.a((Object) a3, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            if (a3.size() != 1 || !a2.isEmpty()) {
                Object a4 = C7629wpb.a(a3, _xa);
                C7471uYa.a(a4, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                C4904Fcb fcb = (C4904Fcb) _xa.invoke(a4);
                for (Object next : a3) {
                    C7471uYa.a(next, "it");
                    if (!C7629wpb.c(fcb, (C4904Fcb) _xa.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(a4);
            } else {
                Object m = C7676xWa.m(a3);
                C7471uYa.a(m, "overridableGroup.single()");
                a.add(m);
            }
        }
        return a;
    }

    public static final <D extends C4904Fcb> void a(Collection<D> collection) {
        C7471uYa.b(collection, "$this$retainMostSpecificInEachOverridableGroup");
        Collection a = a(collection, C7698xpb.a);
        if (collection.size() != a.size()) {
            collection.retainAll(a);
        }
    }
}
