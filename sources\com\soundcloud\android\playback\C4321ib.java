package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.playback.ib reason: case insensitive filesystem */
/* compiled from: PlayQueueFactory.kt */
final class C4321ib<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4326jb a;
    final /* synthetic */ List b;

    C4321ib(C4326jb jbVar, List list) {
        this.a = jbVar;
        this.b = list;
    }

    /* renamed from: a */
    public final o apply(Map<C3508cda, Boolean> map) {
        C7471uYa.b(map, "blockedUrnsMap");
        return o.a(this.b, this.a.b, map);
    }
}
