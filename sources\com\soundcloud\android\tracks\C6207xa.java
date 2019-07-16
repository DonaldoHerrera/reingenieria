package com.soundcloud.android.tracks;

import java.util.Map;

/* renamed from: com.soundcloud.android.tracks.xa reason: case insensitive filesystem */
/* compiled from: TrackItemRepository.kt */
final class C6207xa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;

    C6207xa(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final C6185ma apply(Map<C3508cda, ? extends C6185ma> map) {
        C7471uYa.b(map, "urnTrackMap");
        return (C6185ma) map.get(this.a);
    }
}
