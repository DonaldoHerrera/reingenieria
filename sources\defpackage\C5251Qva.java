package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Qva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5251Qva<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    C5251Qva(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final HVa<List<C3837oba>, Map<C3508cda, C3784hea>> apply(List<C3784hea> list) {
        C7471uYa.b(list, "it");
        List list2 = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((C3784hea) next).a, next);
        }
        return NVa.a(list2, linkedHashMap);
    }
}
