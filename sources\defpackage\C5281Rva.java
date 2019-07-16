package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Rva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5281Rva<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6884lwa a;

    C5281Rva(C6884lwa lwa) {
        this.a = lwa;
    }

    /* renamed from: a */
    public final IPa<HVa<List<C3837oba>, Map<C3508cda, C3784hea>>> apply(List<C3837oba> list) {
        C7471uYa.b(list, "followings");
        C3792iea c = this.a.f;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3837oba c2 : list) {
            arrayList.add(c2.c());
        }
        return c.a((List<C3508cda>) arrayList).g().e(new C5251Qva(list));
    }
}
