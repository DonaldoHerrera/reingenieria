package com.soundcloud.android.search.history;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.search.history.s.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SearchHistoryPresenter.kt */
public final class y extends C7589wEa<List<? extends s>, C6973nJa, RVa, RVa, J> {
    private C6781kVa<String> l;
    private C6781kVa<String> m;
    /* access modifiers changed from: private */
    public final A n;
    /* access modifiers changed from: private */
    public final C3700b o;
    /* access modifiers changed from: private */
    public final F p;
    private final HPa q;

    public y(A a, C3700b bVar, F f, HPa hPa) {
        C7471uYa.b(a, "searchHistoryStorage");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.n = a;
        this.o = bVar;
        this.p = f;
        this.q = hPa;
        C6781kVa<String> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.l = s;
        C6781kVa<String> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.m = s2;
    }

    public final C6781kVa<String> f() {
        return this.m;
    }

    public final C6781kVa<String> g() {
        return this.l;
    }

    public void a(J j) {
        C7471uYa.b(j, "view");
        super.a(j);
        UPa b = b();
        GPa c = j.xa().c(C5220Pua.a((C6776kQa<T>) new u<T>(this)));
        C7471uYa.a((Object) c, "view.autocompleteArrowCl…it.searchTerm)\n        })");
        XUa.a(b, (VPa) c);
        UPa b2 = b();
        GPa c2 = j.Oa().c(C5220Pua.a((C6776kQa<T>) new v<T>(this)));
        C7471uYa.a((Object) c2, "view.itemClickListener.s…it.searchTerm)\n        })");
        XUa.a(b2, (VPa) c2);
        UPa b3 = b();
        GPa c3 = j.Ia().c(C5220Pua.a((C6776kQa<T>) new w<T>(this)));
        C7471uYa.a((Object) c3, "view.clearHistoryClickLi…torage.clear()\n        })");
        XUa.a(b3, (VPa) c3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<s>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa h = this.n.b().h(new x(this));
        C7471uYa.a((Object) h, "searchHistoryStorage.get…          }\n            }");
        return C7594wJa.a(h, null, 1, null);
    }

    /* access modifiers changed from: private */
    public final List<b> a(List<String> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new b((String) next, i));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList;
    }
}
