package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Iva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5006Iva<T, R> implements C7118pQa<T, R> {
    public static final C5006Iva a = new C5006Iva();

    C5006Iva() {
    }

    /* renamed from: a */
    public final Map<C3508cda, Eda> apply(List<? extends Eda> list) {
        C7471uYa.b(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((Eda) next).v(), next);
        }
        return linkedHashMap;
    }
}
