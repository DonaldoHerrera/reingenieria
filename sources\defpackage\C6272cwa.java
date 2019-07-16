package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cwa reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C6272cwa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ String a;

    C6272cwa(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public final List<C4882Eva> apply(List<C3784hea> list) {
        C7471uYa.b(list, "users");
        ArrayList<C3784hea> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (Hxb.a((CharSequence) ((C3784hea) next).c, (CharSequence) this.a, true)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C3784hea hea : arrayList) {
            arrayList2.add(C4882Eva.a(hea.a, hea.c, C4928GKa.b(hea.l), hea.g(), a.Following));
        }
        return arrayList2;
    }
}
