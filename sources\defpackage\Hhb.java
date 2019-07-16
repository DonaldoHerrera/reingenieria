package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: Hhb reason: default package */
/* compiled from: LazyJavaClassMemberScope.kt */
final class Hhb extends C7540vYa implements PXa<Map<C7694xnb, ? extends Rib>> {
    final /* synthetic */ Mhb a;

    Hhb(Mhb mhb) {
        this.a = mhb;
        super(0);
    }

    public final Map<C7694xnb, Rib> d() {
        Collection p = this.a.o.p();
        ArrayList arrayList = new ArrayList();
        for (Object next : p) {
            if (((Rib) next).w()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put(((Rib) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
