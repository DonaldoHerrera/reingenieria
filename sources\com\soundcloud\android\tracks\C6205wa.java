package com.soundcloud.android.tracks;

import java.util.Map;

/* renamed from: com.soundcloud.android.tracks.wa reason: case insensitive filesystem */
/* compiled from: TrackItemRepository.kt */
final class C6205wa<T> implements C7256rQa<Map<C3508cda, ? extends C6185ma>> {
    final /* synthetic */ C3508cda a;

    C6205wa(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final boolean test(Map<C3508cda, ? extends C6185ma> map) {
        C7471uYa.b(map, "urnTrackMap");
        return map.containsKey(this.a);
    }
}
