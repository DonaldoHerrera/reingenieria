package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: IFa reason: default package and case insensitive filesystem */
/* compiled from: Observables.kt */
public final class C4985IFa<T1, T2, R> implements C6504gQa<T1, T2, R> {
    final /* synthetic */ C5141NFa a;

    public C4985IFa(C5141NFa nFa) {
        this.a = nFa;
    }

    public final R apply(T1 t1, T2 t2) {
        C3400zR zRVar = (C3400zR) t2;
        List<C3784hea> list = (List) t1;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3784hea hea : list) {
            arrayList.add(this.a.a().a(hea, zRVar.a(hea.a)));
        }
        R linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) arrayList, 10)), 16));
        for (Object next : arrayList) {
            linkedHashMap.put(((C4954HFa) next).a(), next);
        }
        return linkedHashMap;
    }
}
