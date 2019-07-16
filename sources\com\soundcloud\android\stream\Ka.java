package com.soundcloud.android.stream;

import com.soundcloud.android.ads.C2617ra;
import com.soundcloud.android.ads.C2617ra.a;
import com.soundcloud.android.ads.C2617ra.b;
import com.soundcloud.android.ads.C2617ra.c;
import com.soundcloud.android.ads.C2617ra.d;

/* compiled from: StreamPresenter.kt */
final class Ka<T> implements C6776kQa<C2617ra> {
    final /* synthetic */ ib a;

    Ka(ib ibVar) {
        this.a = ibVar;
    }

    /* renamed from: a */
    public final void accept(C2617ra raVar) {
        if (raVar instanceof a) {
            this.a.a(((a) raVar).a());
        } else if (raVar instanceof d) {
            this.a.a(((d) raVar).a());
        } else if (raVar instanceof b) {
            this.a.a(((b) raVar).a());
        } else if (raVar instanceof c) {
            c cVar = (c) raVar;
            this.a.a(cVar.a(), cVar.c(), cVar.b());
        }
    }
}
