package com.soundcloud.android.ads.injector;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.ads.G;
import com.soundcloud.android.foundation.ads.H;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: AdInjectionPreferencesFragment.kt */
final class e extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ q a;
    final /* synthetic */ s b;

    e(q qVar, s sVar) {
        this.a = qVar;
        this.b = sVar;
        super(0);
    }

    public final void d() {
        Na Rb = this.b.Rb();
        q qVar = this.a;
        C7471uYa.a((Object) qVar, "this");
        if (qVar instanceof F) {
            Rb.a((F) qVar, (G) H.a(this.b.Sb().b(), (C3508cda) null, 1, (Object) null));
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
