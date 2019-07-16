package com.soundcloud.android.ads.data;

import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.a.C0092a;
import java.util.List;

/* compiled from: VideoAdStorage.kt */
final class k<T> implements C6776kQa<List<? extends h>> {
    final /* synthetic */ t a;

    k(t tVar) {
        this.a = tVar;
    }

    /* renamed from: a */
    public final void accept(List<h> list) {
        if (list.size() > 1) {
            this.a.c.a((C3702d) new C0092a(list.size()));
        }
    }
}
