package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class U<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ ia a;

    U(ia iaVar) {
        this.a = iaVar;
    }

    /* renamed from: a */
    public final IPa<List<C3919yda>> apply(List<C3919yda> list) {
        C7471uYa.b(list, "it");
        if (!list.isEmpty() || !this.a.a()) {
            return IPa.a(list);
        }
        return IPa.b((Throwable) this.a.f().b());
    }
}
