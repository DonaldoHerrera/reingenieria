package com.soundcloud.android.stream;

import com.soundcloud.android.stream.rb.b;

/* compiled from: StreamPresenter.kt */
final class eb<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ ib a;

    eb(ib ibVar) {
        this.a = ibVar;
    }

    /* renamed from: a */
    public final APa<sb> apply(b bVar) {
        C7471uYa.b(bVar, "it");
        int i = Ca.a[bVar.ordinal()];
        if (i == 1) {
            return this.a.m.b();
        }
        if (i == 2) {
            return this.a.m.a(true);
        }
        throw new FVa();
    }
}
