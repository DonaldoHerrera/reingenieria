package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3680g;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: AdsOperations.kt */
final class Ya extends C7540vYa implements _Xa<C3680g, RVa> {
    final /* synthetic */ Na a;
    final /* synthetic */ String b;
    final /* synthetic */ Fa c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ q f;

    Ya(Na na, String str, Fa fa, boolean z, boolean z2, q qVar) {
        this.a = na;
        this.b = str;
        this.c = fa;
        this.d = z;
        this.e = z2;
        this.f = qVar;
        super(1);
    }

    public final void a(C3680g gVar) {
        C7471uYa.b(gVar, "apiAds");
        b a2 = SDb.a("ScAds");
        StringBuilder sb = new StringBuilder();
        sb.append("Retrieved ads via ");
        sb.append(this.b);
        sb.append(": ");
        sb.append(gVar.i());
        a2.d(sb.toString(), new Object[0]);
        this.a.a(gVar, this.c, this.b, this.d, this.e, this.f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C3680g) obj);
        return RVa.a;
    }
}
