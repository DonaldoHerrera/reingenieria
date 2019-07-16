package com.soundcloud.android.offline;

import java.util.List;

/* renamed from: com.soundcloud.android.offline.hd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4099hd<T1, T2, R> implements C6504gQa<List<? extends C3508cda>, Boolean, Hc> {
    final /* synthetic */ C3823mda a;

    C4099hd(C3823mda mda) {
        this.a = mda;
    }

    /* renamed from: a */
    public final Hc apply(List<C3508cda> list, Boolean bool) {
        C7471uYa.b(list, "playlists");
        C7471uYa.b(bool, "isOfflineLikedTracks");
        return new Hc(this.a, list, bool.booleanValue());
    }
}
