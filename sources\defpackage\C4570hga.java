package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: hga reason: default package and case insensitive filesystem */
/* compiled from: TombstoneNetworkFetcher.kt */
final class C4570hga<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4586jga a;
    final /* synthetic */ Set b;

    C4570hga(C4586jga jga, Set set) {
        this.a = jga;
        this.b = set;
    }

    /* renamed from: a */
    public final IPa<? extends C3953bga<Key, Model>> apply(Set<C4554fga<Key>> set) {
        C7471uYa.b(set, "tombstones");
        Set set2 = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) set, 10));
        for (C4554fga a2 : set) {
            arrayList.add(a2.a());
        }
        Set a3 = TWa.a(set2, (Iterable) arrayList);
        if (!a3.isEmpty()) {
            return this.a.a.a(a3);
        }
        IPa<? extends C3953bga<Key, Model>> a4 = IPa.a(new b(new C3945aga(C6918mWa.a(), set)));
        C7471uYa.a((Object) a4, "Single.just(\n           …s))\n                    )");
        return a4;
    }
}
