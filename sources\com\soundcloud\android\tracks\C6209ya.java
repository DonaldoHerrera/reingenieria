package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.tracks.ya reason: case insensitive filesystem */
/* compiled from: TrackItemRepository.kt */
final class C6209ya<T, R> implements C7118pQa<Throwable, EPa<? extends Map<C3508cda, ? extends C3509cea>>> {
    final /* synthetic */ Ca a;
    final /* synthetic */ boolean b;
    final /* synthetic */ List c;

    C6209ya(Ca ca, boolean z, List list) {
        this.a = ca;
        this.b = z;
        this.c = list;
    }

    /* renamed from: a */
    public final EPa<? extends Map<C3508cda, C3509cea>> apply(Throwable th) {
        C7471uYa.b(th, "it");
        if (this.b) {
            return this.a.a(this.c, a.LOCAL_ONLY);
        }
        return APa.b(th);
    }
}
