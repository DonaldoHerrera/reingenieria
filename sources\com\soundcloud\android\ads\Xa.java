package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3680g;
import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: AdsOperations.kt */
final class Xa extends C7540vYa implements _Xa<Throwable, RVa> {
    final /* synthetic */ Na a;
    final /* synthetic */ String b;
    final /* synthetic */ Fa c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ q f;

    Xa(Na na, String str, Fa fa, boolean z, boolean z2, q qVar) {
        this.a = na;
        this.b = str;
        this.c = fa;
        this.d = z;
        this.e = z2;
        this.f = qVar;
        super(1);
    }

    public final void a(Throwable th) {
        C7471uYa.b(th, "throwable");
        b a2 = SDb.a("ScAds");
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to retrieve ads via ");
        sb.append(this.b);
        a2.a(th, sb.toString(), new Object[0]);
        if (!(th instanceof ifa) || ((ifa) th).j() != a.NOT_FOUND) {
            this.a.a(this.c, this.b, this.d, this.e, this.f);
            return;
        }
        this.a.a((C3680g) new C3686m(C6918mWa.a()), this.c, this.b, this.d, this.e, this.f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return RVa.a;
    }
}
