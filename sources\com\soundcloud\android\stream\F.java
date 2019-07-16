package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;

/* compiled from: StreamDataSource.kt */
final class F<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ boolean b;

    F(Z z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* renamed from: a */
    public final APa<sb> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        return this.a.a(iaVar, this.b);
    }
}
