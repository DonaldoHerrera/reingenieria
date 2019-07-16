package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: QHa reason: default package and case insensitive filesystem */
/* compiled from: RepoUtils.kt */
final class C5233QHa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;
    final /* synthetic */ C6308dYa b;

    C5233QHa(List list, C6308dYa dya) {
        this.a = list;
        this.b = dya;
    }

    /* renamed from: a */
    public final ArrayList<Aggregate> apply(Map<C3508cda, ? extends Properties> map) {
        C7471uYa.b(map, "urnEntityMap");
        ArrayList<Aggregate> arrayList = new ArrayList<>(this.a.size());
        List list = this.a;
        ArrayList<C3759eda> arrayList2 = new ArrayList<>();
        for (Object next : list) {
            if (map.containsKey(((C3759eda) next).c())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) arrayList2, 10));
        for (C3759eda eda : arrayList2) {
            arrayList3.add(Boolean.valueOf(arrayList.add(this.b.invoke(LWa.b(map, eda.c()), eda))));
        }
        return arrayList;
    }
}
