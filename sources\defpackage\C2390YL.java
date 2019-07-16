package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d.e.c;
import com.soundcloud.android.foundation.events.C3702d.e.k;
import com.soundcloud.android.foundation.events.C3702d.e.n;
import com.soundcloud.android.foundation.events.C3702d.e.q;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.h;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;

/* renamed from: YL reason: default package and case insensitive filesystem */
/* compiled from: EngagementsTracking */
public class C2390YL {
    private final C3760eea a;
    private final C3792iea b;
    private final C3700b c;

    public C2390YL(C3760eea eea, C3792iea iea, C3700b bVar) {
        this.a = eea;
        this.b = iea;
        this.c = bVar;
    }

    private static C7118pQa<C3509cea, K> b(C3508cda cda, boolean z, C3710l lVar, PromotedSourceInfo promotedSourceInfo, h hVar) {
        C2089IK ik = new C2089IK(z, cda, lVar, promotedSourceInfo, hVar);
        return ik;
    }

    private static C7118pQa<C3784hea, K> a(boolean z, C3710l lVar) {
        return new C2108JK(z, lVar);
    }

    public void a(C3508cda cda, boolean z, C3710l lVar, PromotedSourceInfo promotedSourceInfo, h hVar) {
        this.c.a(z ? k.c : n.c);
        APa g = Nda.a(this.a.a(cda, a.SYNC_MISSING)).f(b(cda, z, lVar, promotedSourceInfo, hVar)).g();
        C3700b bVar = this.c;
        bVar.getClass();
        g.f((C6776kQa<? super T>) new C1970CK<Object>(bVar));
    }

    public void a(C3508cda cda, boolean z, C3710l lVar) {
        this.c.a(z ? c.c : q.c);
        APa g = this.b.b(cda).f(a(z, lVar)).g();
        C3700b bVar = this.c;
        bVar.getClass();
        g.f((C6776kQa<? super T>) new C1970CK<Object>(bVar));
    }
}
