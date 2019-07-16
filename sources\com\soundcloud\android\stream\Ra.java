package com.soundcloud.android.stream;

import com.soundcloud.android.stream.vb.a;
import com.soundcloud.android.stream.vb.b;
import com.soundcloud.android.stream.vb.c;

/* compiled from: StreamPresenter.kt */
final class Ra<T> implements C6776kQa<vb> {
    final /* synthetic */ ib a;

    Ra(ib ibVar) {
        this.a = ibVar;
    }

    /* renamed from: a */
    public final void accept(vb vbVar) {
        if (vbVar instanceof c) {
            this.a.o.f();
        } else if (vbVar instanceof a) {
            this.a.o.a(false);
        } else if (vbVar instanceof b) {
            this.a.o.a(true);
        }
    }
}
