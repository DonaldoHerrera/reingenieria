package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemRepository.kt */
final class C7701xra<T, R> implements C7118pQa<T, R> {
    public static final C7701xra a = new C7701xra();

    C7701xra() {
    }

    /* renamed from: a */
    public final Map<C3508cda, Eda> apply(List<? extends Eda> list) {
        C7471uYa.b(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable<? extends T>) list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((Eda) next).v(), next);
        }
        return linkedHashMap;
    }
}
