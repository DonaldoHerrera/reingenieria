package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class J<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ List b;

    J(Z z, List list) {
        this.a = z;
        this.b = list;
    }

    /* renamed from: a */
    public final IPa<Integer> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        return this.a.c(this.b);
    }
}
