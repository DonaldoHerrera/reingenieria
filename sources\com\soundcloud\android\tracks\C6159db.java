package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.tracks.db reason: case insensitive filesystem */
/* compiled from: TrackStorage.kt */
final class C6159db<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    C6159db(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final Set<C3508cda> apply(List<C3508cda> list) {
        C7471uYa.b(list, "changedTracks");
        return C7676xWa.b((Iterable) list, (Iterable) this.a);
    }
}
