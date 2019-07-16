package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Tva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C5340Tva<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ String a;

    C5340Tva(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public final List<C4882Eva> apply(HVa<? extends List<C3837oba>, ? extends Map<C3508cda, C3784hea>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        List<C3837oba> list = (List) hVa.a();
        Map map = (Map) hVa.b();
        C7471uYa.a((Object) list, "followings");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C3837oba oba : list) {
            arrayList.add(NVa.a(oba, map.get(oba.c())));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            HVa hVa2 = (HVa) next;
            if (hVa2.d() != null) {
                C3784hea hea = (C3784hea) hVa2.d();
                if (hea != null) {
                    String str = hea.c;
                    if (str != null && Hxb.a((CharSequence) str, (CharSequence) this.a, true)) {
                        z = true;
                    }
                }
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        List<HVa> a2 = C7676xWa.a((Iterable) arrayList2, (Comparator) new C5311Sva());
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (HVa hVa3 : a2) {
            C3784hea hea2 = (C3784hea) hVa3.d();
            String str2 = null;
            C3508cda cda = hea2 != null ? hea2.a : null;
            C3784hea hea3 = (C3784hea) hVa3.d();
            String str3 = hea3 != null ? hea3.c : null;
            C3784hea hea4 = (C3784hea) hVa3.d();
            if (hea4 != null) {
                str2 = hea4.l;
            }
            C3784hea hea5 = (C3784hea) hVa3.d();
            arrayList3.add(C4882Eva.a(cda, str3, C4928GKa.b(str2), hea5 != null && hea5.g(), a.Following));
        }
        return arrayList3;
    }
}
