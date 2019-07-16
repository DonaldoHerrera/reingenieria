package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C7628wpa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    C7628wpa(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final Ida<Eda> apply(List<? extends Eda> list) {
        C7471uYa.b(list, "found");
        List list2 = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (Eda v : list) {
            arrayList.add(v.v());
        }
        List c = C7676xWa.c((Iterable<? extends T>) list2, (Iterable<? extends T>) arrayList);
        if (c.isEmpty()) {
            return c.a.a(list);
        }
        return b.a.a(list, c, null);
    }
}
