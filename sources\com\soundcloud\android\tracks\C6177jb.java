package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.tracks.jb reason: case insensitive filesystem */
/* compiled from: TrackStorage.kt */
final class C6177jb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Ya a;
    final /* synthetic */ List b;

    C6177jb(Ya ya, List list) {
        this.a = ya;
        this.b = list;
    }

    /* renamed from: a */
    public final IPa<List<C3509cea>> apply(Set<C3508cda> set) {
        C7471uYa.b(set, "it");
        return this.a.e(this.b).r().e(new C6174ib(this));
    }
}
