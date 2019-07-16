package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Poa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistPresenter.kt */
final class C5214Poa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5244Qoa a;

    C5214Poa(C5244Qoa qoa) {
        this.a = qoa;
    }

    /* renamed from: a */
    public final List<C5333Toa> apply(List<a> list) {
        C7471uYa.b(list, "playlists");
        List a2 = C6850lWa.a(b.b);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (a a3 : list) {
            arrayList.add(a.a(a3, null, null, 0, false, false, false, this.a.n.l(), 63, null));
        }
        return C7676xWa.c((Collection) a2, (Iterable) arrayList);
    }
}
