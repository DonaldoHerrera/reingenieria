package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Mva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5131Mva<T, R> implements C7118pQa<T, R> {
    public static final C5131Mva a = new C5131Mva();

    C5131Mva() {
    }

    /* renamed from: a */
    public final Map<C3508cda, C3509cea> apply(List<C3509cea> list) {
        C7471uYa.b(list, "tracks");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((C3509cea) next).y(), next);
        }
        return linkedHashMap;
    }
}
