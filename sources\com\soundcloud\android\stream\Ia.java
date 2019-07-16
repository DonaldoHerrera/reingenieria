package com.soundcloud.android.stream;

import com.soundcloud.android.upsell.l;
import com.soundcloud.android.upsell.l.a;
import com.soundcloud.android.upsell.l.b;
import com.soundcloud.android.upsell.l.c;

/* compiled from: StreamPresenter.kt */
final class Ia<T> implements C6776kQa<l> {
    final /* synthetic */ ib a;

    Ia(ib ibVar) {
        this.a = ibVar;
    }

    /* renamed from: a */
    public final void accept(l lVar) {
        if (lVar instanceof a) {
            this.a.g();
        } else if (lVar instanceof c) {
            this.a.i();
        } else if (lVar instanceof b) {
            this.a.h();
        }
    }
}
