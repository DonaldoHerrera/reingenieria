package com.soundcloud.android.ads.injector;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: AdInjectionPreferencesFragment.kt */
final class c extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ q a;
    final /* synthetic */ s b;

    c(q qVar, s sVar) {
        this.a = qVar;
        this.b = sVar;
        super(0);
    }

    public final void d() {
        Na Rb = this.b.Rb();
        q qVar = this.a;
        C7471uYa.a((Object) qVar, "this");
        if (qVar instanceof F) {
            Rb.a((F) qVar, this.b.Sb().a(this.b.Xb(), this.b.Vb(), this.b.Yb(), this.b.Wb(), this.b.Zb()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(qVar);
        sb.append(" not of type ");
        sb.append(F.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
