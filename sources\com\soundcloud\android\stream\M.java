package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ia;
import java.util.List;

/* compiled from: StreamDataSource.kt */
final class M<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ N a;

    M(N n) {
        this.a = n;
    }

    /* renamed from: a */
    public final IPa<List<C3919yda>> apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        if (iaVar.a()) {
            return IPa.b((Throwable) iaVar.f().b());
        }
        return this.a.a.a.a(this.a.b.getTime(), 30).r();
    }
}
