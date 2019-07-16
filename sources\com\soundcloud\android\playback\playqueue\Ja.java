package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueueOperations.kt */
final class Ja<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Ma a;
    final /* synthetic */ List b;

    Ja(Ma ma, List list) {
        this.a = ma;
        this.b = list;
    }

    /* renamed from: a */
    public final List<eb> apply(Map<C3508cda, ? extends C6185ma> map) {
        C7471uYa.b(map, "it");
        return this.a.a(this.b, map);
    }
}
