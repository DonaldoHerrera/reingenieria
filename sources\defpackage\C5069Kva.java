package defpackage;

import com.soundcloud.android.collections.data.C2852h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Kva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5069Kva<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6884lwa a;

    C5069Kva(C6884lwa lwa) {
        this.a = lwa;
    }

    /* renamed from: a */
    public final IPa<List<HVa<Eda, C2852h>>> apply(List<? extends C2852h> list) {
        C7471uYa.b(list, "source");
        Fda a2 = this.a.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C2852h a3 : list) {
            arrayList.add(a3.a());
        }
        IPa e = a2.a((List<C3508cda>) arrayList).g().e(C4975Hva.a).e(C5006Iva.a);
        C7471uYa.a((Object) e, "playlistRepository.playl…                        }");
        return C5263RHa.a(list, e, C5038Jva.a);
    }
}
