package com.soundcloud.android.comments;

import com.soundcloud.android.comments.C2921y.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: CommentsPresenter.kt */
public class W {
    private final C6713jVa<C4928GKa<a>> a;
    /* access modifiers changed from: private */
    public final C5141NFa b;
    private final Ica c;

    public W(C5141NFa nFa, Ica ica) {
        C7471uYa.b(nFa, "userItemRepository");
        C7471uYa.b(ica, "sessionProvider");
        this.b = nFa;
        this.c = ica;
        C6713jVa<C4928GKa<a>> f = C6713jVa.f(C4928GKa.a());
        C7471uYa.a((Object) f, "BehaviorSubject.createDefault(Optional.absent())");
        this.a = f;
    }

    public C6713jVa<C4928GKa<a>> a() {
        return this.a;
    }

    public APa<T> a(C c2) {
        C7471uYa.b(c2, "commentsDomainModel");
        APa<T> d = this.c.b().d((C7118pQa<? super T, ? extends EPa<? extends R>>) new V<Object,Object>(this, c2));
        C7471uYa.a((Object) d, "sessionProvider.currentU…             })\n        }");
        return d;
    }

    public void a(C4928GKa<a> gKa) {
        C7471uYa.b(gKa, "commentItem");
        a().a(gKa);
    }

    /* access modifiers changed from: private */
    public long a(C c2, C4928GKa<a> gKa) {
        return gKa.c() ? ((a) gKa.b()).g() : Math.max(c2.d(), 0);
    }

    /* access modifiers changed from: private */
    public List<a> a(C c2, Map<C3508cda, C4954HFa> map, C4928GKa<a> gKa, C3508cda cda) {
        List<C3791ida> a2 = c2.a();
        ArrayList arrayList = new ArrayList();
        for (C3791ida ida : a2) {
            C4954HFa hFa = (C4954HFa) map.get(ida.b());
            a aVar = hFa != null ? new a(ida.e(), ida.a(), hFa.f(), hFa.g(), ida.d(), ida.c().getTime(), hFa.a(), hFa.b(), ida.f(), gKa.c() && C7471uYa.a((Object) ida.e(), (Object) ((a) gKa.b()).h()) && !((a) gKa.b()).m(), a(ida, hFa.f(), cda, c2.f(), c2.g()), a(ida, c2.g())) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private C2890i a(C3791ida ida, String str, C3508cda cda, C3508cda cda2, C3508cda cda3) {
        return C2890i.a.a(ida.e(), ida.b(), str, ida.d(), cda, cda2, cda3);
    }

    private C2892j a(C3791ida ida, C3508cda cda) {
        return new C2892j(ida.e(), ida.b());
    }
}
