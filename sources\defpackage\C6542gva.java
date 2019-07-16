package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import java.util.List;

/* renamed from: gva reason: default package and case insensitive filesystem */
/* compiled from: SearchPresenter.kt */
public final class C6542gva extends C7589wEa<List<? extends C6338dva>, C6973nJa, RVa, RVa, C6678iva> {
    /* access modifiers changed from: private */
    public final C4655rja l;
    private final C3700b m;
    private final HPa n;

    public C6542gva(C4655rja rja, C3700b bVar, HPa hPa) {
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = rja;
        this.m = bVar;
        this.n = hPa;
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.m.a(Yca.SEARCH_MAIN);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<C6338dva>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa c = APa.c(C6918mWa.b((Object[]) new C6338dva[]{new b(), new a()}));
        C7471uYa.a((Object) c, "Observable.just(listOf(S…emViewModel.EmptyCard()))");
        return C7594wJa.a(c, null, 1, null);
    }
}
