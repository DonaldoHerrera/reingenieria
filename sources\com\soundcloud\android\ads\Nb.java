package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.N;
import com.soundcloud.android.foundation.ads.ca;

/* compiled from: HtmlLeaveBehindPresenter.kt */
final class Nb<T> implements C6776kQa<C2407ZJ> {
    final /* synthetic */ Lb a;
    final /* synthetic */ N b;

    Nb(Lb lb, N n) {
        this.a = lb;
        this.b = n;
    }

    /* renamed from: a */
    public final void accept(C2407ZJ zj) {
        if (zj instanceof c) {
            this.a.g.a(((c) zj).a());
        } else if (zj instanceof b) {
            this.a.g.a();
        } else if (zj instanceof a) {
            this.a.g.a((ca) this.b);
        }
    }
}
