package com.soundcloud.android.activities;

import java.util.Collection;
import java.util.List;

/* compiled from: ActivitiesPresenter.kt */
public final class t extends C7589wEa<List<? extends B>, C6973nJa, RVa, RVa, A> {
    private final HPa l;
    private final l m;

    public t(HPa hPa, l lVar) {
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(lVar, "activitiesOperations");
        super(hPa);
        this.l = hPa;
        this.m = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, List<B>>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa j = this.m.c().j();
        C7471uYa.a((Object) j, "activitiesOperations.upd…tivities().toObservable()");
        return C7594wJa.a(j, new s(this));
    }

    public void a(A a) {
        C7471uYa.b(a, "view");
        super.a(a);
        b().a(a.ca().h(n.a).f((C6776kQa<? super T>) new o<Object>(a)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<B>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa j = this.m.b().j();
        C7471uYa.a((Object) j, "activitiesOperations.ini…tivities().toObservable()");
        return C7594wJa.a(j, new p(this));
    }

    /* access modifiers changed from: private */
    public final PXa<APa<d<C6973nJa, List<B>>>> a(List<B> list) {
        IPa c = this.m.c(list);
        if (c != null) {
            APa j = c.j();
            if (j != null) {
                return new r(j, this);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public List<B> a(List<B> list, List<B> list2) {
        C7471uYa.b(list, "firstPage");
        C7471uYa.b(list2, "nextPage");
        return C7676xWa.c((Collection) list, (Iterable) list2);
    }
}
