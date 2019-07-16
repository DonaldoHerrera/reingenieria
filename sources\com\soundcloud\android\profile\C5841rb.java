package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.F;
import java.util.List;

/* renamed from: com.soundcloud.android.profile.rb reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter.kt */
public final class C5841rb extends C7589wEa<List<? extends C5797ib>, C6973nJa, C5817mb, C5817mb, C5851tb> {
    private final Lc l;
    private final C4655rja m;
    private final F n;
    private final HPa o;

    public C5841rb(Lc lc, C4655rja rja, F f, HPa hPa) {
        C7471uYa.b(lc, "profileOperations");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = lc;
        this.m = rja;
        this.n = f;
        this.o = hPa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<C5797ib>>> b(C5817mb mbVar) {
        C7471uYa.b(mbVar, "pageParams");
        APa h = this.l.f(mbVar.b()).j().h(new C5837qb(mbVar));
        C7471uYa.a((Object) h, "profileOperations.userPr….searchQuerySourceInfo) }");
        return C7594wJa.a(h, null, 1, null);
    }

    public final C4655rja f() {
        return this.m;
    }

    public final F g() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, List<C5797ib>>> c(C5817mb mbVar) {
        C7471uYa.b(mbVar, "pageParams");
        return b(mbVar);
    }

    public void a(C5851tb tbVar) {
        C7471uYa.b(tbVar, "view");
        super.a(tbVar);
        UPa b = b();
        VPa f = tbVar.Ja().f((C6776kQa<? super T>) new C5822nb<Object>(this));
        C7471uYa.a((Object) f, "view.followersClickListe…earchQuerySourceInfo))) }");
        XUa.a(b, f);
        UPa b2 = b();
        VPa f2 = tbVar.Ea().f((C6776kQa<? super T>) new C5827ob<Object>(this));
        C7471uYa.a((Object) f2, "view.followingsClickList…earchQuerySourceInfo))) }");
        XUa.a(b2, f2);
        UPa b3 = b();
        VPa f3 = tbVar.Ha().f((C6776kQa<? super T>) new C5832pb<Object>(this));
        C7471uYa.a((Object) f3, "view.linkClickListener.s…OMMENDATIONS)))\n        }");
        XUa.a(b3, f3);
    }
}
