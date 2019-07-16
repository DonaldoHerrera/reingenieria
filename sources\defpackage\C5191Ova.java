package defpackage;

import com.soundcloud.android.collections.data.C2852h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ova reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5191Ova<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6884lwa a;

    C5191Ova(C6884lwa lwa) {
        this.a = lwa;
    }

    /* renamed from: a */
    public final IPa<List<HVa<C3509cea, C2852h>>> apply(List<? extends C2852h> list) {
        C7471uYa.b(list, "source");
        C3760eea b = this.a.c;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C2852h a2 : list) {
            arrayList.add(a2.a());
        }
        IPa g = QV.a(b.a((List<C3508cda>) arrayList, a.SYNC_MISSING)).h(C5131Mva.a).g();
        C7471uYa.a((Object) g, "trackRepository\n        …          .firstOrError()");
        return C5263RHa.a(list, g, C5161Nva.a);
    }
}
