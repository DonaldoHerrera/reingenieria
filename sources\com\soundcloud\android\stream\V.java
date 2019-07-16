package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class V<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Z a;

    V(Z z) {
        this.a = z;
    }

    /* renamed from: a */
    public final IPa<List<C3919yda>> apply(ia iaVar) {
        C7471uYa.b(iaVar, "syncResult");
        return this.a.a.a(30).r().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new U<Object,Object>(iaVar));
    }
}
