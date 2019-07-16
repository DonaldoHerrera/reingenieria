package defpackage;

import java.io.IOException;

/* renamed from: LJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsRepository.kt */
final class C2145LJ<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C2164MJ a;

    C2145LJ(C2164MJ mj) {
        this.a = mj;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        if (!(th instanceof IOException)) {
            ifa ifa = (ifa) (!(th instanceof ifa) ? null : th);
            if (ifa == null || !ifa.e()) {
                C3469VY a2 = this.a.a.h;
                C7471uYa.a((Object) th, "throwable");
                a.a(a2, th, null, 2, null);
                return;
            }
        }
        SDb.b(th, "Ignore ads fetch exception", new Object[0]);
    }
}
