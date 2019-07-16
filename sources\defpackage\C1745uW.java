package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uW reason: default package and case insensitive filesystem */
/* compiled from: UserStorage.kt */
final class C1745uW<T, R> implements C7118pQa<T, R> {
    public static final C1745uW a = new C1745uW();

    C1745uW() {
    }

    /* renamed from: a */
    public final Map<C3508cda, C3784hea> apply(List<C3784hea> list) {
        C7471uYa.b(list, "users");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((C3784hea) next).a, next);
        }
        return linkedHashMap;
    }
}
